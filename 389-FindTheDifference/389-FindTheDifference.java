// Last updated: 10/4/2025, 2:35:09 PM
class Solution {
    public char findTheDifference(String s, String t) {
        int sumOne = 0;
        for (int i = 0; i < t.length(); i++)
        {
            sumOne+= (int) t.charAt(i);
        }
        int sumTwo = 0;
        for (int i = 0; i < s.length(); i++)
        {
            sumTwo+= (int) s.charAt(i);
        }
        return (char) (sumOne-sumTwo);
    }
}