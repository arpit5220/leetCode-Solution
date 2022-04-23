class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
//         int k=0; /// METHOD 1
//         int a=0;
//         int b=0;
//         int count=0;
//         int c=points[0][0];
//         int d=points[0][1];
//         for(int i=1;i<points.length;i++)
//         {
//             a=points[i][k];
//             for(int j=1;j<points[i].length;j++)
//             {
//                b=points[i][j];
   
//             }
            
//            count+=Math.max( Math.abs(c-a),Math.abs(d-b));
//             c=a;
//             d=b;
                
//         }
        
//         return count;
        
        /// METHOD 2
        
       
        int ans = 0, n = points.length;
        for (int i = 0; i < n-1; i++) {
            int deltaX = Math.abs(points[i+1][0] - points[i][0]); 
            int deltaY = Math.abs(points[i+1][1] - points[i][1]); 
            ans += Math.max(deltaX, deltaY);
        }
        return ans;
    }

   // }
}
