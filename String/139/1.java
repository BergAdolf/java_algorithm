//动态规划
//时间复杂度：O(n^2)
//空间复杂度：O(n)
public class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
   		Set<String> set = new HashSet<>(wordDict);
   		boolean[] flag = new boolean[s.length() + 1];
   		flag[0] = true;
   		for(int i = 1; i <= s.length(); i++){
   			for(int j = 0; j < s.length(); j++){
   				if(flag[j] && set.contains(s.subString(j, i))){
   					flag[i] = true;
   					break;
   				}
   			}
   		}

    }
}