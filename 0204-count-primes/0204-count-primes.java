class Solution {
    // public boolean isprime(int num){
    //     int cnt =0;
    //     for(int i=1;i*i<=num;i++){
    //         if(num%i ==0) cnt+=2;
    //         if(cnt>2) return false;
    //     }
    //     return true;
    // }
    public int countPrimes(int n) {
        // int count =0;
        // for(int i=2;i<n;i++){
        //     if(isprime(i)) count++;
        // }
        // return count;

        int[] isprime = new int[n];
        for(int i=2;i<n;i++){
            isprime[i] =1;
        }
        for(int i=2;i*i<n;i++){
            if(isprime[i] == 1){
                for(int j =i*i;j<n;j+=i){
                    isprime[j] =0;
                }
            }
        }
        int cnt =0;
        for(int i=2;i<n;i++){
            if(isprime[i] == 1) cnt++;
        }
        return cnt;
    }
}