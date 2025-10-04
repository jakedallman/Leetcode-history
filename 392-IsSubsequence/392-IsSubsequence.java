// Last updated: 10/4/2025, 2:35:09 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        for (int i = 0; i < s.length();i++)
        {
            String character = s.substring(i,i+1);
            boolean fired = false;
            for (int j = 0; j < t.length();j++)
            {
                if (t.substring(j,j+1).equals(character))
                {
                    t= t.substring(j+1);
                    fired = true;
                    break;
                }
            }
            if (!fired)
            {
                return false;
            }
        }
        return true;
    }
}