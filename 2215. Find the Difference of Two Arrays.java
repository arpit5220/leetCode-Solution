class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
    
        for(int i=0;i<nums1.length;i++)
        {
            hm1.put(nums1[i],1);
        }
        
        for(int i=0;i<nums2.length;i++)
        {
            hm2.put(nums2[i],1);
        }
        
        ArrayList<Integer> l1=new ArrayList<>();
        for(Integer key:hm1.keySet())
        {
            if(hm1.containsKey(key)!=hm2.containsKey(key))
            {
                l1.add(key);
            }        
                
        }
        
         ArrayList<Integer> l2=new ArrayList<>();
        for(Integer key:hm2.keySet())
        {
            if(hm2.containsKey(key)!=hm1.containsKey(key))
            {
                l2.add(key);
            }        
                
        }
         
        List<List<Integer>> l=new ArrayList<List<Integer>>();      --> IMportant
        l.add(l1);
        l.add(l2);
        return l;
        
        
    }
}
