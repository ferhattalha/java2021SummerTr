package day30_dateTimes;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Iterator;

public class C02_Localtime {

	public static void main(String[] args) {
		
		LocalTime zaman=LocalTime.now();
		
		System.out.println("aktuel zaman : "+ zaman);// 21:34:55.111353200
		
		LocalTime timel=LocalTime.of(12, 35, 23);
		
		System.out.println(timel); //b12:35:23
		System.out.println("su zamandan 2 saat ileri 34 dk geri ve 45 sn ileri: " + zaman.plusHours(2).minusMinutes(34).plusSeconds(34));// 23:07:55.620020400
		
		for(int i=0; i <1000; i++) {
			
			System.out.print(i);
		}
		
		LocalTime zaman2=LocalTime.now();
		System.out.println();
		System.out.println(zaman2); // 21:44:44.273297900
		
		// ülke saatleri hesaplama:
		
		ZonedDateTime japan =ZonedDateTime.now(ZoneId.of("Europe/Amsterdam")); // 2021-08-02T20:53:30.904862400+02:00[Europe/Amsterdam]
		System.out.println(japan);
		
		
	}

}
