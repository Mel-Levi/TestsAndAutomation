import org.junit.Assert;
import org.junit.Test;

public class JUnitTestParsing {
    @Test
    public void testParsingString1() {
	String input = "repetition foo 1 2 3, - repetition, *repetition*";
	String stringToFind = "repetition";

	int expected = 3;
	int actual = StringParsing.countSubstringAppearance(input, stringToFind);

	Assert.assertEquals(expected, actual);
    }

    /* ================== */

    @Test
    public void testParsingString2() {
	String input = "age 25 name joe";

	int expectedAge = 25;
	String expectedName = "joe";

	String[] ageAndNameArr = StringParsing.identifyAgeAndName(input);

	int actualAge = Integer.parseInt(ageAndNameArr[0]);
	String actualName = ageAndNameArr[1];

	Assert.assertEquals(expectedAge, actualAge);
	Assert.assertEquals(expectedName, actualName);
    }

    /* ================== */

    @Test
    public void testParsingreverseString() {
	String input = "abc123xyz";
	
	String expected = "zyx321cba";
	String actual = StringParsing.reverseString(input);

	Assert.assertEquals(expected, actual);
    }
}
