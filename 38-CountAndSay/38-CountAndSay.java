// Last updated: 10/4/2025, 2:35:49 PM
class Solution {
    public String runLength (String s)
    {
        String character = s.substring(0,1);
        String storage = "";
        int counter = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if (!character.equals(s.substring(i,i+1)))
            {
                storage = storage + Integer.toString(counter) + character;
                character = s.substring(i,i+1);
                counter = 0;
                i--;
            } else{
                counter++;
                if (i == s.length()-1)
                {
                    storage = storage + Integer.toString(counter) + character;
                    character = s.substring(i,i+1);
                    counter = 1;
                }
            }
        }
        return storage;
    }
    public String countAndSay(int n) {
        String output = "1";
        if (n ==1)
        {
            return "1";
        }
        for (int i = 0; i < n-1; i++)
        {
            output = runLength(output);
        }
        return output;
    }
}