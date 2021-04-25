class Solution {
    public int cuttingRope(int n) {
    	if(n == 2)
    		return 1;
    	if(n == 3)
    		return 2;


    	int m = n/3;
    	int m1;
    	if(n - m * 3 == 1){
    		m--;
    		m1 = 4;
    	}
    	else if(n - m * 3 == 2){
    		m1 = 2;
    	}
    	else{
    		m1 = 1;
    	}

    	int multiply = 1;
    	for(int i = 0; i < m; i++){
    		multiply = multiply * 3;
    	}
    	multiply = multiply * m1;

    	return multiply;
    }
}