import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;

class Test2 extends TestResult{
	
	//Add the error
	public  synchronized void addError(Test test,Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}
	
	//Add the failure
	public  synchronized void addFailure(Test test,AssertionFailedError t) {
		super.addError((junit.framework.Test) test, t);
	}
	
	@Test
	void testAdd() {
		Assert.assertEquals(5, 6);
	}
	public  synchronized void stop() {
		//stop the test here
		
	}

}
