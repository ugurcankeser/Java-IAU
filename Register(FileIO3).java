package Unit;

import java.io.*;

import java.util.*;

import javax.swing.JOptionPane;


public class Register {

	ArrayList<Student> astd=new ArrayList<Student>();

public void readFile(String fileName) throws FileNotFoundException{
	File file1 = new File("e:\\users\\ugurcankeser\\desktop\\javaIO.txt"+fileName+".txt");
	
	/*FileReader fread=new FileReader(file1);
	
	BufferedReader bfread=new BufferedReader(fread);*/
	
	ArrayList<Student> outputastd=new ArrayList<Student>();
    
	Scanner scn=new Scanner(file1);
   
    while(scn.hasNext()){
    	Student temp_std=new Student();
    	
    	temp_std.name=scn.nextLine();
    	
    	temp_std.surname=scn.nextLine();
    	
    	temp_std.departmant=scn.nextLine();
    	
    	temp_std.number=Integer.parseInt(scn.nextLine());
    	outputastd.add(temp_std);

    }
   int i=1;
    for(Student student:outputastd){
    	
    	System.out.println(i+".Student");
    	System.out.println("----------------");
        System.out.println(student.getName());
        System.out.println(student.getSurname());
        System.out.println(student.getDepartmant());
        System.out.println(student.getNumber());
    	System.out.println("----------------");
    	i++;

    }
}
public void writeFile(String fileName,ArrayList<Student> astd ) throws IOException {
	File file1 = new File("e:\\users\\ugurcankeser\\desktop\\javaIO.txt"+fileName+".txt");
	
	FileWriter fwrite=new FileWriter(file1);
	
	BufferedWriter bfwrite=new BufferedWriter(fwrite);
	
	for(Student student:astd){
		
		bfwrite.write(student.getName());
		bfwrite.newLine();
		
		bfwrite.write(student.getSurname());
		bfwrite.newLine();
		
		bfwrite.write(student.getDepartmant());
		bfwrite.newLine();
		
	
		bfwrite.write (String.valueOf(student.getNumber()));
		bfwrite.newLine();

	}
	bfwrite.close();


}

public void createStudent(){
	Student std=new Student();
	
	std.setName(JOptionPane.showInputDialog("Enter Name"));
	
	std.setSurname(JOptionPane.showInputDialog("Enter Surname"));
	
	std.setDepartmant(JOptionPane.showInputDialog("Enter Departmant"));
	
	std.setNumber(Integer.parseInt((JOptionPane.showInputDialog("Enter Number"))));
	
	astd.add(std);

	
}

public static void main(String[]args) throws IOException{
	

	Register reg_std=new Register();
   
	reg_std.createStudent();
	reg_std.createStudent();
	reg_std.createStudent();




	reg_std.writeFile("Studens",reg_std.astd);
	reg_std.readFile("Studens");
	
	
	
}


}
