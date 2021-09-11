package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C85_MükemmelSayý {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);

	int toplam=0;
	System.out.print("Lütfen bir sayý giriniz");
	int sayý=scan.nextInt();


	for(int i=1;i<sayý;i++)
	{
	  if(sayý % i== 0) {
	    toplam+=i;
	  }

	}
	  
	if(sayý==toplam){
	    
	    System.out.println("6 Mukemmel Sayidir.");
	  } else {
	    System.out.println("7 Mukemmel Sayidir degildir.");
	  }
	  }
	}
 

