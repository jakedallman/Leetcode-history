// Last updated: 10/4/2025, 2:35:06 PM
class Solution {
    public int arrangeCoins(int n) {
        int counter = 1;
        while (n >= 0)
        {
            n-=counter;
            counter++;
        }
        return counter-2;
    }
}