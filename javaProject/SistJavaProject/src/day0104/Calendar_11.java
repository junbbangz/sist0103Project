package day0104;

import java.time.Month;
import java.util.Calendar;

public class Calendar_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub3
		Calendar cal=Calendar.getInstance();
		
		System.out.println("지금은 "+cal.get(cal.YEAR)+"년도 입니다");
		System.out.println("지금은 "+cal.get(cal.MONTH+1)+"월 입니다"); //월은 +1
		

	}

}
