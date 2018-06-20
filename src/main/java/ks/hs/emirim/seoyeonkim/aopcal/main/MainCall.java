package ks.hs.emirim.seoyeonkim.aopcal.main;

import ks.hs.emirim.seoyeonkim.aopcal.cal.Calculator;
import ks.hs.emirim.seoyeonkim.aopcal.cal.ImpCalculator;
import ks.hs.emirim.seoyeonkim.aopcal.cal.RecCalculator;

public class MainCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=10000;
		long start1 = System.currentTimeMillis();
		Calculator cal1= new ImpCalculator();
		long f1= cal1.factorial(num);
		long end1 = System.currentTimeMillis();
		System.out.printf("Imp factorial(%d); 실행시간 =%d ", num, (end1-start1));
		
		System.out.println("\n");
		long start2 = System.currentTimeMillis();
		Calculator cal2= new RecCalculator();
		long f2= cal2.factorial(num);
		long end2 = System.currentTimeMillis();
		System.out.printf("Rec factorial(%d); 실행시간 =%d ", num, (end2-start2));
	}

}
