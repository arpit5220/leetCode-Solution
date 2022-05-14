class Solution {
    public String countAndSay(int n) {
     
        if(n==1)
        {
            return "1";
        }
       
        // recursion
     String s=countAndSay(n-1);
        StringBuilder str=new StringBuilder();
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            count++;
            if(i==s.length()-1 || s.charAt(i)!=s.charAt(i+1))  //--> this code logic is very good
            {
                str.append(count).append(s.charAt(i));
                count=0;
            }
        }
        
        
        return str.toString();        
        
    }
}
