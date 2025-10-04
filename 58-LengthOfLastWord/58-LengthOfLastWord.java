// Last updated: 10/4/2025, 2:35:46 PM
class Solution {
    public int lengthOfLastWord(String s) {
        while ((s.substring(s.length()-1,s.length())).equals(" "))
        {
            s = s.substring(0, s.length()-1);
        }
       for (int i = s.length()-1; i >=0; i--) 
       {
            if (s.substring(i,i+1).equals(" "))
            {
                return s.length()-i-1;
            }
       }
       return s.length();
    }
}