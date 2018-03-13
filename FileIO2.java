package pack1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileIO2 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		ArrayList<String> cities = new ArrayList<String>();
		
		cities.add("Istanbul");
		cities.add("Ankara");
		cities.add("Izmir");
		cities.add("Bursa");
		cities.add("Antalya");
		
		File file1 = new File("e:\\users\\ssener\\desktop\\javaIO.txt");
		
		FileWriter fwrite = new FileWriter(file1);
		
		/*BufferedWriter bfwrite = new BufferedWriter(fwrite);
		
		for (String city : cities) {
			
			bfwrite.write(city);
			bfwrite.newLine();
			
		}
		bfwrite.close();*/
		
		
		
		PrintWriter pwrite = new PrintWriter(fwrite);
		
		for (String city : cities) {
			
			pwrite.println(city);
		}
		pwrite.close();
		
		
		/*Scanner scan = new Scanner(file1);
		
		
		while(scan.hasNext()){
			System.out.println(scan.nextLine());
		}*/
		
		FileReader fread = new FileReader(file1);
		BufferedReader bfread = new BufferedReader(fread);
		
		String data="";
		String line="";
		
		while((line=bfread.readLine())!=null){
			
			System.out.println(line);
		}
		
		
		
		
		
		
		
	}

}
