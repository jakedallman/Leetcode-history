// Last updated: 10/4/2025, 2:36:04 PM
class Solution {
    public boolean isPalindrome(String s)
    {
        int beginning = 0;
        int end = s.length()-1;
        while (beginning < end)
        {
            if (s.substring(beginning,beginning+1).equals(s.substring(end,end+1)))
            {
                beginning++;
                end--;
            } else{
                return false;
            }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        if (s.length() == 1)
        {
            return s;
        }
        int max =1;
        int beginning = 0;
        int end = 0;
        for (int i = 0; i < s.length()-max; i++)
        {
            for (int j = i+max; j <= s.length(); j++)
            {
                if (s.substring(i,i+1).equals(s.substring(j-1,j)))
                {
                    String test =s.substring(i,j);
                    if (j-i >= max)
                    {
                        if (isPalindrome(test))
                        {
                            max = j-i;
                            beginning = i;
                            end = j;
                        }
                    }
                }
            }
        }
        return s.substring(beginning, end);
    }
}