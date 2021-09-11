package day04_incement_matematiksel_islemler;

public class C2_Preincrement_Postincrement {

	public static void main(String[] args) {
		
	int sayi1= 20;
	
	int sayi2 =++sayi1; // sayi2 hem deklere ediliyor hemde deger altanýyor
	
	System.out.println("pre-increment sayi1 : " + sayi1); //21
	System.out.println("pre-increment sayi2 : " + sayi2);//21

	sayi2 = sayi1++;
	
	System.out.println("post-increment sayi1 : " + sayi1); // 22
	System.out.println("post-increment sayi2 : " + sayi2); // 21
	
	int sayi3 = 10;
	
	System.out.println("pre-increment sayi1 : " + ++sayi3);   // 11 önce artýr sonra yazdýr
	System.out.println("post-increment sayi2 : " + sayi3++);  // 11 önce yazdýr sonra artýr

	System.out.println("post-incremen'tan sonra sayi3 : " + sayi3); // 12  sadece sayýnýn son degerini yazdýrýr
	
	
	
	
	
	}

}
