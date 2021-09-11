package day31_varanks;

public class C02_Varangs2 {

	public static void main(String[] args) {
		
		// Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method olusturunuz
		

		
		
		concat("m","e","h","m","e","t");
		
		
		
	}

	private static void concat(String ... string) {
		
		String s="";
		for (String w :string) {
			s=s.concat(w);
			
			
		}
		System.out.println(s);
		
	}

}
