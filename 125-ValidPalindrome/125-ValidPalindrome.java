// Last updated: 10/4/2025, 2:35:36 PM
class Solution {
    public boolean isAlphanumeric(String s)
    {
        if (s.equals("a") ||s.equals("b") ||s.equals("c") ||s.equals("d") ||s.equals("e") ||s.equals("f") ||s.equals("g") ||s.equals("h") ||s.equals("i") ||s.equals("j") ||s.equals("k") ||s.equals("l") ||s.equals("m") ||s.equals("n") ||s.equals("o") ||s.equals("p") ||s.equals("q") ||s.equals("r") ||s.equals("s") ||s.equals("t") ||s.equals("u") ||s.equals("v") ||s.equals("w") ||s.equals("x") ||s.equals("y") ||s.equals("z") ||s.equals("0") ||s.equals("1") ||s.equals("2") ||s.equals("3") ||s.equals("4") ||s.equals("5") ||s.equals("6") ||s.equals("7") ||s.equals("8") ||s.equals("9"))
        {
            return true;
        }
        return false;
    }
    public boolean isPalindromic(String s)
    {
        String reverse = "";
        for (int i = 0; i < s.length();i++)
        {
            reverse = s.substring(i,i+1) + reverse;
        }
        return s.equals(reverse);
    }
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String actual = "";
        for (int i = 0; i< s.length(); i++)
        {
            if (isAlphanumeric(s.substring(i,i+1)))
            {
                actual+= s.substring(i,i+1);
            }
        }
        return isPalindromic(actual);
    }
}