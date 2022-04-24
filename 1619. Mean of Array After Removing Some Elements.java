class Solution {
    public double trimMean(int[] arr) {
        int l=arr.length;
        int start=arr.length/20;
        int end=arr.length-start;
        Arrays.sort(arr);
        double sum=0;
        for(int i=start;i<end;i++)
        {
            sum+=arr[i];
        }
        
        double ans=sum/(arr.length-2*start);
        return ans;
    }
}
