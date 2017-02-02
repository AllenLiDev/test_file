package changeFileName;

/**
 * class to change an input file name to desired output
 * 
 * uses substring method BIG-O(n)
 * 
 * @author allli
 * @version 1.0
 */
public class ChangeFilename {

	private static final String PREFIX = "Statement - ";
	private static final String UNDERSCORE = "_";
	private static final int LOC_FIRST = 4;
	private static final int LOC_SECOND = 6;
	private static final int LOC_THIRD = 8;

	/**
	 * Constructor
	 */
	ChangeFilename() {
		System.out.println("new changename created");
	}

	/**
	 * changes filename into correct output format
	 * @param input
	 * @return
	 */
	public String changeIt(String input) {
		String output = PREFIX + getDate(input) + getReferenceNumber(input);
		return output;
	}

	/**
	 * gets the date
	 * @param input
	 * @return
	 */
	private String getDate(String input) {
		int first;
		first = input.indexOf(UNDERSCORE, input.indexOf(UNDERSCORE) + 1) + 1;
		return "" + input.substring(first + LOC_SECOND, first + LOC_THIRD)
				+ getMonth(input.substring(first + LOC_FIRST, first + LOC_SECOND))
				+ input.substring(first, first + LOC_FIRST);
	}

	/**
	 * gets the specific month
	 * @param substring
	 * @return
	 */
	private String getMonth(String substring) {
		String temp;
		switch (substring) {
		case "01":
			temp = "JAN";
			break;
		case "02":
			temp = "FEB";
			break;
		case "03":
			temp = "MAR";
			break;
		case "04":
			temp = "APR";
			break;
		case "05":
			temp = "MAY";
			break;
		case "06":
			temp = "JUN";
			break;
		case "07":
			temp = "JUL";
			break;
		case "08":
			temp = "AUG";
			break;
		case "09":
			temp = "SEP";
			break;
		case "10":
			temp = "OCT";
			break;
		case "11":
			temp = "NOV";
			break;
		case "12":
			temp = "DEC";
			break;
		default:
			temp = "Incorrect Value";
			break;

		}
		return " " + temp + " ";
	}

	/**
	 * gets the reference number
	 * @param input
	 * @return
	 */
	private String getReferenceNumber(String input) {
		int start;
		int end;
		end = input.lastIndexOf(UNDERSCORE);
		start = input.lastIndexOf(UNDERSCORE, end - 1) + 1;
		return " - " + input.substring(start, end);
	}
}
