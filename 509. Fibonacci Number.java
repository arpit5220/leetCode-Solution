class Solution {
    public int fib(int n) {
//         if(n==1)
//             return 1;        // USING RECURSION
//         if(n==0)
//             return 0;
        
//         return fib(n-1)+fib(n-2);
        
        //Using DYNAMIC PROGRAMMING;
        
      int [] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int ans=fibmem(n,dp);
        return ans;
        
    }
    
    
    
    public static int fibmem(int n,int []dp)
    {
        if(n==0 || n==1)
            return n;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        
        int fib1=fibmem(n-1,dp);
        int fib2=fibmem(n-2,dp);
        dp[n]=fib1+fib2;
        return dp[n];
    }
}
