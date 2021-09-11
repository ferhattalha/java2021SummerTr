package day38_Ýnheritance_Soru;

public class Overriding {

	/*
	 * Overriding: Parent class'taki bir method'a göre özelleþtirerek kullanmaktýr.
	 * OVERRÝDE KURALLARI: 1.)Overriding creat edilirken Signuture kesinlikle ve
	 * ASLAA degistirilemez.(name+parameters)
	 * 
	 * 2. Overriding create edilirken "access modifier" belirli kurallara göre
	 * degistirilebilir
	 * 
	 * 3.Overriding creat edilirken "return type" belirli kurallara göre
	 * degistirilebilir
	 * 
	 * 4. Overriding creat edilirken "method bady" %99 degistirilir.
	 * 
	 * 5. Overriding creat edilirken "parent-child" relationship sarttýr.
	 * 
	 * Ýnheritance olmadan overriding olmaz OlMAZZZ...
	 *
	 * 6. Overridden method: Parent class'daki methoddur.(ezilen) Overriding method:
	 * Child class'daki methoddur. (ezen)
	 * 
	 * 7."Overriding method": (child)'ýn AccNo ya "Overriden method (parent) ile
	 * ayný ya da daha genis olur. Evlat babanýn erisimini daraltamaz ama baba
	 * evladýn alanýný genisletebilir.
	 * 
	 * 8. Overriding method "child"'ýn return type void ise "Overridden method"
	 * (parent) return type void olmalýdýr. Olmayaný kabul etmez.
	 * 
	 * 9.
	 * "Overriding method (child) 'ýn return type wrapper class'dan ise "Overridden
	 * method" (parent)return type wrapper class'dan
	 *
	 * 10." Overriding method" (child)'ýn return type ile "Overriden method"
	 * (parent) return arasýnda is-A (child--->parent relationship) iliskisi olmalý
	 *
	 * 11.Static methodlar overriding edilemezler.
	 *
	 * 12. Private methodlar overriding edilemezzzz. Çünkü Private koruma altýnadýr.
	 *
	 * 13. Final methodlar overriding edilemezzz. Çünkü final son hali oldugundan
	 * degistirilemez..
	 *
	 * 14. "Polymorphism" BUZZ gibi interwiew sorusudur.. Overloading ve
	 * overriding'den olusan yapýya denir.
	 *
	 * "overloading"---->public void yemek(){..} public void yemek(String tatlý)
	 * {...} public void yemek(String tatlý,int ücret){..}
	 *
	 * 
	 * "overriding"---->public void yemek(){syso(gazoz)} public void yemek()
	 * {syso(dark ve sek bir kahve)} public void yemek(){syso(ücret)}
	 *
	 *
	 *
	 * "overloading" ile "overriding" arasýndaki farklar;
	 * 
	 * 1. "Overloading"'de method signature (name+parametre) degistirilir (parametre
	 * degisir) "overriding"'de method signature (name+parametre) asla
	 * degistirilemez.
	 * 
	 * 2. "Overloading"'de inheritance gerekmez. "Overriding"'de inheritance olmadan
	 * overriding yapýlamaz
	 * 
	 * 3. "Overloading"'de body genellikle degistirilmeden kullanýlýr
	 * "Overriding"'de body hemen hemen her zaman degistirilir.
	 * 
	 * 4. Static method'lar overriding edilemezler ama overloading edilebilirler
	 *    Privite method'lar overriding edilemezler ama overloading edilebilirler
	 *    
	 * 5. Overloading Compile Time Polymorphism'dir--->static
	 *    Overriding Run Time Polymorphism'dir----> dinamic
	 *    
	 *    
	 */

}
