package util;

import java.util.Random;

public class MyUtil {
	/* Color */
	public static final String BLACK   = "\033[90m";
	public static final String RED     = "\033[91m";
	public final String GREEN   = "\033[92m";
	public final String YELLOW  = "\033[93m";
	public final String BLUE    = "\033[94m";
	public final String MAGENTA = "\033[95m";
	public final String CYAN    = "\033[96m";
	public final String WHITE   = "\033[97m";
	
	public final String REDBG   = "\033[101m";
	public final String GREENBG = "\033[102m";
	
	/* Style */
	public final static String BOLD      = "\033[1m";
	public final static String INTENSITY = "\033[2m";
	public final static String ITALIC    = "\033[3m";
	public final static String UNDERLINE = "\033[4m";
	public final static String NEGATIVE  = "\033[7m";
	public final static String CROSSEDOUT = "\033[9m";
	public final static String DOUBLEUNDERLINE = "\033[21m";
	
	public static final String END = "\033[0m";
	
	public static void p(String str) {
		System.out.println(str);
	}
	
	/**
	 * tp(title) : 256색 중 임의의 색, 임의의 스타일으로 str을 출력한다.
	 * @param title
	 */
	public void tp(String title) {
		Random rd = new Random();
		int color = rd.nextInt(256);
		int style = rd.nextInt(7) + 1;
		switch(style) {
			case 1, 2, 3, 4: break;
			case 5:	style = 7; break;
			case 6: style = 9; break;
			case 7:	style = 21;	break;
		}
		
		String str = "\033[38;5;" + color + "m"
				   + "\033[" + style + "m"
				   + title + END;
		
		System.out.println("********************");
		System.out.println(str);
		System.out.println("********************");
	}
}
