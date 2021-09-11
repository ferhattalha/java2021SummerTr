package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions04 {

	public static void main(String[] args) {

		try {// parent try-catch--> file yerini kontrol ediyor ya evde yoksa hatasini handle
				// ediyor
			FileInputStream fis = new FileInputStream(
					"C:/Users/HP 250 G5/eclipse-workspace/java2021SummerTr1/src/day41_Exception01/File");
		
			int i = 0;

			try {// child try-catch --> file icerigini okuma ve yazdirma islemini handle etti
				while ((i = fis.read()) != -1) {// iint degeri fis obj read metodu ile atandiginda -1 esit degilse while
												// bodye gir
					System.out.print((char) (i));
				}

			} catch (FileNotFoundException e) {

				// e.printStackTrace();
				System.out.println(e.getMessage());

			}

		} catch (IOException e) {// I :input O:output
			// e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir
			// handle kolyligi saglar
			System.out.println(e.getMessage());

		}

		System.out.println();

		System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");

	}

}
