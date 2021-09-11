package hb1_Practise01;

import java.util.Scanner;

public class Hb_15 {

	public static void main(String[] args) {
		
		// Kullan�c�dan notunu al�n ve a�a��daki kurallara g�re ekrana A, B, C veya D yazd�r�n.
        // 1. 0()dahil ile 50 arasi - D   
        // 2. 50(dahil) ile 60 aras� - C   
        // 3. 60(dahil) ile 80 aras� - B  
        // 4. 80(dahil) ustu- A
        // Yanlis not girilirse ekrana "Gecerli not giriniz" yazdirin
        // switch() kullanarak yapiniz.
        
        // switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
        // switch() de int, byte, short, char, String kullanilir.
        
        Scanner scan=new Scanner(System.in);
        
        System.out.print("litfen notunuzu giriniz : ");
        int not=scan.nextInt();
        String note=scan.nextLine();
        
        
        if (not>=0 && not<50) {
            //not=50;
            note="kald�n�z";
        } else if(not>=50 && not<60){
            //not=60;
            note="ucuz y�rtt�n�z";
        }else if (not>=60 && not<80) {
            //not=80;
            note="ba�ar�l�";
        }else if (not>=80 && not<=100) {
            //not=100;
            note="gayet ba�ar�l�";
        }
        
        switch (note) {
        case "kald�n�z": {
            System.out.println("notunuz : D");
            break;
        }
        case "ucuz y�rtt�n�z":{
            System.out.println("notunuz : C");
            break;
        }case "ba�ar�l�": {
            System.out.println("notunuz : B");
            break;
        }
        case "gayet ba�ar�l�":{
            System.out.println("notunuz : A");
            break;
        }default:
            System.out.println("ge�erli not giriniz");
        break;
        
       
    }
        scan.close();     
}
	
}
