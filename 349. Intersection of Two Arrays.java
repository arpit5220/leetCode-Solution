class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Boolean> hm=new HashMap<>();
        HashMap<Integer,Boolean> re=new HashMap<>();
        
      for(int i=0;i<nums1.length;i++)
      {
          hm.put(nums1[i],true);
      }

      ArrayList<Integer> l=new ArrayList<>();
      for(int i=0;i<nums2.length;i++)
      {
          if(hm.containsKey(nums2[i])==true && hm.get(nums2[i])==true)
          {
             re.put(nums2[i],true); 
            hm.put(nums2[i],false);  
          }
      }
        
        int [] result=new int[re.size()];
        int i=0;
        for(Integer key:re.keySet())
        {
            result[i]=key;
            i++;
        }
        
        return result;
         
    }
}
