class Solution {
    public int[] searchRange(int[] nums, int target) {
        int stin=searchst(nums,target);
        int edn=searchEnd(nums,target);
        if(stin==-1){
            return new int[]{-1,-1};
        }
        return new int[]{stin,edn};
    }
    public int searchst(int[]nums,int target){
        int l=0;
        int h=nums.length-1;
        int idx=-1;
        while(l<=h){
            int mid=(h+l)/2;
            if(nums[mid]==target){
                idx=mid;
                h=idx-1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else{
                h=mid-1;
            }


        }
        return idx;
    }
    public int searchEnd(int []nums,int target){
        int l=0;
        int h=nums.length-1;
        int idx=-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(nums[mid]==target){
            idx=mid;
            l=mid+1;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else {
                h=mid-1;
            }

        }
        return idx;
    }
}
