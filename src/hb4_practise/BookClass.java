package hb4_practise;

public class BookClass {

	
		
		/*
	     * Write program as a Book class that will have 2 Constructors. While creating
	     * an object make sure: Instance variables are being initialized Both
	     * Constructors are being executed
	     * 
	     * 
	     * Program� 2 Yap�c�ya sahip olacak bir Kitap s�n�f� olarak yaz�n.
	     *  iki kitap creat ederek  disPlay metodu ile kitaplar� yazd�r�n�z
	     */
	    String title, author;
	    int publish;
	    static int pages;
	    
	    public BookClass(String title, String author, int publish) {
	        super();
	        this.title = title;
	        this.author = author;
	        this.publish = publish;
	    }
	    public static void main(String[] args) {
	        BookClass kitap1=new BookClass("suc ve ceza","Dostayevski",2000);
	        BookClass kitap2=new BookClass("calikusu","Resat Nuri",1935);
	        
	        kitap1.disPlay();
	        kitap2.disPlay();
	        
	    }
	    public void disPlay() {
	        System.out.println("kitabiniz : "+title+" yazari : "+author+" yay�n yili :"+publish);
	        
	    }
	    
	

	}


