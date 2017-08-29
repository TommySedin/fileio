package se.jalapeno.sjk16g;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class App {
	public static void main( String[] args ) throws IOException {
		System.out.println( "Hello World!" );

		FileOutputStream fos = new FileOutputStream("C:/temp/hej.txt");
		fos.write("Häj höpp i lingonskogen!".getBytes());
		fos.close();
		
		Writer fw = new OutputStreamWriter(
						new BufferedOutputStream(
								new FileOutputStream("C:/temp/hej2.txt")
						), "UTF-8");
		fw.write("Häj höpp i lingonskogen!");
		fw.close();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("C:/temp/hej.txt")));
		while (reader.ready()) {
			System.out.println(reader.readLine());
		}
	}
}
