class Solution {
    public String thousandSeparator(int n) {
        if(n==0)
            return "0";
        int counter=0;
        StringBuilder str=new StringBuilder();
        while(n>0)
        {
            if(counter==3)
            {
                str.append(".");
                counter=0;
            }
            int digit=n%10;
            n/=10;
            str.append(digit+"");
            counter++;            
        }
        
             return str.reverse().toString();
    }
}
