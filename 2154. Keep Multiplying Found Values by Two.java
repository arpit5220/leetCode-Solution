class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        HashMap<Integer,Integer> hm=new HashMap<>();
        int real=original;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],1);
        }
        
      
        
            while(hm.containsKey(real))
            {
                real=2*real;
            }
        
        
        return real;
    }
}
