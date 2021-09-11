package day31_varanks;

public class C04_Varangs4 {

	public static void main(String[] args) {
		
		
		int[]arr= {1,3,5,7,9,11,13,15};
		
		arrTopla(arr);
		varangsTopla(1,3,5,7,9,11,13,15);
		
		System.out.println("array toplam� : "+arrTopla(arr));
		System.out.println("varangs toplam� : "+varangsTopla(1,3,5,7,9,11,13,15));
		System.out.println("varangs �n array parametreli toplam� : "+varangsTopla(arr));
		
		// varangs array gibi davrand�g� icin herhangi bir arrayi parametre olarak alabilir
	}
// varang elemanlar�n� toplayan method
	
	private static int varangsTopla(int... i) {
		
		int toplam=0;
		for(int a : i) {
			 
			toplam+=a;
		}
		
		return toplam;
		
	}
	
	// array elemanlar�n� toplayan method 
	
	private static int arrTopla(int[] arr) {
	
		int topla=0;
		for(int a : arr) {
			 
			topla+=a;
		}
		 
		return topla;
	}

}
