package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test verification...");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("Tests completed successfully!");
    }

    @Before
    public void initTest() {
        calculator = new Calculator();
    }

    @After
    public void afterTest() {
        calculator = null;
    }

    @Test
    public void testGetSum() throws Exception {
        assertEquals(15, calculator.getSum(7,8));
    }

    @Test
    public void testGetDivide() throws Exception {
        assertEquals(20, calculator.getDivide(100,5));
    }

    @Test
    public void testGetSubtract() throws Exception {
        assertEquals(30, calculator.getSubtract(100,70));
    }

    @Test
    public void testGetMultiple() throws Exception {
        assertEquals(25, calculator.getMultiple(5,5));
    }

    @Test(expected = ArithmeticException.class)
    public void divisionWithException() {
        calculator.getDivide(15,0);
    }
}
