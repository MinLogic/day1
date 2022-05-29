import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest{
    Calculator cal;
    FormulaProcessor formulaProcessor;

    @Before
    public void calInit() {
        cal  = new Calculator();
        formulaProcessor = new FormulaProcessor();
    }

    @Test
    public void testPlus() {
        assertEquals(4, cal.plus(3,1));
    }

    @Test
    public void testMinus() {
        assertEquals(-1, cal.minus(0,1));
    }

    @Test
    public void testMultiple() {
        assertEquals(100, cal.multiple(10,10));
    }

    @Test
    public void testDivision() {
        assertEquals(5, cal.division(10,2));
        assertThrows(ArithmeticException.class, () -> {
            cal.division(10,0);
        });
    }

    @Test
    public void resultCalculatorTest() {
        String str = "10 + 5 * 4 / 2";
        String[] strList = formulaProcessor.splitFormula(str);
        assertEquals(30, cal.resultCalculator(strList));
    }

    @Test
    public void errorResultCalculatorTest() {
        String str = "10 + 5 * 4 / 2";
        String[] strList = formulaProcessor.splitFormula(str);
        assertEquals(30, cal.resultCalculator(strList));
    }

    @Test
    public void testOperatorCheck(){
        assertThrows(IllegalArgumentException.class, () -> {
           cal.operatorCheck(1, ".", 10);
        });
    }
}