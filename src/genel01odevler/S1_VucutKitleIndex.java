package genel01odevler;

import java.util.Scanner;

public class S1_VucutKitleIndex {

	public static void main(String[] args) {
		
		//HINT : Body Mass Index = Weight (kg) / Square of height (m)
		//Then give a message to user as following:	
		//If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , 
		//your weight is ideal If BMI is between 25 and 30,
		//you re fat If BMI is more than or equal to 30, obese
		/*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut 
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        ORNEK:
        INPUT      : Kilo: 71
                          Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
            */
   

        Scanner scan =new Scanner(System.in);
        
        System.out.print("kilonuzu giriniz : ");
        double kilo=scan.nextDouble();
        System.out.print("boyunuzu cm  giriniz : ");
        double boy=scan.nextDouble();
        boy/=100;
        double BMI=kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz :"+BMI);
                
         if (BMI<18.5) {
        	 System.out.print("you are weak");	
		}  else if (BMI>=18.5 &&  BMI <=25) {
			System.out.print("your weight is ideal");
		}  else if (BMI>=25 &&  BMI<=30) {
			System.out.print("you are fat");
		}else if (BMI>=30 ) {
			System.out.print("you are obese");
			
			scan.close();
		
		}
         
         
         
     
	} 
	
	
 }
        
    
		
	


