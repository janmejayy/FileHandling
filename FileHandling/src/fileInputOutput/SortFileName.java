package fileInputOutput;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortFileName {
	public static void main(String[] args) {
		File fileDir = new File("D:\\java\\eclipse\\ExceptionHandling\\src\\Virtual Key for Your Repositories\\src\\list");
		if(fileDir.isDirectory()){
			List <String>listFile = Arrays.asList(fileDir.list());
			Collections.sort(listFile);
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in ascending order");
			for(String s:listFile){
				System.out.println(s);
			}
			System.out.println("---------------------------------------");
			System.out.println("Sorting by filename in descending order");
			Collections.sort(listFile,Collections.reverseOrder());
			for(String s:listFile){
				System.out.println(s);
			}

		}
		else{
			System.out.println(fileDir.getAbsolutePath() + " is not a directory");
		}

	}

}