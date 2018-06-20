package ks.hs.emirim.seoyeonkim.aopcal.main;

import ks.hs.emirim.seoyeonkim.aopcal.cal.Calculator;
import ks.hs.emirim.seoyeonkim.aopcal.cal.ImpCalculator;
import ks.hs.emirim.seoyeonkim.aopcal.cal.RecCalculator;

public class MainNano {
	public static void main(String[] args) {
	long num=10000;
	long start1 = System.nanoTime();
	Calculator cal1= new ImpCalculator();
	long f1= cal1.factorial(num);
	long end1 = System.nanoTime();
	System.out.printf("Imp factorial(%d); 실행시간 =%d ", num, (end1-start1));
	
	System.out.println("\n");
	long start2 = System.nanoTime();
	Calculator cal2= new RecCalculator();
	long f2= cal2.factorial(num);
	long end2 = System.nanoTime();
	System.out.printf("Rec factorial(%d); 실행시간 =%d ", num, (end2-start2));
	}
}
