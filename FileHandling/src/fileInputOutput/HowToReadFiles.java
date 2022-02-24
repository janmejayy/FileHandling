package fileInputOutput;

import java.io.File;

public class HowToReadFiles {
	public static void main(String[] args)throws Exception {
		int count=0;
		File f=new File("C:\\Program Files");
		String [] s=f.list();
        for(String s1:s) {
			count++;               //if we want to print all files and folder use this method
			System.out.println(s1); 
        	
        //if you want to print only files 
//        File f1=new File(f,s1);
//        if(f1.isDirectory()) {
//        	count++;
//        	System.out.println(s1);
//      
//        }
	}
        	
		System.out.println("total no "+count);
	}

}
