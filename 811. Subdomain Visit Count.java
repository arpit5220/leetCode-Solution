class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> hm=new HashMap<>();
        
        for(String domain:cpdomains)
        {
            String temp[]=domain.split(" ");
            int visitcount=Integer.parseInt(temp[0]);
            
            String word[]=temp[1].split("\\.");
            
            StringBuilder sb=new StringBuilder();
            
            for(int idx=word.length-1;idx>=0;idx--)
            {
                if(idx==word.length-1)
                    sb.append(word[idx]);
                else
                {
                    sb.insert(0,".");
                    sb.insert(0,word[idx]);
                }
                
            
            
            String subdomain=sb.toString();
            
            if(hm.containsKey(subdomain))
              
                hm.put(subdomain,hm.get(subdomain)+visitcount);
            
            else
            
                hm.put(subdomain,visitcount);       
           }
            
            
        }
            
            ArrayList<String> res=new ArrayList<>();
            for(String key:hm.keySet())
            {
                StringBuilder s=new StringBuilder();
                s.append(hm.get(key));
                s.append(" ");
                s.append(key);
                res.add(s.toString());
            }
        return res;
        
    }
}
