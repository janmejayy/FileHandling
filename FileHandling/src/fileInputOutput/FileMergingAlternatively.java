package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergingAlternatively {
public static void main(String[] args) throws IOException {
	PrintWriter pr=new PrintWriter("list.txt");
	BufferedReader bw1=new BufferedReader(new FileReader("name.txt"));
    BufferedReader bw2=new BufferedReader(new FileReader("abc.txt"));
    String line1=bw1.readLine();
    String line2=bw2.readLine();
    while(line1!=null || line2!=null) {
    	if(line1!=null ) {
    	pr.println(line1);
    	line1=bw1.readLine();}
    	if(line2!=null) {
    	pr.println(line2);
    	line2=bw2.readLine();
    	}
    	pr.flush();
    	
    	
    	
    }
    
}
}
