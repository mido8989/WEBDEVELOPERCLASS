package day07;

import java.util.Random;

import util.MyUtil;

public class Ex09_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil u = new MyUtil();
		u.p(u.RED + "Array Test" + u.END);
		
		String[] str;
		str = new String[5];
		u.p("str의 현재 길이는 : " + str.length);
		
		// String[] str2 = new String[];
		
		String[] student_name = new String[5];
		String[] student_name2 = {"A","B","C","Abraham","E"};
		
		int[] score_math = new int[5];
		int[] score_java = {10, 20, 10, 30, 20};
		
		// 모든 학생들의 이름과 자바점수를 출력하시오.
		u.p("Heavy Labor");
		u.p("Student[" + student_name2[0] + "] : " + score_java[0] + "점");
		u.p("Student[" + student_name2[1] + "] : " + score_java[1] + "점");
		u.p("Student[" + student_name2[2] + "] : " + score_java[2] + "점");
		u.p("Student[" + student_name2[3] + "] : " + score_java[3] + "점");
		u.p("Student[" + student_name2[4] + "] : " + score_java[4] + "점");
		
		u.p("");
		u.p("Automation");
		for(int i=0;i<student_name2.length;i++) {
			u.p("Student[" + student_name2[i] + "] : " + score_java[i] + "점");
		}
		
		// 2-dimensional array
		String[][] student_with_class = {{"A","B"}, {"C","D"}};
		// A학생
		u.p(student_with_class[0][0]);
		// C학생
		u.p(student_with_class[1][0]);
		
		// 그럼 이것은?
		System.out.println(student_with_class[1]);
		String[] students = student_with_class[1];
		u.p("이것이 나옵니까? " + students[0]);
		
		String[][] characters = {{"hero","sword","blue"}
		           		        ,{"dragon","fire","red"}};
		
		String[] character = characters[1];
		u.p("Character Name : " + character[0]);
		
		// Work
		// int 배열인 worker가 있음
		// worker의 개수는 random(1~100)으로 정한다.
		// 각 worker의 값은 random으로 넣으시오.
		// 전체 worker의 평균을 구하고, "worker 개수는 *개, 평균은 *"라고 출력
		
		Random rd = new Random();
		int size = rd.nextInt(100) + 1;
		int[] worker = new int[size];
		
		// 값 설정하기
		for(int i=0;i<worker.length;i++) {
			worker[i] = rd.nextInt();
		}
		
		// 합계 구하기
		int sum = 0;
		for(int i=0;i<worker.length;i++) {
			sum += worker[i];
		}
		
		u.p("worker 개수는 " + worker.length + "개, 평균은 "
		    + ((float)sum) / worker.length);
		
		// Enhanced For
		String[] seasons = {"Spring", "Summer", "Fall", "Winter"};
		
		for(int i=0;i<seasons.length;i++) {
			u.p("Season : " + seasons[i]);
		}
		
		for(String season : seasons) {
			u.p("Season : " + season);
			// if(season == "Spring") break;
		}
		
		String[][] school = {{"A1","A2","A3"}, {"B1","B2","B3"}};
		
		for(String[] classes : school) {
			for(String student : classes) {
				u.p("Student : " + student);
			}
		}
		
	}

}
