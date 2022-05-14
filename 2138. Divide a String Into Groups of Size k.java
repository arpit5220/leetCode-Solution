class Solution {
    public String[] divideString(String s, int k, char fill) {
        
        String[] ans = new String[(s.length() % k != 0) ? (s.length() / k) + 1 : s.length() / k];//--> we can use this method also to decide length of string array
        int t=k;
        ArrayList<String> str=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
       // String st="";
        for(int i=0;i<s.length();i++)
        {
            
            if(t>0)
            {
                sb.append(s.charAt(i));
                t--;
            }
            else
            {
               t=k;
                str.add(sb.toString());
                sb.setLength(0);
                i--;
                
            }   
        }
        
        if(t>0)
        {
            while(t-->0)
            {
                sb.append(fill);
            }
        }
        
        str.add(sb.toString());
        
        
     //  String[] ans = new String[arr.size()];  //--> create string array 
        
        for (int i = 0; i < str.size(); i++)
            ans[i] = str.get(i);
        return ans;
    }
}
