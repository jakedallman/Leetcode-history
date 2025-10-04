// Last updated: 10/4/2025, 2:35:13 PM
class Solution {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length/2;i++)
        {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
            
        }
    }
}