import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class FormulaProcessorTest {

    FormulaProcessor formulaProcessor;

    @Before
    public void init(){
        formulaProcessor = new FormulaProcessor();
    }

    @Test
    public void testFormulaIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            formulaProcessor.formulaIsNull("");
        });
        assertThrows(IllegalArgumentException.class, () -> {
            formulaProcessor.formulaIsNull("   ");
        });
        formulaProcessor.formulaIsNull("  ");
    }

    @Test
    public void testOperatorChecker(){
        assertTrue(formulaProcessor.operatorChecker("+"));
    }
}