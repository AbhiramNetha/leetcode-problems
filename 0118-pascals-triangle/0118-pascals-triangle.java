class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> frstRow = new ArrayList<>();
        frstRow.add(1);
        ans.add(frstRow);

        for(int i=1;i<numRows;i++){
            List<Integer> tempRows = new ArrayList<>();
            tempRows.add(1);
            for(int j=1;j<i;j++){
                int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                tempRows.add(val);
            }

            tempRows.add(1);
            ans.add(tempRows);
        }
        return ans;
    }
}