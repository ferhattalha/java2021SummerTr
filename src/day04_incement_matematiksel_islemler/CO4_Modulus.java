package day04_incement_matematiksel_islemler;

public class CO4_Modulus {

	public static void main(String[] args) {
		
		// 5496 sayisinin rakamlar toplam�n� bulal�m
		
		int sayi= 5496;
		int rakamlarToplami=0;
		
		
		// Bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapar�z
		
		// 1- Sayi%10 ile son basamag� elde ederiz
		
		int rakam= sayi%10; // Modules islemi % kalana bakar
		
		// 2- bu rakami akamlar Toplam�na ekleriz
		
		rakamlarToplami +=rakam;
		
		sayi /=10; // B�lme islemi sonuca bakar
	
		// 3- degerini ald�g�m�z son basamaktan kurtulmak i�in say�y� 10'a b�leriz
		
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		// bu sat�ra geldiginizde sayi 549 rakamlar toplami :6 
		
		
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		// bu sat�ra geldiginizde sayi 54 rakamlar toplami :15
		
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		// bu sat�ra geldiginizde sayi 5 rakamlar toplami :19
		
	
		rakam= sayi%10;
		
		rakamlarToplami += rakam;
		
		sayi /=10;
		
		
		// bu sat�ra geldiginizde sayi 0 rakamlar toplami :24
		
		System.out.println("Rakamlar toplam� : " + rakamlarToplami); //24
		System.out.println("Sayinin son degeri : " + sayi); // 0

	}

}
