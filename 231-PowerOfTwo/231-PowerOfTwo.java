// Last updated: 10/4/2025, 2:35:22 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n < 1)
        {
            return false;
        }
        while (n != 1)
        {
            if (n%2 == 1)
            {
                return false;
            }
            n/=2;
        }
        return true;
        
    }
}