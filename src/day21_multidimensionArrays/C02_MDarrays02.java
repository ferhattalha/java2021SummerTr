package day21_multidimensionArrays;



public class C02_MDarrays02 {

	public static void main(String[] args) {
		
	//	Soru 1 ) Asagidaki multi dimensional array�in
	//	tum elemanlarinin carpimini ekrana  yazdiran 
	//	bir method yaziniz. { {1,2,3}, {4,5,6} }
		

		int arr[][]= {{1,2,3},{4,5,6}};
		
		int carpim=1;
		
		for(int i=0; i < arr.length; i++) {
			
			
			for(int j=0; j< arr[i].length; j++) {
				
			carpim*=arr[i][j];
				
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("t�m elemanlar�n carp�m� : "+ carpim);
	}

}
