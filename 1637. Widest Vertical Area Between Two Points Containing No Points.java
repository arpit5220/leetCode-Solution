class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int maximum=0;
        int [] arr=new int[points.length];
        for(int i=0;i<points.length;i++)
        {
            arr[i]=points[i][0];
        }
        
        Arrays.sort(arr);
       
        int a=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            maximum=Math.max(maximum,Math.abs(a-arr[i]));
            a=arr[i];
        }
        
        return maximum;
    }
}
