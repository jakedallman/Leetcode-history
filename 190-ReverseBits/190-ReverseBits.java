// Last updated: 10/4/2025, 2:35:25 PM
class Solution {
    public int reverseBits(int n) {
        String temp = Integer.toBinaryString(n);
        String other = "";
        while (temp.length()!=32)
        {
            temp = "0"+temp;
        }
        for (int i = 0; i < temp.length();i++)
        {
            other = temp.charAt(i)+other;
        }
        return Integer.parseInt(other,2);
    }
}