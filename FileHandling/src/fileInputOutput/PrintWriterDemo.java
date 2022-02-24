package fileInputOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	//to overcome the limitation of file and bufferReader reader we use print writer
	//1.to add new line
	//2.to store different datatype we need to convert into string which slower the performance
	//there are three constructor in print writer
	//1.PrintWriter pw=new PrintWriter(String name);
	//2.PrintWriter pw=new PrintWriter(file);
	//3.PrintWriter pw=new PrintWriter(Writer w);
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("name.txt");
		
		
		pw.println(100);
		pw.write(100);
		pw.println(true);
		pw.println("helloWorld");
		pw.println('j');
		pw.flush();
		pw.close();
		
	}

}
