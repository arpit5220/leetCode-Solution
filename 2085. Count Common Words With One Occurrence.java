class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        HashMap<String,Integer> hm1=new HashMap<>();
        HashMap<String,Integer> hm2=new HashMap<>();
        int count=0;
        for(int i=0;i<words1.length;i++)
        {
            if(hm1.containsKey(words1[i]))
            {
                hm1.put(words1[i],hm1.get(words1[i])+1);
            }
            else
                hm1.put(words1[i],1);
        }
        
        for(int i=0;i<words2.length;i++)
        {
            if(hm2.containsKey(words2[i]))
            {
                hm2.put(words2[i],hm2.get(words2[i])+1);
            }
            else
                hm2.put(words2[i],1);
        }
        
        int n=words1.length;
        int m=words2.length;
        if(m<n)
        {
            int temp=n;
            n=m;
            m=temp;
        }
        
        for(int i=0;i<words1.length;i++)
        {
            if(hm2.containsKey(words1[i]))
            {
                if(hm2.get(words1[i])==1 && hm1.get(words1[i])==1)
                    count++;
            }
        }
        
        return count;
        
    }
}
