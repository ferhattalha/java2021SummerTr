package hb3_Practise03;

public class H10 {

	public static void main(String[] args) {
		 // bir int Array elemanlarinin i�aretini(+-)degistiren bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
        int[] arr = { 1, 2, -3, 4, -5, -6 };
        for (int w : arr) {//arr'in her bir eleman� - ile �arp�lmas� s�ra gerketirmedigi i�in kodun h�zl� cal�smas� i�in for i degil for each kulland�k
            w *= -1;
            System.out.print(w+", ");
        }
        
        System.out.println();
sayiniTersi(arr);
    }
    private static int[] sayiniTersi(int[] arr) {
        for (int w : arr) {
            w *= -1;
            System.out.print("method cozumu  "+w+", ");
        }
        return arr;
    }



	

}
