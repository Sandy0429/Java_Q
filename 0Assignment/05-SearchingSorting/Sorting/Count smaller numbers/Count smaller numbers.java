class Solution{
    
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;

        List<Integer> list = new ArrayList<Integer>();

        for(int i=0; i<n ;i++){
            int count =0;
            for(int j=i+1; j<n; j++){
                if(nums[j] <nums[i]){
                    count++;
                }
            }
            list.add(count);
        }
        return list;        
    }
    
}
