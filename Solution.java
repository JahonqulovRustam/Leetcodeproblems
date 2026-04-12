
class Solution {
	
	public boolean isValid(String s) {
		
		if (s.length() % 2 == 1) return false;
		
		StringBuilder sb = new StringBuilder(s);
		boolean isFound = true;
		
		while (isFound) {
			isFound = false;
			
			for (int i = 1; i < sb.length(); i++) {
				
				char prev = sb.charAt(i - 1);
				char curr = sb.charAt(i);
				
				if (
					(prev == '(' && curr == ')') ||
					(prev == '{' && curr == '}') ||
					(prev == '[' && curr == ']')) {
					
					isFound = true;
					sb.delete(i - 1, i + 1);
					break;
				}
			}
		}
		
		return sb.isEmpty();
	}
}