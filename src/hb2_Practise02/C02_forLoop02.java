package hb2_Practise02;

public class C02_forLoop02 {
	
	
	public static void main(String[] args) {
	
	
		// 0-255 e kadar olan harflerin , sayý ve harf deðerini konsola yazdýrýnýz.
        for (int i = 0; i <= 255; i++) {
            char harf=(char)i;
            System.out.println(i+"-"+harf);
            
        }
System.out.println("  ****** 2.yol *****");
for (char i = 0; i <= 255; i++) {
    char harf=i;
    System.out.println(i+"-"+harf);
    
}//for içindeki int deðeri char alýnýrsa sayý harf eslesmesi olaz. soruda istenen sayý ve harf degeri bulunmaz
    }
}