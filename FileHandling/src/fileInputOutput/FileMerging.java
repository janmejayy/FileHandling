package fileInputOutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerging {
	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter("list.txt");
		BufferedReader br=new BufferedReader(new FileReader("abc.txt"));
		String line=br.readLine();
		while(line!=null) {
			pw.println(line);
			line=br.readLine();
		}
		br=new BufferedReader(new FileReader("name.txt"));
	    line=br.readLine();
	    while(line!=null) {
	    	pw.println(line);
	    	line=br.readLine();
	    	 }
	    pw.flush();
	    br.close();
	    pw.close();
				
	}
	

}
