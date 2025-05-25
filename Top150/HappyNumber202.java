class Solution {
    public boolean isHappy(int n) {
        // FLOYD'S TORTOISE AND HARE
        int slow = n, fast = n;
        do {
            slow = sumOfDigits(slow);
            fast = sumOfDigits(sumOfDigits(fast));
        } while (slow != fast);
        return slow == 1;
    }
    
    public int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += Math.pow(n%10, 2);
            n /= 10;
        }
        return sum;
    }
}