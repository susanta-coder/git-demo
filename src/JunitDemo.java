import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class JunitDemo {
	static int beforeClass=0;
	static int before=0;
	static int testcount=0;
	static int after=0;
	static int afterClass=0;
//it will execute only once
	@BeforeClass
 public void setupClass() {
	 System.out.println("Execution of before class:::"+beforeClass++);
 }
	
	//it will execute before every test run
	
	@Before
	 public void setUp() {
		 System.out.println("Execution of before:::"+before++);
	 }
 
	//it will run when test is executed
	
	@Test
	void test() {
		System.out.println("\tFirst Test case is executed:::"+testcount++);
	}
	@Test
	void test1() {
		System.out.println("\tSecond Test case is executed:::"+testcount++);
	}
	
	@Test
	void test3() {
		System.out.println("\tThird Test case is executed:::"+testcount++);
	}
	
	@Test
	void test4() {
		System.out.println("\tFourth Test case is executed:::"+testcount++);
	}
	
	@Test
	void test5() {
		System.out.println("\tFifth Test case is executed:::"+testcount++);
	}
	
	//it will execute after every test run
	@After
	 public void tearDown() {
		 System.out.println("Execution of before:::"+after++);
	 }
	
	//it will execute only once 
	@AfterClass
	 public void teardownClass() {
		 System.out.println("Execution of before class:::"+afterClass++);
	 }
		
		
	
	

}
