package pack1;

public class Outer_Class {

	public Outer_Class(){
		System.out.println("This is from Outer Class");
	}
	
	
	
	public void display(){
		
		class Local_Class{
		
		public Local_Class(){
			System.out.println("This is from Local Class");
		}	
		
		public void show(){
			System.out.println("This is a method from Local class");
		}
	}
		Local_Class local_object = new Local_Class();
		local_object.show();
		
	}
	
	
}
