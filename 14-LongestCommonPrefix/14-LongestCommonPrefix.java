// Last updated: 10/4/2025, 2:35:59 PM
class Solution {
    public boolean checkValid (String s, String[] strs)
    {
        int length = s.length();
        for (String item : strs)
        {
            if (length > item.length())
            {
                return false;
            }
            if (!item.substring(0,length).equals(s))
            {
                return false;
            }
        }
        return true;
    }
    public String longestCommonPrefix(String[] strs) {
        String first = strs[0];
        for (int i = 1; i <= first.length(); i++)
        {
            if (!checkValid(first.substring(0,i),strs))
            {
                return first.substring(0,i-1);
            }
        }
        return first;
    }
        
}