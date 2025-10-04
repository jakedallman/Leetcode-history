// Last updated: 10/4/2025, 2:35:21 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() == t.length())
        {
            ArrayList<String> one = new ArrayList<>();
            ArrayList<String> two = new ArrayList<>();
            for (int i = 0; i < s.length();i++)
            {
                one.add(s.substring(i,i+1));
                two.add(t.substring(i,i+1));
            }
            Collections.sort(one);
            Collections.sort(two);
            for (int i = 0; i < one.size(); i++)
            {
                if (!one.get(i).equals(two.get(i)))
                {
                    return false;
                } else{
                    one.remove(i);
                    two.remove(i);
                    i--;
                }
            }
            return true;
        } else{
            return false;
        }
    }
}