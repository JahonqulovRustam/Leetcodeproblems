import java.util.*;

public class Problem {
	
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		
		int prevMin = arr[1] - arr[0];
		for (int i = 1; i < arr.length - 1; i++) {
			int currMin = arr[i+1] - arr[i];
			
			if (currMin < prevMin) {
				prevMin = currMin;
			}
		}
		
		List<List<Integer>> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			if (arr[i+1] - arr[i] == prevMin) {
				
				List<Integer> list1 = new ArrayList<>();
				
				list1.add(arr[i]);
				list1.add(arr[i+1]);
				
				list.add(list1);
			}
		}
		
		return list;
	}
}
