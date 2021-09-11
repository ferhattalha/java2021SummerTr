package day38_�nheritance_Soru;

public class Overriding {

	/*
	 * Overriding: Parent class'taki bir method'a g�re �zelle�tirerek kullanmakt�r.
	 * OVERR�DE KURALLARI: 1.)Overriding creat edilirken Signuture kesinlikle ve
	 * ASLAA degistirilemez.(name+parameters)
	 * 
	 * 2. Overriding create edilirken "access modifier" belirli kurallara g�re
	 * degistirilebilir
	 * 
	 * 3.Overriding creat edilirken "return type" belirli kurallara g�re
	 * degistirilebilir
	 * 
	 * 4. Overriding creat edilirken "method bady" %99 degistirilir.
	 * 
	 * 5. Overriding creat edilirken "parent-child" relationship sartt�r.
	 * 
	 * �nheritance olmadan overriding olmaz OlMAZZZ...
	 *
	 * 6. Overridden method: Parent class'daki methoddur.(ezilen) Overriding method:
	 * Child class'daki methoddur. (ezen)
	 * 
	 * 7."Overriding method": (child)'�n AccNo ya "Overriden method (parent) ile
	 * ayn� ya da daha genis olur. Evlat baban�n erisimini daraltamaz ama baba
	 * evlad�n alan�n� genisletebilir.
	 * 
	 * 8. Overriding method "child"'�n return type void ise "Overridden method"
	 * (parent) return type void olmal�d�r. Olmayan� kabul etmez.
	 * 
	 * 9.
	 * "Overriding method (child) '�n return type wrapper class'dan ise "Overridden
	 * method" (parent)return type wrapper class'dan
	 *
	 * 10." Overriding method" (child)'�n return type ile "Overriden method"
	 * (parent) return aras�nda is-A (child--->parent relationship) iliskisi olmal�
	 *
	 * 11.Static methodlar overriding edilemezler.
	 *
	 * 12. Private methodlar overriding edilemezzzz. ��nk� Private koruma alt�nad�r.
	 *
	 * 13. Final methodlar overriding edilemezzz. ��nk� final son hali oldugundan
	 * degistirilemez..
	 *
	 * 14. "Polymorphism" BUZZ gibi interwiew sorusudur.. Overloading ve
	 * overriding'den olusan yap�ya denir.
	 *
	 * "overloading"---->public void yemek(){..} public void yemek(String tatl�)
	 * {...} public void yemek(String tatl�,int �cret){..}
	 *
	 * 
	 * "overriding"---->public void yemek(){syso(gazoz)} public void yemek()
	 * {syso(dark ve sek bir kahve)} public void yemek(){syso(�cret)}
	 *
	 *
	 *
	 * "overloading" ile "overriding" aras�ndaki farklar;
	 * 
	 * 1. "Overloading"'de method signature (name+parametre) degistirilir (parametre
	 * degisir) "overriding"'de method signature (name+parametre) asla
	 * degistirilemez.
	 * 
	 * 2. "Overloading"'de inheritance gerekmez. "Overriding"'de inheritance olmadan
	 * overriding yap�lamaz
	 * 
	 * 3. "Overloading"'de body genellikle degistirilmeden kullan�l�r
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
