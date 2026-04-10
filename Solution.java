public class Solution {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int i = 0, j = 0, k = 0;
		int left = nums1.length;
		int right = nums2.length;
		int mid = (left + right) / 2;
		
		int[] array = new int[left + right];
		
		while (i  < left && j < right) {
			
			if (nums1[i] < nums2[j]) {
				array[k] = nums1[i];
				i++;
			} else {
				array[k] = nums2[j];
				j++;
			}
			
			k++;
			
		}
		
		while (i < left) {
			array[k] = nums1[i];
			i++;
			k++;
		}
		while (j < right) {
			array[k] = nums2[j];
			j++;
			k++;
		}
		
		if((left + right) % 2 == 0) {
			return (array[mid-1]+array[mid])/2.0;
		}
		else{
			return array[mid];
		}
	}
}