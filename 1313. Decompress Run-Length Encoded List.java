class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        ArrayList<Integer> l=new ArrayList<>();
        for(int i=0;i<nums.length;i=i+2)
        {
              int frq=nums[i];
              int value=nums[i+1];
              while(frq-->0)
              {
                  l.add(value);
              }
        }
        
        int [] res=new int[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }
        
        return res;
    }
}
