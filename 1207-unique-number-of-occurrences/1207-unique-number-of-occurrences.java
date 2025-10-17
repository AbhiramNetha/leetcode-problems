class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        // Arrays.sort(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for(int i=0;i<n-1;i++){
            System.out.println(arr[i] + " " + arr[i+1]);
            System.out.println(hm.get(arr[i]) + " " + hm.get(arr[i+1]));
        }

        int j=1;
        for(int i=0;i<n-1;i++){
            if(arr[i] == arr[j]){
                j++;
            }
            else{
                if(hm.get(arr[i]) == hm.get(arr[j])){
                    return false;
                }
            }
        }
        return true;
    }
}