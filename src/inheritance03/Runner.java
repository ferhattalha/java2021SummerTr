package inheritance03;

public class Runner {

	public static void main(String[] args) {

		/*
		 * -Hayvanlar�n beslenme,bar�nma, boyut ve solunum �zellikleri ile ilgili
		 * methodlar bar�n�ran Hayvan isminde bir class olu�tural�m
		 * 
		 * -Hayvan s�n�f�n�n SubClass� bir Ku� Class� olu�tural�m ve bu class ucma ve
		 * bar�nma methodlar�n� i�ersin
		 * 
		 * -Hayvan s�n�f�n�n SubClass� bir Bal�k Class� olu�tural�m ve bu class yuzme ve
		 * Solunum methodlar�n� i�ersin
		 * 
		 * -ku� s�n�f�n�n SubClass� bir G�versin Class� olu�tural�m ve bu class beslenme
		 * ve boyut methodlar�n� i�ersin
		 * 
		 * -Bal�k s�n�f�n�n SubCLass� bir JaponBaligi class� olu�tural�m ve bu class
		 * solunum methodu i�ersin ve bu methodu Superclasstan als�n
		 * 
		 * --Runner class olu�tural�m ve olu�turdu�umuz metholar� �a��ral�m.
		 * 
		
		 */
		
		
		JaponBal�g� j=new JaponBal�g�();
		j.solunum();
		
		
		G�vercin g =new G�vercin();
		g.beslenme();
		g.boyut();
		
		
		Bal�k b=new Bal�k();
		b.solunum();
		b.yuzme();
		
	
		Hayvan h=new Hayvan();
		h.bar�nma();
		h.beslenme();
		h.boyut();
		h.solunum();
		
		Kus k=new Kus();
		k.ucma();
		k.bar�nma();
		
		
		
		
	}

}
