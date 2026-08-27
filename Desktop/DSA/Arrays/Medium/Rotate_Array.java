class Solution {
    public void rotate(int[] nums, int k) {
        //Brute force
        // int arx[] = new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     arx[(i+k)%nums.length] = nums[i];
        // }
        // for(int i=0;i<nums.length;i++)
        // nums[i] = arx[i];

        //Optimal Approach using reverse logic
        k = k % nums.length;
        if(k<0){
            k+=nums.length;
        }
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);

    }
    private void reverse(int arr[],int left,int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}