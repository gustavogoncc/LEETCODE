public class Parenteses {
	public static void main(String[]args) {
		String s = "[()]";
		
		if(isParenteses(s)) {
			System.out.println("A string de entrada é válida.");
		}else {
			System.out.println("A string de entrada não é válida.");
		}
	}
	public static boolean isParenteses(String s) {
		Stack<Character> stack = new Stack<>();
		for (char c: s.toCharArray()) {
			if( c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}else if ( c == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			}else if ( c == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			}else if ( c == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			}else {
				return false;
			}
		}
		
		return stack.isEmpty();
		    
    }
	
}
