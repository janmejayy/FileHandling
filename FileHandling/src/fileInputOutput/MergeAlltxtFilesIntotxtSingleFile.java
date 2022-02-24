package fileInputOutput;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeAlltxtFilesIntotxtSingleFile {
public static void main(String[] args) throws IOException {
	PrintWriter pw=new PrintWriter("output.txt");
	File f=new File("D:\\java\\fileIO");
	String []s=f.list();
	for(String s1:s) {
		File f1=new File(f,s1);
		BufferedReader  br=new BufferedReader(new FileReader(f));
	    String line=br.readLine();
	    while(line!=null) {
	    	pw.println(line);
	    	line=br.readLine();
	    }
	    }
	pw.flush();
	
	
}
}
