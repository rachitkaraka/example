package test.com.infosys.testlistener;

import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

import com.infy.tracker.TestCaseTracker;
public class ExecutionListener extends RunListener {
	
	public void testStarted(Description description) throws java.lang.Exception
    {
        System.out.println("Starting execution of test case : "+ description.getMethodName());
        System.out.println("test case class: "+ description.getClassName());
        TestCaseTracker testCaseTracker = new TestCaseTracker();
        testCaseTracker.startTestCase();
        testCaseTracker.setTestCaseName(description.getMethodName());
        testCaseTracker.setTestClassName(description.getClassName());
        testCaseTracker.setTestPackageName(description.getClassName());
        testCaseTracker.setTestArgumentsTypes(description.toString());
    }

    public void testFinished(Description description) throws java.lang.Exception
    {
    	TestCaseTracker testCaseTracker = new TestCaseTracker();
        testCaseTracker.endTestCase();
        System.out.println("Finished execution of test case : "+ description.getMethodName());
    }
}
