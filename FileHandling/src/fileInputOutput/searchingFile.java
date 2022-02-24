package fileInputOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class searchingFile {
public static void main(String[] args) throws IOException {
	
System.out.println("Enter the name of the file to Search");
Scanner s1 = new Scanner(System.in);
String folderPath = s1.next();
File file = new File("D:\\java\\eclipse\\ExceptionHandling\\src\\Virtual Key for Your Repositories\\src\\list\\"+folderPath);

if (file.exists()) {
    System.out.println("Yep! File found!");
} else {
    System.out.println("Sorry, File is not here (File Not Found)");
}

try {
    PrintWriter pw = new PrintWriter(file);
    pw.println("saved");
} catch (FileNotFoundException var4) {
    System.out.println(var4);
}
}
}
