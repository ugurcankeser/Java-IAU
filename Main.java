package workingexampleweek6;

import java.io.*;
import java.util.*;

public class Main {

	
	public static void main(String[] args)throws IOException {
		File file1=new File("E:\\users\\ugurcankeser\\desktop\\Student.txt");
		FileWriter fwrite=new FileWriter(file1);
		BufferedWriter bfwrite= new BufferedWriter(fwrite);
		Student std=new Student();
		std.setname();
		std.setsurname();
		std.setNumber();
		std.setdepartmant();
		
		bfwrite.write(std.getname());
		bfwrite.newLine();
		bfwrite.write(std.getsurname());
		bfwrite.newLine();
		bfwrite.write(std.getdepartmant());
		bfwrite.newLine();
		bfwrite.write(std.getNumber());
		bfwrite.newLine();
		bfwrite.close();
		Scanner scn=new Scanner(file1);
		
		while(scn.hasNext()){
			System.out.println(scn.nextLine());
		}
		

	}

}
