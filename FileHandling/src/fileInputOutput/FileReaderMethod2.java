package fileInputOutput;
import java.io.*;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;

public class FileReaderMethod2 {
	//this method is used to read data within int range
public static void main(String[] args) throws IOException{
	File f=new File("name.txt");
	FileReader fr=new FileReader(f);
	char[] ch=new char[(int)(f.length())];
	fr.read(ch);
	for(char c:ch) {
		System.out.print(c);
}
}
}
//limitation
//we have to campare data char by char which is very time consuming
//that is why buffer Reader is recommended to read file by line by line