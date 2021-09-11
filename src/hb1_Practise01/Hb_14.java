package hb1_Practise01;

import java.util.Scanner;

public class Hb_14 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("denklemin a, b ve c katsay�lar�n� giriniz : ");
        
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        double delta = b * b - 4 * a * c;
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("Girdi�iniz denklemin iki tane k�k� vard�r\nX1= " + x1 + " X2= " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Girdi�iniz denklemin 1 tane k�k� vard�r\nx= " + x);
        } else {
            System.out.println("Girdi�iniz denklemin k�k� yoktur");
        }
        
        scan.close();
    }
}