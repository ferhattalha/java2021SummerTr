package day44Interfaces;

public class SahinRunner {
	
	public static void main(String[] args) {
Sahin s1=new Sahin();
s1.ayna();
s1.ebat();
s1.jant();
s1.kaporta();
s1.motor();
s1.yakit();
s1.koltuk();
s1.sunroof();

System.out.println(IcDonanim.music);
//  s1.kumas="deri"; // final variable assigment yapýlamaz

System.out.println(IcDonanim.RENK);
System.out.println(DisDonamim.RENK);
System.out.println(Lastik.RENK);
s1.sisLambasý();// obje ile parent interface'den concrate method call edildi.
System.out.println(s1.sisLambasý());
System.out.println(DisDonamim.boya());// Interface name  ile parent interface'den concrate method call edildi.



}

}
