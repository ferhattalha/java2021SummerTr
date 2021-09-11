package day31_varanks;

public class C03_Varangs3 {

	public static void main(String[] args) {
		
		
	//	 verilen int lerden ilki haric tum sayilari toplayan ve
	//	 buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.

		
toplama(2,5,55,21,33);
        
        
    }
    public static void toplama(int sayi1,int...sayi) {
        int toplam=0;
        for (int each : sayi) {
            toplam+=each;
        }
        System.out.println("sonuc : "+ sayi1*toplam);
    }
	}


