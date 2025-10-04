// Last updated: 10/4/2025, 2:36:05 PM
class Solution {
    public boolean isUnique (String s)
    {
        Set<String> characters = new HashSet<>();
        for (int i = 0; i < s.length();i++)
        {
            characters.add(s.substring(i,i+1));
        }
        return characters.size() == s.length();
    }
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (s.length()== 1)
        {
            return 1;
        }
        for (int i = 0; i < s.length()-1; i++)
        {
            for (int j = i+1; j <= s.length();j++)
            {
                if (j-i > max)
                {
                    if (isUnique(s.substring(i,j)))
                    {
                        max = j-i;
                    }else{
                        break;
                    }
                }
            }
        }
        return max;
    }
}