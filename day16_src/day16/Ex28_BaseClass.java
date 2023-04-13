package day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
		
public class Ex28_BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String, StringBuffer Performance Test
		String str1 = "";
		StringBuffer str2 = new StringBuffer("");
		
		System.out.println("String vs StringBuffer");
		final int SAMPLE = 10000;
		
		long start = System.currentTimeMillis();
		for(int i=0;i<SAMPLE;i++) {
			str1 = str1 + i;
		}
		long mid = System.currentTimeMillis();
		for(int i=0;i<SAMPLE;i++) {
			str2.append(i);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("String : " + (mid-start) + "(ms)");
		System.out.println("StringBuffer : " + (end-mid) + "(ms)");
		System.out.println();
		
		// StringBuffer의 value 비교하기
		StringBuffer sb1 = new StringBuffer("abcde");
		StringBuffer sb2 = new StringBuffer("abcde");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println(sb1.toString().equals(sb2.toString()));
		System.out.println();
		
		// Date, Calendar
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyMMdd");
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.DAY_OF_WEEK));  // 요일
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		
		System.out.println(Calendar.DAY_OF_MONTH);
	}

}
