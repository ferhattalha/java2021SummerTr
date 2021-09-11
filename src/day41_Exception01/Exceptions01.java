package day41_Exception01;

import java.util.Scanner;

public class Exceptions01 {
	
	/* EXCEPTÝONS: 
	 * 1. Ýki tür exceptions vardýr. 
	 * 
	 * A. Compile Time (checked) Exceptions: Kod creat edilirken
	 * javanýn öngördügü olasý sorunlara karsý hatanýn altýnýn cizilmesi
	 * Ama her altý kýrmýzý çizili kod exceptions degildir.
	 * B. Run Time(Unchacked) Exceptions: Kod run edildiginde olusan hataya denir.
	 *
	 * 2. Kod creat edilirken Exception kullanýlmasý gerekirse :
	 * 
	 * a) Add thows declerations : Hata olustugunda konsol'a hata ile ilgili mesaj verir.
	 * b) try-catch blok : Hata olustugunda hata'nýn yazdýrýlmasý ve handle edilmesi saglanýr.
	 * 
	 * 3. try block'tan sonra en az bir tane catch blok olmalý.Aksi durumda CTE verir...!!!! 
	 * 
	 * 4. try-catch block'ta try body hatasýz calýþýrsa catch bod calýstýrýlamaz,catch body try body'deki exceptions'da calýþýr.
	 * 
	 * 5. try body'den sonra 1'den fazla catch body creat edilebilir. Olusan exceptions hangi catch ile ilgili
	 * ise o catch body calýsýr.
	 * 
	 */
	
	public static void main(String[] args) {
		
		//kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("bolunen sayiyi giriniz : ");
        int sayi1=scanner.nextInt();
        
        System.out.print("bolen sayiyi giriniz : ");
        int sayi2=scanner.nextInt();
        
        try {
            System.out.println("bolum : "+sayi1/sayi2);
            
        } catch (ArithmeticException e) {//try body'sinden muhtemel hata ArithmeticException olarak catch body'a sart olarak yazildi
        System.out.println("hatali giris yaptýn  bolen 0 olamaz");/*
                                                                    e: ArithmeticException class'indan data type
                                                                      ArithmeticException olan bir exception obj
                                                                        manual handle yaptik
                                                                    */
        
        }
            
        
            
        }
        
        
        
    }
    