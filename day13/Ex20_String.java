package day13;

import util.MyUtil;

public class Ex20_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil.p(MyUtil.BOLD + "String" + MyUtil.END);
		
		// 1. length()
		String str1 = "eoighfopiwhehgofehfiehfipefhiephfepi";
		String str2 = "한글은 몇자입니까?";
		MyUtil.p("[length()] " + str1.length());
		MyUtil.p("[length()] " + str2.length());
		
		// 2. charAt()
		String str3 = "이것도 한글이 궁금할 뿐";
		MyUtil.p("[charAt()] " + str3.charAt(5));
		
		// 3. equals(), equalsIgnoreCase()
		String str4 = "abcde";
		String str5 = "abcde";
		String str6 = new String("abcde");
		String str7 = new String("abcde");
		String str8 = new String("AbCDe");
		MyUtil.p("[equals()] " + (str4==str5));
		MyUtil.p("[equals()] " + (str6==str7));
		MyUtil.p("[equals()] " + str6.equals(str7));
		MyUtil.p("[equalsIgnoreCase()] " + str6.equalsIgnoreCase(str8));
		
		// 4. replace()
		String str9 = "Heaven helps those who helps themselves.";
		String str10 = "helps";
		String str11 = str9.replace(str10, "_____");
		MyUtil.p("[replace()] " + str11);
		String str12 = str9.replace("e", "!!!");
		MyUtil.p("[replace()] " + str12);
		
		// 5. substring()
		String str13 = str9.substring(2, 4);   // 총 글자수 = 뒷 수 - 앞 수
		MyUtil.p("[substring()] " + str13);
		String str14 = str9.substring(8);  // 8번 인덱스부터 끝까지
		MyUtil.p("[substring()] " + str14);
		String str15 = str9.substring(str9.length()-5);   // 인덱스에 음수가 입력되면 오류
		MyUtil.p("[substring()] " + str15);
		
		// 6. trim()
		MyUtil.p("[trim()] " + "    eoifheiofhoefh    ".trim());
		
		// 7. split()
		String str16 = "Heaven helps those who helps themselves.";
		
		String[] str17 = str16.split(" helps ");
		for(String str : str17) {
			MyUtil.p("[split()] " + str);
		}
		
		String[] str18 = str16.split(" ");  // 공백으로 나누면 단어별
		for(String str : str18) {
			MyUtil.p("[split()] " + str.replace(".",""));
		}
		
		String[] str19 = str16.split("");  // ""를 인자로 사용하면 한 글자씩
		for(String str : str19) {
			MyUtil.p("[split()] " + str);
		}
		
		// space, "e", "t" 글자로 구분하고 싶다?
		String[] str20 = str16.split("[ et]");
		for(String str : str20) {
			MyUtil.p("[split()] " + str);
		}
		
		// 8. matches()
		String str21 = "010-28653-3512853723";
		// 숫자와 -만으로 1글자에서 25자 사이인가?
		String checkRule = "[0-8-]{1,25}";
		boolean result = str21.matches(checkRule);
		MyUtil.p("[matches()] " + result);
		
		String nameRule = "[A-Za-z가-힣]{1,6}";  // 문자이면서 6글자 이하
		MyUtil.p("[matches()] " + "Bacons".matches(nameRule));
		
		String phoneNum = getPhoneNumber("011-3443-3443");
		MyUtil.p("[getPhoneNumber()] " + phoneNum);
	}
	
	private static String getPhoneNumber(String checknumber) {
		String result = "";
		
		// 전화번호 타입인지 체크한다.
		// 숫자3자리 + "-" + 숫자3~4자리 + "-" + 숫자4자리
		// Rule을 통과할 경우 마지막 4자리는 ****하여 return
		// Rule을 통과하지 못할 경우 "올바른 타입이 아닙니다" return
		String checkRule = "[0-9]{3}[-]{1}[0-9]{3,4}[-]{1}[0-9]{4}";
		if(checknumber.matches(checkRule)) {
			/*
			String lastnum = checknumber.substring(checknumber.length()-4);
			result = checknumber.replace(lastnum, "****");  // 가운데와 마지막 숫자가 동일한 경우 결함
			*/
			
			String prefix = checknumber.substring(0, checknumber.length()-4);
			result = prefix + "****";
		}
		else {
			result = "올바른 타입이 아닙니다.";
		}
		return result;
	}

}
