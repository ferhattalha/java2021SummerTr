package hb1_Practise01;

import java.util.Scanner;

public class Hb_20 {

	public static void main(String[] args) {
		
		/* StringMethods
        String girildiginde ilk iki karakteri haric stringin kalan harflerini 
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterleri de yazd�ran bir kod yaz�n�z 
       ORNEK:
        INPUT      :  goat
                      photo
                      ghostphoto
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */
    
     Scanner scanner = new Scanner(System.in);
     System.out.print("litfen  bir kelime  giriniz : ");
     String kelime = scanner.nextLine().toLowerCase();
     
     if (kelime.startsWith("gh")) {
         System.out.println(kelime);
         
     }else if (kelime.startsWith("g")) {
         //System.out.println(kelime.replace("o",""));
         System.out.println(kelime.charAt(0)+kelime.substring(2));
         
     }
     
     else if (kelime.charAt(1)=='h') {
         System.out.println(kelime.substring(1));
         
     }
     else {
         System.out.println(kelime.substring(2));
     }{
         
     }{
         
     }
 }
}

