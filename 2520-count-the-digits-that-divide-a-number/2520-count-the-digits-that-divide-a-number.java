class Solution {
    public int countDigits(int num) {
        int ans =0;
        int dig = num;
        while(num>0){
            int rem = num%10;
            if(dig%rem == 0) ans++;
            num= num/10;
        }
        return ans;
    }
}