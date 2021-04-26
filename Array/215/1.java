//快速排序
class Solution {
    int index;
    
    public int findKthLargest(int[] nums, int k) {
        index = nums.length - k;
        sort(nums, 0, nums.length - 1);
        return nums[nums.length - k];
    }
    
    public void sort(int[] nums, int left, int right){
        if(left >= right){
            return;
        }
        int r = quickSort(nums, left, right);
        if(r > index){
            sort(nums, left, r - 1);
        }else if(r == index){
            return;
        }else{
            sort(nums, r + 1, right);
        }
    }
    
    public int quickSort(int[] nums, int left, int right){
        
        int r = (int)(Math.random() * (right - left)) + left;
        swap(nums, left, r);

        int l = left + 1;
        r = right;
        while(l < r){
            while(nums[l] <= nums[left] && l < r){
                l++;
            }
            while(nums[r] >= nums[left] && l < r){
                r--;
            }
            if(l < r){
                swap(nums, l, r);
            }
        }
        if(nums[l] < nums[left]){
            swap(nums, left, l);
            return l;
        }else{
            swap(nums, left, l - 1);
            return l - 1;
        }
        //swap(nums, r, left);
        //return r;
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}