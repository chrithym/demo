package de.casedevelop.io.xml.validation;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.xml.sax.SAXException;

public class XMLValidation {

	private static final Logger LOGGER = Logger.getLogger(XMLValidation.class.getName());

	public boolean validateXml(String xsdPath, String xmlFile) {
		boolean valid = false;
		if (xmlFile == null) {
			LOGGER.warning("Could not validate with null path of xml!");
		} else if (xsdPath == null) {
			LOGGER.warning("Could not validate with null path of xsd!");
		} else {
			try {
				SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
				Schema schema = factory.newSchema(new File(xsdPath));
				Validator validator = schema.newValidator();
				validator.validate( new StreamSource( new File( xmlFile ) ) );
				valid = true;
			} catch (SAXException ex) {
				LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
			} catch (IOException ex) {
				LOGGER.log(Level.SEVERE, ex.getMessage(), ex);
			}
		}
		return valid;
	}

	public static void main(String[] args) {
		XMLValidation xmlValidation = new XMLValidation();
		boolean validateXml = xmlValidation.validateXml("./location_config.xsd", "./location_config.xml");
		if (validateXml) {
			LOGGER.info("XML fits to given XSD");
		} else {
			LOGGER.info("XML not fits to given XSD");
		}
	}
}