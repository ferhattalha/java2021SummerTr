package day35_Encapsulation;

import java.util.Scanner;

public class C08_BookMain {

	public static void main(String[] args) {
        
		C07_Book kitap=new C07_Book();
		
		
        Scanner scan = new Scanner(System.in);
        
        System.out.print("son okudugunuz kitabý giriniz : ");
        String kitap2=scan.nextLine();
        kitap.setBookName("çalýkuþu");
        kitap.setAuthorName(kitap2);
        System.out.print("1.kitabým : "+ kitap.getBookName()+ "ikinci kitabým : "+kitap2);      
        
	
        
        
        
}
}