class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if(m*n!=original.length)
        {
            return new int[0][0];
        }
        
        int [] [] arr=new int[m][n];   
//         int k=0;                       // it takes o(n*2);
//           for(int i=0;i<m;i++)
//           {
//               for(int j=0;j<n;j++)
//               {
//                   arr[i][j]=original[k++];
//               }
//           }
        
//         return arr;
        
         // make another approach
         // for no of rows=index/n --> (n is column length)
         //    no of column=index%n -->(n is column)
        
         
        for(int i=0;i<original.length;i++)
        {
            arr[i/n][i%n]=original[i];
        }
        
        return arr;
    }
}
