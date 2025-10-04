// Last updated: 10/4/2025, 2:35:24 PM
class Solution {
    public int hammingWeight(int n) {
        String temp = Integer.toBinaryString(n);
        int counter = 0;
        for (int i = 0; i < temp.length(); i++)
        {
            if (temp.substring(i,i+1).equals("1"))
            {
                counter++;
            }
        }
        return counter;
    }
}