package day09_switchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);	
		   
		System.out.println("Lütfen bir tamsayý giriniz : ");
		
        int sayi=scan.nextInt();
       
        switch (sayi) {
	
     case 10 :
    	System.out.println("Ýki basamaklý en kücük sayý");
    	break;
    case 100 :
    	System.out.println("uc basamaklý en kücük sayý");	
    	break;
    case 1000 :
    	System.out.println("dort basamaklý en kücük sayý");
    	break;

    	default:
    	System.out.println("Girdiginiz sayýyý degistir");
    	
        }
        
        scan.close();

	}

}
