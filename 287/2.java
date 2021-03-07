class Solution {
    //二分法，限制使用在该题中
    //二分法的时间复杂度为O(log(n))，内循环为O(n)，本题中时间复杂度为O(nlog(n)),空间为1；
    public int findDuplicate(int[] nums) {

        int left = 1;
        int right = nums.length - 1;

        while(left < right){
            int mid = (right + left)>>>1;

            int number = 0;
            for(int num:nums){
                if(num <= mid){
                    number = number + 1;
                }
            }

            if(number > mid){
                right = mid;
            }   
            else{
                left = mid + 1;
            }

        }
        return left;
    }
}