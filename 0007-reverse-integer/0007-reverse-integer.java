class Solution {
    public int reverse(int x) {
        int cnt =0;
        int reversenum =0;
        int n = x;
        if(n<0) n*=-1; 
        while(n>0){
            int lastdig = n%10;
            n=n/10;
            cnt++;
            reversenum = (reversenum * 10) + lastdig;
        }
        if(x<0) reversenum*=-1;
        if(reversenum > Integer.MAX_VALUE || reversenum < Integer.MIN_VALUE) return 0;
        return reversenum;
    }
}