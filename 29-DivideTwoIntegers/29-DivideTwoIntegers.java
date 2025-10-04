// Last updated: 10/4/2025, 2:35:53 PM
class Solution {
    public int divide(long dividend, long divisor) {
        long index = 0;
        long big = Math.abs(dividend);
        long small = Math.abs(divisor);
        long replacement = small+small+small+small+small+small+small+small+small+small;
        int increment = 10;
        if (big < replacement)
        {
            replacement = small;
            increment = 1;
        }
        while (big >= replacement)
        {
            big-=replacement;
            index+=increment;
            if (big < replacement)
            {
                replacement = small;
                increment = 1;
            }
        }
        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
        {
            if (index > Integer.MAX_VALUE)
            {
                return Integer.MAX_VALUE;
            }
            return (int) index;
        } else{
            if (0-index < Integer.MIN_VALUE)
            {
                return Integer.MIN_VALUE;
            }
            return (0- (int)index);
        }
    }
}