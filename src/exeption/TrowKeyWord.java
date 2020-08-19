package exeption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TrowKeyWord {

	// FileNotFoundException changed by IOException becz IOException is supper class
	public static void main(String[] args)  {
		
		FileReader fr=null;
		fr= new FileReader("path to file//test.TXT");
		
		BufferedReader bfr= new BufferedReader(fr);
		System.out.println(bfr.readLine());
		
		Thread.sleep(2000);
		
		

	}

}
