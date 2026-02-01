class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        int i=0;
        Arrays.sort(strs);
        String strt = strs[0];
        String end = strs[n-1];
        int count =0;
        while(i< strt.length() && i< end.length()){
            if(strt.charAt(i) == end.charAt(i)){
                count++;
                i++;
            }
            else{
                break;
            }
        }
        return (count ==0) ? "" : strt.substring(0,count);
    }
}