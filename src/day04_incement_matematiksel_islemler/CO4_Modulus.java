package day04_incement_matematiksel_islemler;

public class CO4_Modulus {

	public static void main(String[] args) {
		
		// 5496 sayisinin rakamlar toplamýný bulalým
		
		int sayi= 5496;
		int rakamlarToplami=0;
		
		
		// Bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yaparýz
		
		// 1- Sayi%10 ile son basamagý elde ederiz
		
		int rakam= sayi%10; // Modules islemi % kalana bakar
		
		// 2- bu rakami akamlar Toplamýna ekleriz
		
		rakamlarToplami +=rakam;
		
		sayi /=10; // Bölme islemi sonuca bakar
	
		// 3- degerini aldýgýmýz son basamaktan kurtulmak için sayýyý 10'a böleriz
		
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		// bu satýra geldiginizde sayi 549 rakamlar toplami :6 
		
		
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		// bu satýra geldiginizde sayi 54 rakamlar toplami :15
		
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		// bu satýra geldiginizde sayi 5 rakamlar toplami :19
		
	
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		
		// bu satýra geldiginizde sayi 0 rakamlar toplami :24
		
		System.out.println("Rakamlar toplamý : " + rakamlarToplami); //24
		System.out.println("Sayinin son degeri : " + sayi); // 0

	}

}
