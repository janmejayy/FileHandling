package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	//buffered reader read data line by line instead of single char like file reader
	//there are two constructor in buffered reader
	//1.BufferedReader br=new bufferedReader(Reader r);
	//2.BufferedReader br=new bufferedReader(Reader r,bufferSize);
public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("name.txt"));
	String line=br.readLine();
	while(line!=null) {
		System.out.println(line);
		line=br.readLine();
	}br.close();
	
}
}
