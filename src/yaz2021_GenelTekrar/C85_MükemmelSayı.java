package yaz2021_GenelTekrar;

import java.util.Scanner;

public class C85_M�kemmelSay� {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);

	int toplam=0;
	System.out.print("L�tfen bir say� giriniz");
	int say�=scan.nextInt();


	for(int i=1;i<say�;i++)
	{
	  if(say� % i== 0) {
	    toplam+=i;
	  }

	}
	  
	if(say�==toplam){
	    
	    System.out.println("6 Mukemmel Sayidir.");
	  } else {
	    System.out.println("7 Mukemmel Sayidir degildir.");
	  }
	  }
	}
 

