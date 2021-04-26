class Solution {
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        buildMaxDeap(nums, len);

        for(int i = nums.length - 1; i > nums.length - k; i--){
            swap(nums, i, 0);
            len--;
            riseDeap(0, nums, len);//len可以减小，是这个用处
        }
        return nums[0];
    }

    public void buildMaxDeap(int[] nums, int len){
        for(int i = len/2; i >= 0; i--){
            riseDeap(i, nums, len);
        }
    }
    public void riseDeap(int i, int nums[], int len){
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int biggest = i;
        
        if(l < len && nums[l] > nums[biggest]){
            biggest = l;
        }
        if(r < len && nums[r] > nums[biggest]){
            biggest = r;
        }

        if(biggest != i){//用biggest进行交换
            swap(nums, i, biggest);
            riseDeap(biggest, nums, len);//进行下沉操作
        }
    }

    public void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}