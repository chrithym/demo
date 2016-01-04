package de.casedevelop.io.reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyFileReader {

	private static final Logger LOGGER = Logger.getLogger(MyFileReader.class.getName());

	public List<String> read(String path) {
		List<String> space = new ArrayList<String>();
		BufferedReader in = null;
		File file = new File(path);
		try {
			in = new BufferedReader(new FileReader(file));
			String row = null;
			while ((row = in.readLine()) != null) {
				space.add(row);
			}
		} catch (IOException e) {
			LOGGER.log(Level.SEVERE, "Could not read file!", e);
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					LOGGER.log(Level.SEVERE, "Could not close input stream!", e);
				}
			}
		}
		return space;
	}

	public static void main(String[] args) {
		MyFileReader myFileReader = new MyFileReader();
		List<String> read = myFileReader.read("C:/HaxLogs.txt");
		for (String content : read) {
			System.out.println(content);
		}
	}
}