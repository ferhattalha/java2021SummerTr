package hb3_Practise03;

public class H10 {

	public static void main(String[] args) {
		 // bir int Array elemanlarinin iþaretini(+-)degistiren bir method yaziniz.
        // input : 1,2,-3,4,-5,-6
        // output :-1,-2,3,-4,5,6
        int[] arr = { 1, 2, -3, 4, -5, -6 };
        for (int w : arr) {//arr'in her bir elemaný - ile çarpýlmasý sýra gerketirmedigi için kodun hýzlý calýsmasý için for i degil for each kullandýk
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
