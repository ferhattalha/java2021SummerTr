package day32_StringBuilder;

import java.time.LocalTime;

public class StringBuilder06 {

	public static void main(String[] args) {
		
		
		// 100000 kere dönecek bir loop yazalým
		// loop'da String ve StringBuilder kullanýp
		// öncesinde ve sonrasýnda zaman alalým
		// hýzlarýný karþýlastýralým
		
		String str="";
		StringBuilder sb=new StringBuilder("");

		LocalTime lt1=LocalTime.now();
        System.out.println(lt1); // 16:56:02.542295900
        
        for(int i=0;i<100000 ; i++) {
        	sb.append(i);
        	
        }
        
        LocalTime lt4=LocalTime.now();
        System.out.println(lt4); // 16:56:02.562243600
        
        
        
	}
}
