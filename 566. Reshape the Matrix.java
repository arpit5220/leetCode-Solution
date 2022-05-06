class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        int l=mat.length;
        int m=mat[0].length;
        
        if(r*c!=l*m)
            return mat;
        
        int ans[][]=new int[r][c];
        
        int col=0;
        int row=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                ans[row][col]=mat[i][j];
                col++;
                if(col==c)
                {
                    row++;
                    col=0;
                }
            }
        }
        
        return ans;
         
    }
}
