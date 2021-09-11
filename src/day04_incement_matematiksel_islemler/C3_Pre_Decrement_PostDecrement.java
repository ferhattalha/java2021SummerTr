package day04_incement_matematiksel_islemler;

public class C3_Pre_Decrement_PostDecrement {

	public static void main(String[] args) {
	
	int sayi1= 20;
	
	int sayi2 = sayi1--;
	
	System.out.println("post-decrement sayi1 : " + sayi1); // 19
	System.out.println("post-decrement sayi2 : " + sayi2); // 20
	
   
	System.out.println(--sayi2); //  19
	System.out.println(sayi2--); //  19
	System.out.println(sayi2);  //   18
	
   
	
	
	}

}
