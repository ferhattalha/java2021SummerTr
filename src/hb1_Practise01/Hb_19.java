package hb1_Practise01;

import java.util.Scanner;

public class Hb_19 {

	public static void main(String[] args) {
		
		
		    /*
		     * Bak�ye ��renme para �ekme yat�rma ve ��k�� i�lemlerinin oldu�u bir bankamatik pr kodlay�n�z
		     */
		    
		         System.out.println("*****************************");
		         System.out.println("JAVA BANK ATM'ye Ho�geldiniz...");
		         
		         System.out.println("1. islem : bak�ye sorma\n2. islem : para cekme\n3.islem : para yatirma\n4. islem : c�k�s");
		         
		         int bak�ye =5000;
		         
		         Scanner scanner=new Scanner(System.in);
		         System.out.print("lutfen yapacaginiz islemi seciniz: ");
		         int secim=scanner.nextInt();
		         
		         switch (secim) {
		        case 1: {
		            System.out.println("bak�yeniz: " +bak�ye);
		            
		            break;
		        }
		        case 2: {
		            System.out.print("cekeceginiz miktar� giriniz : " );
		            int cekilenMiktar=scanner.nextInt();
		            if (cekilenMiktar>bak�ye) {
		                System.out.println("bak�yeniz yeterli degil");
		                
		            }else {
		                bak�ye-=cekilenMiktar;//bak�yeden cekilenMiktar� ��kard�k
		                System.out.println("yeni bak�yeniz :"+bak�ye);
		            }
		            break;
		        }
		        case 3: {
		            System.out.print("yat�racaginiz miktari giriniz: " );
		            int yatirilanmiktar=scanner.nextInt();
		            bak�ye+=yatirilanmiktar; //bak�yeye yatirilanmiktar ekledik
		            System.out.println("yeni bak�yeniz :"+bak�ye);
		            break;
		        }
		        case 4: {
		            System.out.println("islemden cikisiniz yap�l�yor: " );
		            
		            break;
		        }
		        default:
		            
		        }
		    }
		}