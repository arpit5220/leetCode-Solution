class Solution {
    public double average(int[] salary) {
        double sum=0;
        int l=salary.length;
        Arrays.sort(salary);
        for(int i=1;i<salary.length-1;i++)
        {
            sum+=salary[i];
        }
        
       double t= (sum/(l-2));
        return t;
    }
}
