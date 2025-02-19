class Solution {
    public int numIdenticalPairs(int[] nums) {
        int res=0;
        int n[]=new int[101];
        for(int num:nums){
            n[num]++;
        }
        for(int m:n){
            m=m*(m-1)/2;
            res+=m;
        }
        return res;
    }
}
