package day06_relationalOperators_ifstatements;

public class C1_RelationalOperators {

	public static void main(String[] args) {
		
		//******** == isaretini gören java bunun karsýlaþtýrma olduðunu anlar
				
		// != ise esit degildir isaretidir********
		
		//  >= isareti büyük veya esittir*********
				
		//  <= kücük ve esittir isretidir********
				
		// Sart operatörü =  && dogru ise sonuç true (operatör mükemmeliyetçidir)
				
		// || iyimser (1 ifade dogru ise true ) Hepsi yanlýþsa fulse
		
		
        
		
		System.out.println(15*3==40); // false
        
        System.out.println(15-3==12); // true
        
        boolean esitMi= 24/2==12;
        
        
        
        System.out.println(esitMi);
        
        
        System.out.println(  5+2>8   ||   9<6   ); // False
        System.out.println(  5+2<8   ||   9<6   ); // True
        
        System.out.println(  5+2<8   &&   9<6   ); // False
        System.out.println(  5+2<8   &&   9>=6  ); // True
		
			
        
        System.out.println("Merhaba dunya");

			String motto="Merhaba dunya";
			
			System.out.println(motto);
			
			
		
	}

}
