class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        int i=2;
        while(i<nums.length){
            if(arr2.get(arr2.size()-1)<arr1.get(arr1.size()-1)){
                arr1.add(nums[i]);
                i++;
            }
            else{
                arr2.add(nums[i]);
                i++;
            }

        }
        arr1.addAll(arr2);
        
        for(int x=0;x<nums.length;x++){
            nums[x] = arr1.get(x);
        }
        
        return nums;
    }
}