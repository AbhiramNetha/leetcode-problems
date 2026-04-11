class Solution {
    // public String word(String s, int l , int r){
    //     StringBuilder sb = new StringBuilder();
    //     if(l==r){
    //         if(s.charAt(l) != ' '){
    //             sb.append(s.charAt(l));
    //             return sb.toString();
    //         }
    //     } 
    //     int n = s.length();
    //     for(int i=l;i<r;i++){
    //         sb.append(s.charAt(i));
    //     }
    //     return sb.toString();
    // }
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String str = s.trim();
        String[] words = str.split(" +");
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    } 
}