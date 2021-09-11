package inheritance02;

public class Runner {

	public static void main(String[] args) {
		
		my_Method();
		
	}
	
	
	public static void my_Method() {
		
		SubClass subC=new SubClass();
		 System.out.println("subclas deðiþken degeri "+subC.num);
		 subC.goster();
		 
		 Super superC=new Super();
		 System.out.println("superclass deðisken degeri "+ superC.num);
		 superC.goster();
		
		
		
	}

}
