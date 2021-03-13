class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a = new int[nums2.length + nums1.length];

        int hand = 0;
        int hand2 = 0;
        while(hand != nums1.length && hand2 != nums2.length){
            if(nums1[hand] > nums2[hand2]){
                a[hand + hand2] = nums2[hand2];
                hand2++; 
            }
            else{
                a[hand + hand2] = nums1[hand];
                hand++;
            }   
        }
        while(hand2 != nums2.length){
            a[hand + hand2] = nums2[hand2];
            hand2++;
        }
        while(hand != nums1.length){
            a[hand + hand2] = nums1[hand];
            hand++;
        }
        int len = nums1.length + nums2.length;
        if(len % 2 == 0){
            return (a[len/2] + a[len/2 - 1]) / 2.0;
        }
        else{
            return a[len/2];
        }    
        
    }
}