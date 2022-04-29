class Solution {
    
    public int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;           
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }
    
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {         /// use hashset to solve using repeated looops
            n = getNext(n);
        }
        return n == 1;      // --> understand this condition
    }
}
