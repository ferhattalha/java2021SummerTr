package hb3_Practise03;

import java.util.Scanner;

public class H02 {

	public static void main(String[] args) {
		 // kullanýcýdan alýnan bir stringdeki indexi tek  olan karakterleri yazdiriniz.
       
		Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");//yunusciftci
        String str=scan.nextLine();
        
         int i=0;
        do {
            if (i%2==1) {
                System.out.print(str.charAt(i)+", ");//indexi tek olan char yazdýrdýk
                
            }
            i++;
        } while (i<str.length());
       
    }
}

	


