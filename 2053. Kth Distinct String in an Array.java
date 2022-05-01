class Solution {
    public String kthDistinct(String[] arr, int k) {
        
  
        HashMap<String,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else
            {
                hm.put(arr[i],1);
            }
        }
        
        //System.out.println(hm);
        
        int p=0;
        for(int i=0;i<arr.length;i++)    // use loop in array instead of directly key from hashmap(hm)
        {                                // for traversing from the starting of array(make order maintain)
            if(hm.get(arr[i])==1)
            {
                p++;
                if(p==k)
                    return arr[i];
            }
            
            
        }
        
        return "";
    }
}
