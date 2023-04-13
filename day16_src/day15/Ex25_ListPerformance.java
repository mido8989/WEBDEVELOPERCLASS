package day15;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex25_ListPerformance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. read
		ArrayList applicant1 = new ArrayList();
		LinkedList applicant2 = new LinkedList();
		
		for(int i=0;i<100000;i++) {
			applicant1.add(i);
			applicant2.add(i);
		}
		
		long start = System.currentTimeMillis();
		System.out.println(start);
		long end = System.currentTimeMillis();
		System.out.println(end-start);
		long mid;
		
		start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			applicant1.get(i);
		}
		mid = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			applicant2.get(i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("***** read competition *****");
		long elap1 = mid - start;
		long elap2 = end - mid;
		System.out.println("Applicant1 : " + elap1 + "(ms)");
		System.out.println("Applicant2 : " + elap2 + "(ms)");
		System.out.println();
		
		// 2. insert
		final int SAMPLES = 100000;
		
		start = System.currentTimeMillis();
		for(int i=0;i<SAMPLES;i++) {
			applicant1.add(50000, i);
		}
		mid = System.currentTimeMillis();
		for(int i=0;i<SAMPLES;i++) {
			applicant2.add(50000, i);
		}
		end = System.currentTimeMillis();
		
		System.out.println("***** insert competition *****");
		elap1 = mid - start;
		elap2 = end - mid;
		System.out.println("Applicant1 : " + elap1 + "(ms)");
		System.out.println("Applicant2 : " + elap2 + "(ms)");
		System.out.println();
	}

}
	


