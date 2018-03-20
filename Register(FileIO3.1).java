package pack1;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Register {

	ArrayList<Student> students = new ArrayList<Student>();
	
	public void readFile(String fileName, String dept) throws FileNotFoundException{
		
		File file1 = new File("E:\\users\\ssener\\desktop\\"+fileName+".txt");
		//FileReader fread = new FileReader(file1);
		//BufferedReader bfread = new BufferedReader(fread);
		ArrayList<Student> outputStudents = new ArrayList<Student>();
		
		Scanner scan = new Scanner(file1);
		
		while(scan.hasNext()){
			
			Student temp_stu = new Student();
			temp_stu.name=scan.nextLine();
			temp_stu.surname=scan.nextLine();
			
			String dept_temp=scan.nextLine();
			temp_stu.department=dept_temp;
			temp_stu.number=Integer.parseInt(scan.nextLine());
			
			if(dept_temp.equals(dept)){
			
				outputStudents.add(temp_stu);
			}
			
		}
		int i=1;
		for (Student student : outputStudents) {
			
			System.out.println(i+". Student");
			System.out.println("--------------");
			System.out.println(student.getName());
			System.out.println(student.getSurname());
			System.out.println(student.getDepartment());
			System.out.println(student.getNumber());
			System.out.println("--------------");
			i++;
			
		}
	}
	
	public void writeFile(String fileName, ArrayList<Student> students) throws IOException{
		
		File file1 = new File("E:\\users\\ssener\\desktop\\"+fileName+".txt");
		
		FileWriter fwrite = new FileWriter(file1);
		BufferedWriter bfwrite = new BufferedWriter(fwrite);
		
		for (Student student : students) {
			
			bfwrite.write(student.getName());
			bfwrite.newLine();
			bfwrite.write(student.getSurname());
			bfwrite.newLine();
			bfwrite.write(student.getDepartment());
			bfwrite.newLine();
			//String number=String.valueOf(student.getNumber());
			bfwrite.write(String.valueOf(student.getNumber()));
			bfwrite.newLine();	
		}
		bfwrite.close();
	}
	
	public void createStudent(){
		
		Student stu = new Student();
		stu.setName(JOptionPane.showInputDialog("Enter Name"));
		stu.setSurname(JOptionPane.showInputDialog("Enter Surname"));
		stu.setDepartment(JOptionPane.showInputDialog("Enter Department"));
	stu.setNumber(Integer.parseInt(JOptionPane.showInputDialog("Enter Number")));
		
		students.add(stu);
		
	}
	
	
	
	
	public static void main(String[] args) throws IOException {
		
		Register reg_stu = new Register();
		
		/*reg_stu.createStudent();
		reg_stu.createStudent();
		reg_stu.createStudent();*/
		
		/*reg_stu.writeFile("Students", reg_stu.students);*/
		reg_stu.readFile("Students","Computing");
		
		
		
		

	}

}
