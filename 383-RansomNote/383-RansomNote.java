// Last updated: 10/4/2025, 2:35:10 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] temp = new int[26];
        for (int i = 0; i < magazine.length();i++)
        {
            temp[magazine.charAt(i)-97]++;
        }
        for (int i = 0; i < ransomNote.length();i++)
        {
            temp[ransomNote.charAt(i)-97]--;
        }
        for (int item : temp)
        {
            if (item < 0)
            {
                return false;
            }
        }
        return true;
    }
}