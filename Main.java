public class Main {
	public static void main(String [] args) {
		String s1 = "()";
		String s2 = "))((";
		String s3 = "(())";
		String s4 = ")))()";
		String s5 = "()()";
		String s6 = "())";
		String s7 = ")()(";
		assert isValid(s1);
		assert !isValid(s2);
		assert isValid(s3);
		
		assert !isValid(s4);
		assert  isValid(s5);
		assert !isValid(s6);
		assert !isValid(s7);
	}
	//  ({[]})()[]
	static boolean isValid(String s) {
		
		int count = -1;
		char[] chars = new char[s.length()];
		
		for (char c : s.toCharArray()) {
			
			if (c == '(' || c == '{' || c == '[') {
				chars[++count] = c;
			} else {
				if (count == -1) return false;
				
				char last = chars[count--];
				if (c == ')' && last != '(' ||
					c == '}' && last != '{' ||
					c == ']' && last != '[') {
					
					return false;
				}
			}
		}
		
		return count == -1;
	}
	
}
