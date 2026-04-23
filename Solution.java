class Solution {
	
	public boolean isValid(String word) {
		
		 if (word.length() < 3) return false;
		 
		 int count1 = 0;
		 int count2 = 0;
		 for (char c : word.toCharArray()) {
			 
			 if (!Character.isLetterOrDigit(c)) {
				 return false;
			 }
			 
			if (Character.isLetter(c)) {
				
				char l = Character.toLowerCase(c);
				if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l== 'u') {
					count1++;
				}
				else {
					count2++;
				}
			}
		 }
		
		return count1 > 0 && count2 > 0;
	}
}