// Last updated: 10/4/2025, 2:35:28 PM
class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = columnTitle.length()-1; i >= 0;i--)
        {
            char temp = columnTitle.charAt(i);
            sum+= (int)(temp-64)*Math.pow(26,columnTitle.length()-i-1);
        }
        return sum;
    }
}