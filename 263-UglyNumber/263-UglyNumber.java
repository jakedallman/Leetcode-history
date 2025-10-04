// Last updated: 10/4/2025, 2:35:19 PM
class Solution {
    public boolean isUgly(int n) {
        int last = 1;
        int first = 0;
        if (n < 1)
        {
            return false;
        }
        while (first != last)
        {
            last = first;
            first = n;
            while (n%2 == 0)
            {
                n/=2;
            }
            while (n%5 == 0)
            {
                n/=5;
            }
            while (n%3 == 0)
            {
                n/=3;
            }
        }
        return n == 1;
        
    }
}