package hb3_Practise03;

import java.util.Scanner;

public class H15 {

	public static void main(String[] args) {
		 // Kullanicidan aldigimiz 8 elemanli arrayin icinde 
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
        
        // 3,5,78,89,23,3,5,6
        int [] arr = new int [8];
        Scanner scan = new Scanner (System.in);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print("arrayin "+i+". elemanýný giriniz : ");
            arr[i]=scan.nextInt();
            
        }
        int count=0;
        for (int i = 0; i < arr.length; i++) {//arr in elemanlrýn ulsýlýyor
            if (arr[i]%3==0) {
                count++;
                
            }
            
        }
        System.out.println("arraydeki 3 e tam bolunen eleman sayisi : "+count);
        
       
    

	}

}
