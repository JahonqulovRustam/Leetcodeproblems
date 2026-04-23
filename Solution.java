
class Solution {
	
	public boolean isPalindrome(String s) {
		
		String l = clean(s).toLowerCase();
		
		int i = 0;
		int j = l.length() -1;
		
		while (i <= j) {
			
			if (l.charAt(i) != l.charAt(j)) {
				return false;
			} else {
				i++;
				j--;
			}
		}
		
		return true;
	}
	
	public String clean(String str) {
		StringBuilder sb = new StringBuilder();
		
		for (char c : str.toCharArray()) {
			
			if (Character.isDigit(c) || Character.isLetter(c)) {
				sb.append(c);
			}
		}
		
		return sb.toString();
	}
}