package Lecture32;

import java.io.*;

public class Stream_tokanizer{

	public static void main(String args[]) throws IOException {

		FileReader reader = new FileReader("/Users/pc/desktop/Output.txt");

		BufferedReader bufferread = new BufferedReader(reader);

		StreamTokenizer tokens = new StreamTokenizer(bufferread);

		int t;

		while ((t = tokens.nextToken()) != StreamTokenizer.TT_EOF) {

			switch (t) {

			case StreamTokenizer.TT_NUMBER:
				System.out.println("Num : " + tokens.nval);
				break;

			case StreamTokenizer.TT_WORD:
				System.out.println("Word : " + tokens.sval);
				break;

			}
		}
	}
}