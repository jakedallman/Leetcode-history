// Last updated: 10/4/2025, 2:36:02 PM
class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);
        String filler = "";
        for (int i =0; i < y.length(); i++)
        {
            filler= y.substring(i,i+1) + filler;
        }
        if (y.equals(filler))
        {
            return true;
        } else{
            return false;
        }
    }
}