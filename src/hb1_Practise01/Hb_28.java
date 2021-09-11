package hb1_Practise01;

public class Hb_28 {

	public static void main(String[] args) {
		
		/*
        Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         */
		
		String name="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(name.substring(0,1)+" "+name.substring(11, 12)+" "+name.substring(8,9).toLowerCase());
		
		
		// Diger çözüm
		
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      char a=pickName.charAt(pickName.indexOf("A"));
	      char l=pickName.charAt(pickName.indexOf("L"));
	      char ý=pickName.toLowerCase().charAt(pickName.indexOf("I"));
	      
	      System.out.println(""+a+" "+l+" "+ý);
	}
	

}
