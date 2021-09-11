package genel01odevler;

import java.util.Scanner;

public class S0replit_01 {

	public static void main(String[] args) {
		

		
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Lütfen üç harfli bir kelime giriniz");
		String kelýme = scan.nextLine();

		if (kelýme.length()!=3) {
			System.out.println("Lütfen üc harfli kelime yazýnýz");
			
	}
 scan.close();
}
}