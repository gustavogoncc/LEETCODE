public class ZigZagConversation {
	public static String convert(String s, int numRows) {
		int len = s.length();
		char[] result = new char [len];
		int row = 0;
		int col = 0;
		boolean down = true;
		for(int i = 0; i < len; i++) {
			result[col] = s.charAt(i);
			col++;
			if(row == 0) {
				down = true;
			}else if( row == numRows -1) {
				down = false;
			}
			if(down) {
				row++;
			}else {
				row--;
			}
		}
		return new String(result);
	}
	public static void main(String[]args) {
		String s = "PAYPALISHRING";
		int numRows = 3;
		System.out.println(convert(s,numRows));
	}

}
