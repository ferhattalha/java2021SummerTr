package inheritance03;

public class Runner {

	public static void main(String[] args) {

		/*
		 * -Hayvanlarýn beslenme,barýnma, boyut ve solunum özellikleri ile ilgili
		 * methodlar barýnýran Hayvan isminde bir class oluþturalým
		 * 
		 * -Hayvan sýnýfýnýn SubClassý bir Kuþ Classý oluþturalým ve bu class ucma ve
		 * barýnma methodlarýný içersin
		 * 
		 * -Hayvan sýnýfýnýn SubClassý bir Balýk Classý oluþturalým ve bu class yuzme ve
		 * Solunum methodlarýný içersin
		 * 
		 * -kuþ sýnýfýnýn SubClassý bir Güversin Classý oluþturalým ve bu class beslenme
		 * ve boyut methodlarýný içersin
		 * 
		 * -Balýk sýnýfýnýn SubCLassý bir JaponBaligi classý oluþturalým ve bu class
		 * solunum methodu içersin ve bu methodu Superclasstan alsýn
		 * 
		 * --Runner class oluþturalým ve oluþturduðumuz metholarý çaðýralým.
		 * 
		
		 */
		
		
		JaponBalýgý j=new JaponBalýgý();
		j.solunum();
		
		
		Güvercin g =new Güvercin();
		g.beslenme();
		g.boyut();
		
		
		Balýk b=new Balýk();
		b.solunum();
		b.yuzme();
		
	
		Hayvan h=new Hayvan();
		h.barýnma();
		h.beslenme();
		h.boyut();
		h.solunum();
		
		Kus k=new Kus();
		k.ucma();
		k.barýnma();
		
		
		
		
	}

}
