package genel01odevler;

import java.util.Scanner;

public class C1_MutlakDeger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    Scanner scan =new Scanner(System.in);
        
  System.out.print("bir sayi giriniz : ");
  
  int sayi=scan.nextInt();
  
  if(sayi<0) {
	  sayi*=(-1);

  } 
  
  System.out.println("sayýnýzýn mutlak degeri : " + sayi);
  
		scan.close();
	}

}
