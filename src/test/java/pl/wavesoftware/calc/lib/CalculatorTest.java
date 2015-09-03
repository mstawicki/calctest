/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.wavesoftware.calc.lib;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author Krzysztof Suszyński <krzysztof.suszynski@wavesoftware.pl>
 */
public class CalculatorTest {

    @org.junit.Test
    public void testAdd_zero() {
        int a = 0;
        int b = 0;
        Calculator instance = new Calculator();
        int expResult = 0;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testAdd_nonzero() {
        int a = 78;
        int b = 2;
        Calculator instance = new Calculator();
        int expResult = 80;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testAdd_overflow() {
        int a = Integer.MAX_VALUE;
        int b = 1;
        Calculator instance = new Calculator();
        int expResult = Integer.MIN_VALUE;
        int result = instance.add(a, b);
        assertEquals(expResult, result);
    }

}
