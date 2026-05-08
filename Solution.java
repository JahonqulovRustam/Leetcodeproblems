
import java.util.*;

class Solution {
		public int[] sort(int[] array) {
			
			TreeMap<Integer, Integer> map = new TreeMap<>();
			for (int num : array) {
				map.put(num, map.getOrDefault(num, 0) +1);
			}
			
			int j = 0;
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
				for (int i = 0; i < entry.getValue(); i++) {
					array[j++] = entry.getKey();
				}
			}
			
			return array;
		}
}