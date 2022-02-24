package fileInputOutput;
import java.io.*;

public class CreatingNewFile {
	public static void main(String[] args) throws IOException {
		File f=new File("output.txt");
		System.out.println(f.exists());
		//creating new file
		f.createNewFile();
		System.out.println(f.exists());
		
	}

}
