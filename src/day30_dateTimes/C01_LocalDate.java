package day30_dateTimes;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {

		
		LocalDate tarih = LocalDate.now(); // Tarih isminde obj creat ettik.New anahtar� kullan�lmaz.
		
		System.out.println("bug�n�n tarihi : " + tarih);

		System.out.println("bug�n�n tarihinden 21 g�n sonras� :" + tarih.plusDays(21));// 2021-08-23

		System.out.println("bug�n�n tarihinden 3 y�l sonras� : " + tarih.plusYears(3)); // 2024-08-02

		System.out.println("bug�nden 3 g�n sonra 5 ay 1 y�l sonras� : " + tarih.plusDays(3).plusMonths(5).plusYears(2)); // 2024-01-05

		System.out.println("bug�nden 40 g�n �ncesi : "+ tarih.minusDays(40));//2021-06-23
		
		System.out.println("bug�nden 5 y�l �ncesi 2 ay sonras� 3 hafta �ncesi : "+ tarih.minusYears(5).plusMonths(2).plusWeeks(3)); // 2016-10-23

		// localDate class�ndawn �retilen obj method chain kural�na uyar
		// ve methodlar ayn� (homojen) olmak  zorunda degildir EX.sat�r..
		
		
		System.out.println(tarih.getDayOfMonth()); // 2
		System.out.println(tarih.getDayOfYear()); // 214
		System.out.println(tarih.getMonthValue());// 8
		System.out.println(tarih.getMonth()); // AUGUST
		
		
		LocalDate dogmGnDate=LocalDate.of(1974,4,3);
		System.out.println("dogum gunu : "+dogmGnDate); // 1974-04-03
		
		System.out.println("dogum tarihi: "+ dogmGnDate.getDayOfWeek()); // WEDNESDAY
		
	
		System.out.println(tarih.isAfter(dogmGnDate)); // true
		
		System.out.println(dogmGnDate.isBefore(tarih));// true
		
		System.out.println("bu g�n art�k y�l m� : " + tarih.isLeapYear()); // false
		
		
		
	}

}
