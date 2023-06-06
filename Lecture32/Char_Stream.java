package Lecture32;

import java.io.*;

public class Char_Stream {
	public static void main(String args[]) throws IOException {

		// Creating FileReader object
		File file = new File("/Users/pc/desktop/Output.txt");

		try (FileReader reader = new FileReader(file)) {

			char chars[] = new char[(int) file.length()];

			// Reading data from the file
			reader.read(chars);

			// Writing data to another file
			File out = new File("/Users/pc/desktop/Output1.txt");
			
			try (FileWriter writer = new FileWriter(out)) {

				// Writing data to the file
				writer.write(chars);
				writer.flush();
			}
		}
		System.out.println("Data written successfully");
	}
}
