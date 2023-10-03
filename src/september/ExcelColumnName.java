package september;

public class ExcelColumnName {
	private static String colName(long columnNumber) {
		StringBuilder sb = new StringBuilder();
		char ch = 'a';
		while (columnNumber > 0) {
			columnNumber--;
			ch = (char) (columnNumber % 26 + 65);
			columnNumber /= 26;
			sb.append(ch);
		}
		return sb.reverse().toString();
	}

	public static void main(String[] args) {
		long n = 28;
		System.out.println(colName(n));
	}

}
