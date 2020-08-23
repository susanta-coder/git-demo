import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test1 {
	
	int num;
	String temp,str;
	
	void setUp() {
		num=5;
		temp=null;
		str="Susanta Kumar Sahu";
	}



	@Test
	void test() {
		
		//check for equality
		assertEquals("Susanta Kumar Sahu", str);
		
		//check for false condition
		assertFalse(num>6);
		
		//check for not null
		assertNotNull(str);
		
		//check for null
		assertNull(temp);
		
		
		//check for true condition
		assertTrue(num==5);
	}

}
