package hb3_Practise03;

import java.util.Scanner;

public class H05_P�nControl {

	public static void main(String[] args) {
		
		// INTEGER OLAN PIN kodunuzu kontrol eden bir kod yaz�n�z.
        Scanner scan = new Scanner(System.in);
        System.out.print("PIN kodunuzu giriniz : ");
        int userPin = scan.nextInt();
        int pinCode = 1453;
        while (pinCode!=userPin) {
            System.out.println("ba�ar�s�z pin girisi! tekrar deneyin :");
            userPin=scan.nextInt();
        }
        System.out.println("gayet ba�a�r�l� giri� pin onayland�");
    }

	}


