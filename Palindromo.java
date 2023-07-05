public class Palindromo {
	public static boolean isPalindrome(int x) {
		if(x < 0 || (x % 10 == 0 && x != 0)) {
			return false;
		}
		int reversed = 0;
		int original = x;
		
		while (x > 0) {
			reversed = reversed * 10 + x %10;
			x /= 10;
		}
		return reversed == original;
	}
	public static void main(String[]args) {
		int num1 = 121;
		int num2 = 1234;
		int num3 = 12345;
		
		System.out.println(num1 + "é palíndromo?"+isPalindrome(num1));
		System.out.println(num2 + "é palíndromo?"+ isPalindrome(num2));
		System.out.println(num3 + "é palíndromo?" + isPalindrome(num3));
	}

}
