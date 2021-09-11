package day32_StringBuilder;

public class C01_StringBuilder {

	public static void main(String[] args) {
		
		StringBuilder sb1=new StringBuilder();//bos bir sb1 creat ettik. 16 capacty
        //SB e eleman ekleme-->obj.appent(obj);
        sb1.append("faruk");
        System.out.println("sb1 ilk hali : "+sb1);//faruk 
        sb1.append(" efehan");
        System.out.println("sb1 efehan eklenmis hali : "+sb1);//faruk efehan
        System.out.println("sb1 uzunluk :"+sb1.length());//12
        System.out.println("sb1 kapasitesi :"+sb1.capacity());//16
        System.out.println("sb1 son hali :"+sb1.append(" guzel insan"));
        System.out.println("sb1 son hali. kapasite : "+sb1.capacity());
        
        //faruk efehan guzel insan
        //Fazladan ayrýlan kapasiteyi silme -->obj.trimToSize();
        sb1.trimToSize();
        System.out.println(sb1.capacity());//24
        
        
        // istenen charakterin index ini alma -->obj.indexOf();
        System.out.println(sb1.indexOf("e")); //6
        System.out.println(sb1.lastIndexOf("e"));//16
        
        //Ýstenen bir characteri index'ine gore alma --> obj.charAt();      
        System.out.println("sb 7. karakter : "+sb1.charAt(7));//f
        
        
        //belirli bir araliktaki characterleri alma -->obj.subSsequence();
        
    System.out.println("sb 'nin 7 dahil 12 haric karakterleri :"+sb1.subSequence(7, 12));//fehan
    System.out.println("sb 'nin 5 dahil tum karakterleri :"+sb1.toString().substring(5));//efehan guzel insan
    System.out.println("sb 'nin 5 dahil tum karakterleri :"+sb1.subSequence(5, sb1.length()));//efehan guzel insan
    
    //sb dekibelli bir index 'deki karakteri silme --> obj.delete(a,b); a dahil b hariç arasý siler.  obj.deleteCharAt(a); sadece a karakterini siler
    sb1.delete(3, 7);
    System.out.println("3-7 arasý karakter silinmis hali : "+sb1);
    sb1.deleteCharAt(2);
    System.out.println("2. karakter silinmis hali : "+sb1);
    
        
    }


	}


