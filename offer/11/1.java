class Solution {
    public String reverseLeftWords(String s, int n) {
        return (s.substring(k, s.length())+ s.substring(0, k+1));
    }
}
class Solution {
    public String reverseLeftWords(String s, int n) {
        StringBuilder res = new StringBuilder();
        for(int i = n; i < n + s.length(); i++)
            res.append(s.charAt(i % s.length()));
        return res.toString();
    }
}