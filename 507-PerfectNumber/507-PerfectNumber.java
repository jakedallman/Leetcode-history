// Last updated: 10/4/2025, 2:35:06 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum = 0;
        for (int i = num-1; i > 0;i--)
        {
            if (num%i==0)
            {
                sum+=i;
            }
        }
        return sum == num;
    }
}