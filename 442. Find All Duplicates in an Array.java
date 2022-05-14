class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> l=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++)
        {
            int idx=Math.abs(nums[i])-1;
            int val=nums[idx];
            
            if(val<0)
            {
                l.add(idx+1);
            }
            else
                nums[idx]*=-1;
            
        }
        
        return l;
    }
}
