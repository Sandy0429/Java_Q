class Solution {
    public int findMin(int[] nums) {

        int len = nums.length -1;
        if(nums[0]<nums[len]){
            return nums[0];
        }

        int left =0;
        int right = len;
        while(left< right){
            int mid = left +(right-left)/2;

            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }

        return nums[left];

    }
}
