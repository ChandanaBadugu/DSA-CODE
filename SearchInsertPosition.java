class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0; 
        
        int right = nums.length-1;
        int ans = 0;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target){
                ans = mid;
                break;
            }
            if(nums[mid] > target){
                right = mid-1;
            }
            
            if(nums[mid] < target){
                left = mid+1;
                ans = left;
            }
        }
        return ans;
        
    }
}
