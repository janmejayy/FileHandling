package fileInputOutput;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String[] args) throws IOException {
	//FileWriter fw=new FileWriter("name.txt");
	FileWriter fw=new FileWriter("list.txt",true);//if you want to append the file
	
	fw.write("hello");
	fw.write('\n');
	fw.write("janmejay yadav");
	fw.write('\n');//for new line
	char[] ch= {'i','l','y'};
	fw.write(ch);
	fw.write('\n');
	fw.flush();
	fw.close();
			//limitaion for file writer
	        //we need to insert \n to print data in next line without these readability of code will be poor
	        //that is why we use bufferWriter
			
}
}
