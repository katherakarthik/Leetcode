class Solution {
    public int maxProduct(int[] nums) {
        int product=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int k=(nums[i]-1)*(nums[j]-1);

                if(k>product){
                    product=k;
                }
            }
        }
        return product;
        
    }
}
