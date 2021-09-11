package day30_dateTimes;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {

		
		LocalDate tarih = LocalDate.now(); // Tarih isminde obj creat ettik.New anahtarý kullanýlmaz.
		
		System.out.println("bugünün tarihi : " + tarih);

		System.out.println("bugünün tarihinden 21 gün sonrasý :" + tarih.plusDays(21));// 2021-08-23

		System.out.println("bugünün tarihinden 3 yýl sonrasý : " + tarih.plusYears(3)); // 2024-08-02

		System.out.println("bugünden 3 gün sonra 5 ay 1 yýl sonrasý : " + tarih.plusDays(3).plusMonths(5).plusYears(2)); // 2024-01-05

		System.out.println("bugünden 40 gün öncesi : "+ tarih.minusDays(40));//2021-06-23
		
		System.out.println("bugünden 5 yýl öncesi 2 ay sonrasý 3 hafta öncesi : "+ tarih.minusYears(5).plusMonths(2).plusWeeks(3)); // 2016-10-23

		// localDate classýndawn üretilen obj method chain kuralýna uyar
		// ve methodlar ayný (homojen) olmak  zorunda degildir EX.satýr..
		
		
		System.out.println(tarih.getDayOfMonth()); // 2
		System.out.println(tarih.getDayOfYear()); // 214
		System.out.println(tarih.getMonthValue());// 8
		System.out.println(tarih.getMonth()); // AUGUST
		
		
		LocalDate dogmGnDate=LocalDate.of(1974,4,3);
		System.out.println("dogum gunu : "+dogmGnDate); // 1974-04-03
		
		System.out.println("dogum tarihi: "+ dogmGnDate.getDayOfWeek()); // WEDNESDAY
		
	
		System.out.println(tarih.isAfter(dogmGnDate)); // true
		
		System.out.println(dogmGnDate.isBefore(tarih));// true
		
		System.out.println("bu gün artýk yýl mý : " + tarih.isLeapYear()); // false
		
		
		
	}

}
