package workingexampleweek6;

import javax.swing.JOptionPane;

public class Student {

	String name,surname,departmant;
	int number;

	public int getNumber(){
		return number;
	}
	public void setNumber(){
		this.number=Integer.parseInt(JOptionPane.showInputDialog("Enter Number"));
	}
	public String getname(){
		return name;
	}
	public void setname(){
		this.name=JOptionPane.showInputDialog("Enter Name");
	}
	public String getdepartmant(){
		return departmant;
	}
	public void setdepartmant(){
		this.departmant=JOptionPane.showInputDialog("Enter Departmant");
	}
	public String getsurname(){
		return surname;
	}
	public void setsurname(){
		this.surname=JOptionPane.showInputDialog("Enter Surname");
	}
	}
