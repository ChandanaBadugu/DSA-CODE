class Solution {
    public int jump(int[] nums) {
        if(nums.length==1){
            return 0;
        }

        int max=0;
        int current=0;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
            max=Math.max(max,i+nums[i]);

            if(current==i){
                current =max;
                count++;
            }

            if(current>nums.length-1){
                return count;
            }
        }

        return count;
    }
}
