// Last updated: 10/4/2025, 2:35:14 PM
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for (int i = 0; i <= n;i++)
        {
            ans[i] = Integer.bitCount(i);
        }
        return ans;
    }
}