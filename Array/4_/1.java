//暴力求解法
//时间复杂度： (n + m)log(m + n)
//空间复杂度： n + m
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int[] a = new int[nums2.length + nums1.length];

    	for(int i = 0; i < nums1.length; i++){
    		a[i] = nums1[i];
    	}
    	for(int i = 0; i < nums2.length; i++){
    		a[i + nums1.length] = nums2[i];
    	}
    	Arrays.sort(a);
    	int len = nums2.length + nums1.length;
    	if(len % 2 == 0){
    		return (a[len / 2] + a[len / 2 - 1]) / 2.0;

    	}else{
    		return a[len/2];
    	}

    }
}