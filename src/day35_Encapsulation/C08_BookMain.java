package day35_Encapsulation;

import java.util.Scanner;

public class C08_BookMain {

	public static void main(String[] args) {
        
		C07_Book kitap=new C07_Book();
		
		
        Scanner scan = new Scanner(System.in);
        
        System.out.print("son okudugunuz kitab� giriniz : ");
        String kitap2=scan.nextLine();
        kitap.setBookName("�al�ku�u");
        kitap.setAuthorName(kitap2);
        System.out.print("1.kitab�m : "+ kitap.getBookName()+ "ikinci kitab�m : "+kitap2);      
        
	
        
        
        
}
}