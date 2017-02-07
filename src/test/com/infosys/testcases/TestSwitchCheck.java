package test.com.infosys.testcases;

import main.com.infosys.testsrc.SwitchCheck;
import junit.framework.TestCase;
import org.junit.Test;

public class TestSwitchCheck extends TestCase {
    SwitchCheck switchCheck = new SwitchCheck();


    @Test
    public void testSwitchCheckValidCase(){
        String actual = switchCheck.switchCheck('A');
        String expected = "Excellent!";
        assertEquals(expected,actual);
    }

    @Test
    public void testSwitchCheckInvalidCase(){
        String actual = switchCheck.switchCheck('Z');
        String expected = "Invalid grade";
        assertEquals(expected,actual);
    }

    @Test
    public void testNestedSwitchCheckValidCaseAdd(){
        int actual = switchCheck.checkNestedSwitch('A',3,1);
        int expected = 4;
        assertEquals(expected,actual);
    }

    @Test
    public void testNestedSwitchCheckValidCaseSubtract(){
        int actual = switchCheck.checkNestedSwitch('S',3,1);
        int expected = 2;
        assertEquals(expected,actual);
    }

    @Test
    public void testNestedSwitchCheckValidCaseMultiply(){
        int actual = switchCheck.checkNestedSwitch('M',3,2);
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void testNestedSwitchCheckInvalidCase(){
        testNestedSwitchCheckValidCaseSubtract();
        int actual = switchCheck.checkNestedSwitch('Z',3,1);
        int expected = 333333333;
        assertEquals(expected,actual);
    }
}