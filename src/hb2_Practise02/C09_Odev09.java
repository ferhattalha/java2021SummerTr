package hb2_Practise02;

public class C09_Odev09 {

	public static void main(String[] args) {
		
		/*
       A 
       B B 
       C C C 
       D D D D 
       E E E E E 
       F F F F F F 
        �eklini yazd�r�n�z.  65=A'n�n asc�� de�eri
        */

		int harf=65;
		

		for (int satir = 0; satir <6; satir++) {

			for (int sutun = 0; sutun <= satir; sutun++) {
				System.out.print((char)(satir+harf)+" ");

			}
			System.out.println();

		}

	}

}
