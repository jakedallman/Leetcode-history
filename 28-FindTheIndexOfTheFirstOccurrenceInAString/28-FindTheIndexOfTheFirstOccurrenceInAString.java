// Last updated: 10/4/2025, 2:35:54 PM
class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack.length() == needle.length() && haystack.equals(needle))
        {
            return 0;
        }
        for (int i =0; i < haystack.length()-needle.length()+1; i++)
        {
            if (needle.equals(haystack.substring(i,i+needle.length())))
            {
                return i;
            }
        }
        return -1;
    }
}