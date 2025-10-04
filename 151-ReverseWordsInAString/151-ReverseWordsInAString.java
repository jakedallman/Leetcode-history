// Last updated: 10/4/2025, 2:35:34 PM
class Solution {
    public String reverseWords(String s) {
        String reverse = "";
        int lastIndex = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (s.substring(i,i+1).equals(" "))
            {
                reverse = s.substring(lastIndex,i) + " "+ reverse;
                lastIndex = i+1;
            }
            else if (i == s.length()-1)
            {
                reverse = s.substring(lastIndex) + " "+ reverse;
            }
        }
        reverse = reverse.trim();
        for (int i = 0; i < reverse.length()-2; i++)
        {
            if (reverse.substring(i,i+2).equals("  "))
            {
                reverse = reverse.substring(0,i)+ reverse.substring(i+1);
                i--;
            }
        }
        return reverse;
    }
}