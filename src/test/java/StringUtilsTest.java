import static org.junit.Assert.*;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class StringUtilsTest {

    @Test
    public void isEmptyTest(){
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void isBlankTest(){
        assertTrue(StringUtils.isBlank("     "));

    }

    @Test
    public void trimTest(){
        assertEquals("1122", StringUtils.trim("  1122\0   "));
    }

    @Test
    public void stripTest(){
        assertNotEquals("1122", StringUtils.strip("  1122\0   "));
    }

    @Test
    public void equalsTest() {
        assertTrue(StringUtils.equals("주정민", "주정민"));
    }

    @Test
    public void compareTest() {
        assertTrue(StringUtils.compare(null, "b") < 0);
    }

    @Test
    public void startsWithTest() {
        assertTrue(StringUtils.startsWith("abc", "a"));
    }

    @Test
    public void endsWithTest() {
        assertFalse(StringUtils.endsWith("주정민", "뱅이"));
    }

    @Test
    public void indexOfTest() {
        assertEquals(1, StringUtils.indexOf("조영아", "영"));
    }

    @Test
    public void lastIndexOfTest() {
        assertEquals(7, StringUtils.lastIndexOf("개똥아똥쌌니아니오", "니"));
    }

    @Test
    public void containsTest() {
        assertTrue(StringUtils.contains("50", "5"));
    }

}
