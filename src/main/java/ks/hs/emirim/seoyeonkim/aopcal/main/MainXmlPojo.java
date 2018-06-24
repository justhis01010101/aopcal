package ks.hs.emirim.seoyeonkim.aopcal.main;
import org.springframework.context.support.GenericXmlApplicationContext;

import ks.hs.emirim.seoyeonkim.aopcal.cal.Calculator;

public class MainXmlPojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericXmlApplicationContext ctx =
				new GenericXmlApplicationContext("classpath:aopPojo.xml");

		Calculator impeCal = ctx.getBean("impeCal", Calculator.class);
		long fiveFact1 = impeCal.factorial(5);
		System.out.println("impeCal.factorial(5) = " + fiveFact1);
		
		Calculator recCal = ctx.getBean("recCal", Calculator.class);
		long fiveFact2 = recCal.factorial(5);
		System.out.println("recCal.factorial(5) = " + fiveFact2);
	}
}