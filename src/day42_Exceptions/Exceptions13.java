package day42_Exceptions;

public class Exceptions13 {

	public static void main(String[] args) {

		int[] arr = { 34, 35, 41, 63, 21 };

		try {

			System.out.println(arr[30]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("hatalý index girdiniz");

		} finally {
			System.out.println("dewamke okuduysan code yeni sahillere yelken açýyordur");
		}

		/*INTERWÝEW
		 * finally blogu try-catch blok'u ile veya sadece 
		 * try blok'u ile çalýþýr.
		 * Finally beklenmedik hata olsa bile yine de çalýþýr
		 * Finally blogu catch ile ongordugum bir sorun oldugunda
		 *  calistigi gibi ongoremedigim bir exception olustugunda da calisir
		 * Finally blok her durumda çalýþýr*****FÝNAL CÜMLESÝ
		 */
		
	}

}
