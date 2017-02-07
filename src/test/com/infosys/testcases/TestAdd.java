package test.com.infosys.testcases;

import main.com.infosys.testsrc.Add;
import org.junit.Test;
import junit.framework.TestCase;

public class TestAdd extends TestCase {
    Add add = new Add();



    @Test
    public void testAddition(){
        int actualResult = add.addition(2,3);
        int expectedResult = 5;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPrintResult(){
        int actualResult = add.printResult(5);
        int expectedResult = 10;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testPrintResultFailure(){
        int actualResult = add.printResult(0);
        int expectedResult = 0;
        assertEquals(expectedResult,actualResult);
    }


    @Test
    public void testCheckCondition(){
        int actualResult = add.checkCondition(6);
        int expectedResult = 12;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testCheckConditionFailure(){
        int actualResult = add.checkCondition(3);
        int expectedResult = 9;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testValidate(){
        boolean actualResult = add.validate(7);
        boolean expectedResult = true;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testWhileCheck(){
        int actualResult = add.whileCheck(4,1);
        int expectedResult = 7;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testWhileCheckFailure(){
        int actualResult = add.whileCheck(1,4);
        int expectedResult = 0;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testdoWhileCheck(){
        int actualResult = add.doWhileCheck(4,1);
        int expectedResult = 7;
        assertEquals(expectedResult,actualResult);
    }
}