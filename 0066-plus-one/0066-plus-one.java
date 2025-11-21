class Solution {
    public int[] plusOne(int[] digits) {
        // int n = digits.length;
        // int ans =0;
        // int len = n;
        // for(int i=0;i<n;i++){
        //     int m = (int)Math.pow(10,len-1);
        //     ans += digits[i] *m;
        //     len--;
        // }
        // ans = ans +1;
        // ArrayList<Integer> list = new ArrayList<>();
        // while(ans>0){
        //     int rem = ans%10;
        //     list.add(rem);
        //     ans /= 10;
        // }
        // int res[] = new int[list.size()];
        // int j=0;
        // for(int i=list.size()-1;i>=0;i--){
        //     res[j] = list.get(i); 
        // }
        // return res;

        for(int i=digits.length-1;i>=0;i--){
            if(digits[i] <9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0; 
        }
        int[] digit = new int[digits.length+1];
        digit[0] = 1;
        return digit;
    }
}