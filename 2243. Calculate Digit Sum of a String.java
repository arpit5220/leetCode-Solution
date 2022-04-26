class Solution {
    public String digitSum(String s, int k) {
       while(s.length()>k)
       {
           String str="";
           for(int i=0;i<s.length();i+=k)
           {
               String st=s.substring(i,Math.min(i+k,s.length()));
               int sum=0;
               for(int j=0;j<st.length();j++)
               {
                  sum+=(st.charAt(j))-'0';          //--> Important point
               }
               
               str+=""+sum;        // --> imp...
               
           }
           
           s=str;             //->> imp...
       }
        
        return s;
        
    }

}
