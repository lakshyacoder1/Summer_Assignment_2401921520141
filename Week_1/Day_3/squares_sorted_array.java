class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int idx = nums.length - 1;
        int[] result = new int[nums.length];
        while(l<=r){
            if(nums[l]*nums[l] > nums[r]*nums[r]){
                result[idx] = nums[l]*nums[l];
                l++;
                
            }
            else{
                result[idx] = nums[r]*nums[r];
                r--;
            }
            idx--;
        }
        return result;
    }
}
