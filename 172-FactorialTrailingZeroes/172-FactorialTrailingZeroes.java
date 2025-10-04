// Last updated: 10/4/2025, 2:35:27 PM
class Solution {
    public int trailingZeroes(int n) {
        int index = 0;
        
        while (n >= 5)
        {
            int temp = n;
            while (temp%5 ==0)
            {
                index++;
                temp/=5;
            }
            n--;
        }
        return index;
    }
}