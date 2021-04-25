//二维数组的使用以及二维数组返回
//初始值的设定
class Solution {
    public int[][] findContinuousSequence(int target) {
    	int left = 1;
    	int right = 1;

    	int[][] nums;
    	List<int []> list = new ArrayList<>();
    	//int[] list1 = new int[];
    	int sumTemp = 1;

    	while(right == 1 || right != left){
    		if(sumTemp > target){
    			sumTemp = sumTemp - left;
    			left++;

    		}else if(sumTemp < target){
                right++;
    			sumTemp = sumTemp + right;
    			

    		}else{  
                int[] a = new int[right - left + 1];
                int temp = left;
                for(int i = 0; i < right - left + 1; i++){
                  a[i] = temp;
                  temp++;
                }
                list.add(a);
    			sumTemp = sumTemp - left;
    			left++;
    		}
    	}
    	return list.stream().mapToInt(Integer::intValue).toArray();
    }
}