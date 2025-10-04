// Last updated: 10/4/2025, 2:35:40 PM
class Solution {
    public boolean valid (int len1, int len2, int len3, String s)
    {
        ArrayList<String> storage = new ArrayList<>();
        storage.add(s.substring(0,len1));
        storage.add(s.substring(len1+1,len2+1));
        storage.add(s.substring(len2+2,len3+2));
        storage.add(s.substring(len3+3,s.length()));
        for (String item : storage)
        {
            if (Integer.valueOf(item) > 255)
            {
                return false;
            }
            if (item.length() > 1)
            {
                if (item.substring(0,2).equals("00") || (item.substring(0,1).equals("0") && Integer.valueOf(item) > 0))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public String create(int len1, int len2, int len3, String s)
    {
        return (s.substring(0,len1)+"."+s.substring(len1,len2)+"."+s.substring(len2,len3)+"."+s.substring(len3,s.length()));
    }
    public List<String> restoreIpAddresses(String s) {
        ArrayList<String> storage = new ArrayList<>();
        if (s.length() > 12)
        {
            return storage;
        }
        for (int len1 = 1; len1 < 4; len1++)
        {
            for (int len2 = len1+1; len2 < 4+len1; len2++)
            {
                for (int len3 = len2+1; len3 < s.length(); len3++)
                {
                    String temp = create(len1, len2, len3, s);
                    if (valid(len1, len2, len3,temp))
                    {
                        storage.add(temp);
                    }
                }
            }
        }
        return storage;
    }
}