package day30_dateTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime ldt=LocalDateTime.now();
		
		System.out.println("aktuel tarih ve zaman : "+ldt);// 2021-08-02T21:56:57.670165400
		
		LocalDate d=LocalDate.of(216, 1, 10);
		
		LocalTime t= LocalTime.of(13, 30);
		
		LocalDateTime ldt1=LocalDateTime.of(d, t);
		
		System.out.println(d);// 0216-01-10
		System.out.println(t); // 13:30
		System.out.println(ldt1);//  0216-01-10T13:30
		
		System.out.println(ldt.getHour()); // 22
		
		
	}

}
