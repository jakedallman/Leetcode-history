// Last updated: 10/4/2025, 2:34:55 PM
class Solution {
    public long coloredCells(int n) {
        long colored = 1;
        for (int i = 0; i< n; i++)
        {
            colored+=i*4;
        }
        return colored;
    }
}