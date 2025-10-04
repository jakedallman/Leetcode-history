// Last updated: 10/4/2025, 2:34:53 PM
class Solution {
    public int findClosest(int x, int y, int z) {
        if (Math.abs(y-z) > Math.abs(x-z))
        {
            return 1;
        } else if (Math.abs(y-z) < Math.abs(x-z))
        {
            return 2;
        }
        return 0;
    }
}