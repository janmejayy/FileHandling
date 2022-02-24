package fileInputOutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("name.txt");
	int i=fr.read();
	while(i!=-1) {
		System.out.print((char)i);
		i=fr.read();
		fr.close();
	}
}
}
