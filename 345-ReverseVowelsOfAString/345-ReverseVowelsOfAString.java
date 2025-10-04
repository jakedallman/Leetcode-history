// Last updated: 10/4/2025, 2:35:13 PM
class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> temp = new ArrayList<>();

        for (int i = s.length()-1; i >= 0; i--)
        {
            if (Character.toLowerCase(s.charAt(i))=='a' || Character.toLowerCase(s.charAt(i))=='e'|| Character.toLowerCase(s.charAt(i))=='i'|| Character.toLowerCase(s.charAt(i))=='o' || Character.toLowerCase(s.charAt(i))=='u')
            {
                temp.add(s.charAt(i));
            }
        }
        int counter = 0;
        for (int i = 0; i < s.length();i++)
        {
            if (Character.toLowerCase(s.charAt(i))=='a' || Character.toLowerCase(s.charAt(i))=='e' ||Character.toLowerCase(s.charAt(i))=='i'|| Character.toLowerCase(s.charAt(i))=='o' || Character.toLowerCase(s.charAt(i))=='u')
            {
                s= s.substring(0,i)+temp.get(counter)+s.substring(i+1);
                counter++;
            }
        }
        return s;
    }
}