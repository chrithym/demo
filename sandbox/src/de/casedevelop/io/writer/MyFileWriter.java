package de.casedevelop.io.writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileWriter {

	private final static Logger LOGGER = Logger.getLogger(MyFileWriter.class.getName());

	public void write(String path, List<String> space) {
		try {
			PrintWriter output = new PrintWriter(path);
			for (int i = 0; i < space.size(); i++) {
				output.println(space.get(i));
			}
			output.close();
		} catch (FileNotFoundException e) {
			LOGGER.log(Level.SEVERE, e.getMessage(), e);
		}
	}

	public static void main(String[] args) {
		List<String> space = new ArrayList<String>();
		space.add("test1");
		space.add("test2");
		space.add("test3");

		MyFileWriter myFileWriter = new MyFileWriter();
		myFileWriter.write("C:/Users/chrithym/Downloads/test.txt", space);
	}
}
