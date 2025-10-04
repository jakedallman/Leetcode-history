// Last updated: 10/4/2025, 2:35:45 PM
class Solution {
    public int mySqrt(long x) {
        long index = 0;
        while (index*index <= x)
        {
            index++;
        }
        index--;
        return (int)index;
    }
}