package hb1_Practise01;

import java.util.Scanner;

public class Hb_07 {

	public static void main(String[] args) {

		/*
		 * Kulan�c�dan arac�n�n h�z�n� al�n�z Trafik cezas�n�n de�erini hesaplay�n. 45
		 * h�z s�n�r�d�r. E�er h�z�n�z 55-74 aras�nda ise: Ceza 100 $'d�r. E�er h�z�n�z
		 * 75 - 84 aras�nda ise: Ceza 150 $'d�r. E�er h�z�n�z 85 -94 aras�nda ise: Ceza
		 * 320 $'d�r. E�er h�z�n�z 94'den daha fazla ise: Ceza 500 $'d�r. ve ayr�ca,
		 * E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir. �rn: H�z�n�z 77 iken
		 * cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.
		 * 
		 */
	
		

		Scanner scan =new Scanner(System.in);
        System.out.print("hizinizi giriniz : ");
        int hiz=scan.nextInt();
        
        System.out.print("ehliyetiniz var ise  1 yoksa 0 yaziniz ");
        int ehliyet=scan.nextInt();
        
		
		if(ehliyet == 1) {

			if (hiz>54 && hiz<75) {
                System.out.println("Cezaniz 100 dolar..");
           
            }else if (hiz>75 && hiz<84) {
                System.out.println("Cezaniz 150 dolar..");
            }else if (hiz>85 && hiz<94) {
                System.out.println("Cezaniz 320 dolar..");
            }else if (hiz>95) {
                System.out.println("Cezaniz 500 dolar..");
            }
			
			}  else{

				if (hiz>54 && hiz<75) {
	                System.out.println("Cezaniz 300 dolar..");
	           
	            }else if (hiz>75 && hiz<84) {
	                System.out.println("Cezaniz 350 dolar..");
	            }else if (hiz>85 && hiz<94) {
	                System.out.println("Cezaniz 520 dolar..");
	            }else if (hiz>95) {
	                System.out.println("Cezaniz 700 dolar..");
	            }else {
	                System.out.println("ceza ehliyet 200 dolar");
				}
			}
		
		scan.close();
		}

	}
