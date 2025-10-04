// Last updated: 10/4/2025, 2:35:20 PM
class Solution {
    public int addDigits(int num) {
        while (num > 9)
        {
            String temp = Integer.toString(num);
            num = 0;
            for (int i = 0; i < temp.length();i++)
            {
                num+=Integer.parseInt(temp.substring(i,i+1));
            }
        }
        return num;
    }
}