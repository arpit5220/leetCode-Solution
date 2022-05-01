class Solution {
    public int countPoints(String rings) {
        
        int []red=new int[10];
        int []green=new int[10];
        int []blue=new int[10];
        
        for(int i=0;i<rings.length();i+=2)
        {
            int  p=rings.charAt(i+1)-'0';
            
            char ch=rings.charAt(i);
            if(ch=='R')
            {
                red[p]++;
            }
             if(ch=='B')
            {
                  blue[p]++;
            }
             if(ch=='G')
            {
                green[p]++;
            }
        }
        
        int count=0;
        for(int i=0;i<10;i++)
        {
            if(red[i]>0 && blue[i]>0 && green[i]>0)
            {
                count++;
            }
        }
        
        return count;
    }
}
