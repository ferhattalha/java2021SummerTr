package hb2_Practise02;


public class C01_forLoop01 {

	
		 /*
	       sayacý ritmik ilerleyen ve adým sayýsý belli ise FOR kullanýlýr.
	       DEÐÝLSE While kullanýlýr, Eðer döngüye bir kez mutlaka girilecekse DO_WHILE kullanýlýr.
	       Problem Tanýmý
	        100'den 0'a kadar 13'e tam bölünebilen sayýlarý ve toplamlarýný ekrana yazdýrýnýz (büyükten küçüðe).
	         Ekran Çýktýsý
	        91
	        78
	        65
	        52
	        39
	        26
	        13       */
	    public static void main(String[] args) {
	        int top=0;
	        
	        for (int i = 100; i >0; i--) {
	            if (i%13==0) {
	                System.out.println(i);
	                top+=i;
	            }
	            
	        }System.out.println(top);
	        
	    }
	}