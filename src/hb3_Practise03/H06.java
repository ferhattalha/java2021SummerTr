package hb3_Practise03;

import java.util.Scanner;

public class H06 {

	
		
		
		 //belirli bir(kullanýcý girecek)  yükseklikten bir top serbest dusme ile býrakilýmaktadir.
	    // top serbest býrakýldýktan  sonra sürekli birakildigi yüksekliðin % 75 'Ý kadar zeminden yukarý doðru zýplamaktadýr
	    // Top zýplama  yüksekliði 1 metrenin altýna indiðinde olay sonlandirilmaktadir.
	    // Bu ana kadar topun toplam aldýðý yolu ve topun zemine  vurma sayýsýný bulunuz.
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.print("topun birakilacagi yuksekligi giriniz : ");
	double birakilanYukseklik=scan.nextDouble();
	double toplamYol=birakilanYukseklik;
	int vurmaSayisi=0;
	while (birakilanYukseklik>=1) {
	    birakilanYukseklik*=3/4;
	    toplamYol+=birakilanYukseklik*2;
	    vurmaSayisi++;
	}
	System.out.println("topun zemine vurma sayisi :"+vurmaSayisi);
	System.out.println("topu toplam aldidi yol  "+toplamYol);
	        
	    }
	}
	


