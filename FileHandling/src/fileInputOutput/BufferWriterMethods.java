package fileInputOutput;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterMethods {
public static void main(String[] args) throws IOException {
	FileWriter fw=new FileWriter("abc.txt");
	BufferedWriter bw=new BufferedWriter(fw);
	bw.write(100);
	bw.newLine();
    bw.write("jay");
    bw.newLine();
    char ch[]= {'h','e','l','l','o'};
    bw.write(ch);
	bw.newLine();
	bw.write("world");
	bw.flush();
	bw.close();
	
}
}
