// Last updated: 10/4/2025, 2:35:16 PM
class Solution {
    public boolean isPowerOfThree(int n) {
        long beginning = 1;
        while (beginning < n)
        {
            beginning*=3;
        }
        return beginning == n;
    }
}