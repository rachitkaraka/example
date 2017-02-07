package test.com.infosys.testcases;

import main.com.infosys.testsrc.Multiply;
import junit.framework.TestCase;
import org.junit.*;

public class TestMultiply extends TestCase {


    @Test
    public void testMultiply(){
        Multiply multiply = new Multiply(2,3);
        int actual = multiply.multiply();
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    public void testCallPrivateMethod(){
        Multiply multiply = new Multiply();
        int actual = (int) multiply.callPrivateMethod(5,6);
        int expected = 30;
        assertEquals(expected,actual);
    }
}
