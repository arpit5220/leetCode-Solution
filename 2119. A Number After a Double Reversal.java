class Solution {
    public boolean isSameAfterReversals(int num) {
        if (num==0)
            return true;
        int t=(num%10);
        // if(t==0)           //--> use this or use ternary operator
        //     return false;
        // else
        //     return true;
        
        if(num==0)         
            return true;
      boolean ans =  t==0 ?  false : true;   //--> using ternary operator    
        return ans;
    }
}
