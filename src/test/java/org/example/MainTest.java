package org.example;

import org.example.Main;
import org.junit.Assert;
import org.junit.Test;

public class MainTest {
	
    @Test
    public void test_addition() {

        double a = 33.3;
        double b = 22.2;
        double expec_res = 55.5;
	double res = Main.addition(a,b);
        Assert.assertEquals(expec_res, res, 0.00001);
    }
    
    @Test
    public void test_subtraction() {

        double a = 33.3;
        double b = 22.2;
        double expec_res = 11.1;
	double res = Main.subtraction(a,b);
        Assert.assertEquals(expec_res, res, 0.00001);
    }
    
    @Test
    public void test_multiplication() {

        double a = 5.5;
        double b = 4;
        double expec_res = 22.0;
	double res = Main.multiplication(a,b);
        Assert.assertEquals(expec_res, res, 0.00001);
    }
    
    @Test
    public void test_division() {

        double a = 15.5;
        double b = 5;
        double expec_res = 3.1;
	double res = Main.division(a,b);
        Assert.assertEquals(expec_res, res, 0.00001);
    }
    
}
