package test.com.infosys.testcases;

import main.com.infosys.testsrc.NestedCheck;
import junit.framework.TestCase;
import org.junit.Test;

public class TestNestedCheck extends TestCase {
    NestedCheck nestedCheck = new NestedCheck();


    @Test
    public void testCheckEven(){
        boolean actual = nestedCheck.checkEven(3);
        boolean expected = false;
        assertEquals(expected,actual);
    }

    @Test
    public void testCheckEvenOrOdd(){
        boolean actual = nestedCheck.checkEvenOrOdd(9);
        boolean expected = true;
        assertEquals(expected,actual);
    }
}