class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(nums[i]))
            {
                hm.put(nums[i],hm.get(nums[i])+1);
            }
            else{
            hm.put(nums[i],1);
            }
        }
        
        int length=0;
        for(Integer key:hm.keySet())
        {
            if(hm.containsKey(key+1))
            {
                length=Math.max(hm.get(key)+hm.get(key+1),length);
                 
            }
        }
        
        return length;
    }
}
