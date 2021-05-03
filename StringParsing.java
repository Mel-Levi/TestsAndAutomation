public class StringParsing {
    private static final int NO_INDEX = -1;
    private static final int NEXT_CHAR = 1;

    /* ================== */

    public static int countSubstringAppearance(String str, String subStrToFind) {
	int strLength = str.length();
	int subStrLength = subStrToFind.length();
	int counter = 0;
	int i = 0;

	if (strLength < subStrLength) {
	    return counter;
	}

	while (i < strLength) {
	    int currSubstrIdx = str.indexOf(subStrToFind, i);

	    if (NO_INDEX != currSubstrIdx) {
		++counter;
		i = currSubstrIdx + NEXT_CHAR;
	    } else {
		break;
	    }
	}

	return counter;
    }

    /* ================== */

    public static String[] identifyAgeAndName(String str) {
	String[] strArr = str.split(" ");

	return new String[] {strArr[1], strArr[3]};
    }

    /* ================== */

    public static String reverseString(String str) {
	StringBuilder strBuilder = new StringBuilder(str);
	strBuilder.reverse();

	return strBuilder.toString();
    }
}
