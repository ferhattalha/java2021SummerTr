package day20_Arrays;

public class C02_Arrays02 {

	public static void main(String[] args) {
		
	//	Soru 2: Verilen bir array�in tum elemanlarini toplayan bir program yazalim.

		
		int arr[]= {2,4,6,8,10};
		
		int toplam=0;
		
		for(int i=0;i < arr.length; i++)
				
		toplam+=arr[i];
		
		
		System.out.print("verilen array'deki t�m elementlerin toplam� : "+ toplam);
	
	}
   
}
