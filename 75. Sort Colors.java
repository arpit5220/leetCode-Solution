class Solution {
    public void sortColors(int[] nums) {
       
        int zero=0,one=0,two=0;
      for(int i=0;i<nums.length;i++)
      {
          if(nums[i]==0)
              zero++;
          if(nums[i]==1)
              one++;
          if(nums[i]==2)
              two++;
      }
        
        
//         for(int i=zero-1;i>=0;i--)         --> first i used this approach ti fill the array after counting 
//         {
//             nums[i]=0;
//         }
         
//         int sum=zero+one;
        
//         for(int j=sum-1;j>=zero;j--)
//         {
//             nums[j]=1;
//         }
        
//         int sum2=zero+one+two;
        
//         for(int k=sum2-1;k>=sum;k--)
//         {
//             nums[k]=2;
//         }
        
      //// this is better for filling element in arrray
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(zero>0)
            {
                nums[i]=0;
                zero--;
            }
            
            else if(one>0)
            {
                nums[i]=1;
                one--;
            }
            
            else
                nums[i]=2;
                
        }
    }
}
