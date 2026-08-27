class Solution {
    public int removeDuplicates(int[] nums) {
        
        int non_duplicate = 1;
        int j = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]!=0){
                non_duplicate++;
                nums[j]=nums[i];
                if(j<nums.length)
                j++;
            }
            
        }
        return non_duplicate;
    }
}