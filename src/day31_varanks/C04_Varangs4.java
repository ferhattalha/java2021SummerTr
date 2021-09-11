package day31_varanks;

public class C04_Varangs4 {

	public static void main(String[] args) {
		
		
		int[]arr= {1,3,5,7,9,11,13,15};
		
		arrTopla(arr);
		varangsTopla(1,3,5,7,9,11,13,15);
		
		System.out.println("array toplamý : "+arrTopla(arr));
		System.out.println("varangs toplamý : "+varangsTopla(1,3,5,7,9,11,13,15));
		System.out.println("varangs ýn array parametreli toplamý : "+varangsTopla(arr));
		
		// varangs array gibi davrandýgý icin herhangi bir arrayi parametre olarak alabilir
	}
// varang elemanlarýný toplayan method
	
	private static int varangsTopla(int... i) {
		
		int toplam=0;
		for(int a : i) {
			 
			toplam+=a;
		}
		
		return toplam;
		
	}
	
	// array elemanlarýný toplayan method 
	
	private static int arrTopla(int[] arr) {
	
		int topla=0;
		for(int a : arr) {
			 
			topla+=a;
		}
		 
		return topla;
	}

}
