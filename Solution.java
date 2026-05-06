class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int total = nums1.length + nums2.length;
		int mid = total / 2;
		double previous = 0;
		double current = 0;
		int i = 0;
		int j = 0;
		
		for (int m = 0; m <= mid; m++) {
			
			previous = current;
			
			if (i == nums1.length) {
				current = nums2[j];
				j++;
			} else if (j == nums2.length) {
				current = nums1[i];
				i++;
			} else if (nums1[i] <= nums2[j]) {
				current = nums1[i];
				i++;
			} else {
				current = nums2[j];
				j++;
			}
		}
		
		double median;
		
		if (total % 2 == 0) {
			median = (previous + current) / 2;
		} else {
			median = current;
		}
		
		return median;
	}
}