class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashMap<String,String> hm=new HashMap<>();
        for(List<String> p:paths)           /// to traverse an 2d list
        {
            hm.put(p.get(0),p.get(1));
        }
        
        
        for(String key:hm.keySet())
        {
            String st=hm.get(key);   /// important
            if(!hm.containsKey(st))     // kisi key ki value as a key to nhi present hai hashmap me
               return st;
                
        }
               
               return "";
        
        
    }
}



