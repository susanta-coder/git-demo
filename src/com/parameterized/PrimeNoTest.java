package com.parameterized;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class PrimeNoTest {
	private  Integer primeNo;
	private  Boolean primeflag;
	PrimeNumberPrint primeNoPrint;
	
	@Before
	public void initialize() {
		primeNoPrint=new PrimeNumberPrint();
		
	}

	public PrimeNoTest(Integer primeNo, Boolean primeflag) {
		super();
		this.primeNo = primeNo;
		this.primeflag = primeflag;
	}
	
	public static Collection parameterSet() {
		PrimeNoTest pp=new PrimeNoTest(2, true);
		PrimeNoTest pp1=new PrimeNoTest(3, false);
		PrimeNoTest pp2=new PrimeNoTest(4, true);
		PrimeNoTest pp3=new PrimeNoTest(5, false);
		ArrayList<PrimeNoTest> l=new ArrayList<>();
		l.add(pp);
		l.add(pp1);
		l.add(pp2);
		l.add(pp3);
		return l;
	}
	
	@Parameterized.Parameters
	public static Collection primeNumber() {
		return Arrays.asList(new Object[][] {{2,true},{3,true},{4,false}});
	}
	
	//This test will run 5 time since we have 5 parameter defined
	@Test
	public void testPrimeNochecker() {
		System.out.println("excepted value"+primeflag);
		assertEquals(primeflag, primeNoPrint.validate(primeNo));
	}
	

}
