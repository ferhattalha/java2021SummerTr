package day31_varanks;

public class C01_Varangs1 {

	public static void main(String[] args) {
		// verilen iki sayýnýn  toplamýný bulan bir method yazýnýz
		// verilen üç sayýnýn  toplamýný bulan bir method yazýnýz
		
		int sayi1=17;
		int sayi2=20;
		int sayi3=35;
		
		topla(17,20,35);
		ikiSayiTopla(sayi1,sayi2);
		ucSayiTopla(sayi1,sayi2,sayi3);
	}

	private static void ucSayiTopla(int sayi1,int sayi2, int sayi3) {
		
		
		System.out.println("üc sayi toplamý : "+sayi1+sayi2+sayi3);
		
	}

	private static void ikiSayiTopla(int sayi1,int sayi2) {
		
		System.out.println("iki sayi toplamý : "+sayi1+sayi2);	
			
		}
	
	public static void topla(int...sayi) {
		
		int toplam=0;
		for(int i : sayi)
			toplam+=i;
		System.out.println("varangs toplam : "+toplam);
	}
       


}


