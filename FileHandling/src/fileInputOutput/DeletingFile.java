package fileInputOutput;


	import java.util.Scanner;
	import java.io.*;

	public class DeletingFile{
	   public static void main(String[] args)
	   {
              String filename;
		      Scanner scan = new Scanner(System.in);
		      
		      System.out.println("Enter the Name of File to Delete: ");
		      filename = scan.nextLine();
	    
	        File file= new File("D:\\java\\eclipse\\ExceptionHandling\\src\\Virtual Key for Your Repositories\\src\\list\\"+filename);
	 
	        if (file.delete()) {
	            System.out.println("File deleted successfully");
	        }
	        else {
	            System.out.println("Failed to delete the file");
	        }
	    }
	}
	