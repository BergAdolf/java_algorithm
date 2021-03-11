class Solution {
    public String minWindow(String s, String t) {
    	int slen = s.length();
    	int tlen = s.length();

    	if(slen < 1|| tlen < 1 || slen < tlen){
    		return "";
    	}
    	//[left,right)
    	int left = 0;
    	int right = 0;
    	int distance = 0;
    	int minLen = slen + 1;
    	int minLeft = 0;

    	char[] charArrayS = s.toCharArray();
    	char[] charArrayT = t.toCharArray();
    	//z的值为122;
    	int[] tnumber = new int[128];
    	int[] snumber = new int[128];

    	for(char c:charArrayT){
    		tnumber[c]++;
    	}

    	while(right < slen){
    		if(tnumber[charArrayS[right]] == 0)
    		{
    			right++;
    			continue;
    		}
    		if(tnumber[charArrayS[right]] > snumber[charArrayS[right]]){
    			distance++;
    		}
    		snumber[charArrayS[right]]++;
    		right++;

    		while(distance == tlen){

    			if(right - left < minLen){
    				minLeft = left; 
    				minLen = right - left; 
    			}

    			if(tnumber[charArrayS[left]] == 0)
	    		{
	    			left++;
	    			continue;
	    		}
	    		if(tnumber[charArrayS[left]] == snumber[charArrayS[left]]){
	    			distance--;
	    		}
	    		snumber[charArrayS[left]]--;
	    		left++;
    		}
    	}
    	if(minLen == slen + 1)
    		return "";
    	return s.substring(left, left + slen);
    }
}