class Solution {
    public int reverse(int x) {
        int num =x;
        if(x<0) num*=(-1);
        int lastdig =0;
        while(num>0){
            int rem = num%10;
            num= num/10;
            if(lastdig> Integer.MAX_VALUE/10 || lastdig< Integer.MIN_VALUE/10) return 0;
            lastdig = (lastdig*10) + rem;
            
        }
        return (x<0) ? lastdig*=-1 : lastdig;
    }
}