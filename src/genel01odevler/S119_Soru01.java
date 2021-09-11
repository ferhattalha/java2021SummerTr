package genel01odevler;

public class S119_Soru01 {

	public static void main(String[] args) {
		
		
		//String methodlarini kullanarak “ Java ogrenmek123 Cok guzel@ ”
		//String’ini “Java ogrenmek cok guzel.” sekline getirin.

		
		String cumle="Java ogrenmek123 Cok guzel@";
		
	
		String cumleD= cumle.replaceAll("\\d","");
		
		String cumleE=cumleD.replace("@", "");
		
		System.out.println(cumleE);
				
   
		
	}


}
