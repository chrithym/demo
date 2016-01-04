package de.casedevelop.io.xml.readXML;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import de.casedevelop.io.xml.generated.LocationConfiguration;

public class ReadXML {

	private static final Logger LOGGER = Logger.getLogger(ReadXML.class.getName());

	public LocationConfiguration readXML() {
		try {
			File file = new File("./location_config.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(LocationConfiguration.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			LocationConfiguration locationConfiguration = (LocationConfiguration) jaxbUnmarshaller.unmarshal(file);
			return locationConfiguration;
		} catch (JAXBException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
			return null;
		}
	}
}
