// Last updated: 10/4/2025, 2:35:15 PM
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n < 0)
        {
            return false;
        }
        long beginning = 1;
        while (beginning < n)
        {
            beginning*=4;
        }
        return beginning==n;
    }
}