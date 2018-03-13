package pack1;

import java.io.*;
import java.util.Scanner;

public class FileIO {

	
	public static void main(String[] args) throws IOException {
		
		File file1 = new File("e:\\users\\ssener\\desktop\\javaIO.txt");
		
		file1.createNewFile();
		
		FileWriter fwrite = new FileWriter(file1);
		
		fwrite.write("JAVA Programming\n");
		fwrite.write("Object Oriented\n");
		fwrite.write("Computer Programmingn\n");
		
		fwrite.flush();
		
		
		fwrite.write("Extra Information\n");
		
		
		fwrite.flush();
		
		
		BufferedWriter bfwrite = new BufferedWriter(fwrite);
		bfwrite.newLine();
		bfwrite.write("This is from BufferedWriter\n");
		
		bfwrite.close();
		
		
		
		Scanner scan = new Scanner(file1);
		
		while(scan.hasNext()){
		
		System.out.println(scan.nextLine());
		
		}
		
		
		
		
		
	}

}
