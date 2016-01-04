package de.casedevelop.io.xml.writeXML;

import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import de.casedevelop.io.xml.generated.LocationConfiguration;
import de.casedevelop.io.xml.readXML.ReadXML;

public class WriteXML {
	private static final Logger LOGGER = Logger.getLogger(WriteXML.class.getName());

	public void writeXML() {
		ReadXML readXML = new ReadXML();
		LocationConfiguration readXML2 = readXML.readXML();

		try {

			File file = new File("./output.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(LocationConfiguration.class);
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			jaxbMarshaller.marshal(readXML2, file);
		} catch (JAXBException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
	}
}
