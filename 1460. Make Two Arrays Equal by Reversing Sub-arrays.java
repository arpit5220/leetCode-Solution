class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);  // we can do in o(n) using hashmap
         Arrays.sort(arr);
        
        return Arrays.equals(target, arr);  
        // time complexity o(nlogn)
        
    }
}
