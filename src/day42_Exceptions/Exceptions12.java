package day42_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions12 {

	public static void main(String[] args) throws IOException { 
		
		
		FileInputStream fis = new FileInputStream(
				"C:/Users/HP 250 G5/eclipse-workspace/java2021SummerTr1/src/day41_Exception01/File");
	
		int i = 0;

		
			while ((i = fis.read()) != -1) {
											
				System.out.print((char) (i));

	}
            /* �NEML�
			 * throws keyword'u sadece decleration'dur. 
			 * Throws kullan�lan methodda exception olusursa
			 * CODE BLOCK olur.
			 * Exceptions aras�nda parent-child iliskisi varsa parent class exception 
			 * throw'dan sonra yaz�lmal�d�r.     		
			 */

	}
}