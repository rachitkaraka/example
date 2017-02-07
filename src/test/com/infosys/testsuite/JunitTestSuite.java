package test.com.infosys.testsuite;

import junit.framework.TestSuite;
import org.junit.runner.JUnitCore;
import test.com.infosys.testlistener.*;
import test.com.infosys.testcases.*;
public class JunitTestSuite { 
	public static void main(String[] args) 
    {
            // Create a JUnit suite
            TestSuite suite = new TestSuite();
            
            // Add every test class you want to the suite
            suite.addTestSuite(TestAdd.class);
            suite.addTestSuite(TestMultiply.class);
            suite.addTestSuite(TestNestedCheck.class);
            suite.addTestSuite(TestSwitchCheck.class);
            // Instantiate a JUniteCore object
            JUnitCore core = new JUnitCore();
            
            // Add TAP Reporter Listener to the core object executor
            core.addListener(new ExecutionListener());
            
            // Run the test suite
            core.run(suite);
    }
} 
