// Last updated: 10/4/2025, 2:35:26 PM
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> output = new ArrayList<>();
        Set<String> first = new HashSet<>();
        Set<String> second = new HashSet<>();
        for (int i = 0; i < s.length()-9;i++)
        {
            if (!first.add(s.substring(i,i+10)) && second.add(s.substring(i,i+10)))
            {
                second.add(s.substring(i,i+10));
            }
        }
        for (String item: second)
        {
            output.add(item);
        }
        return output;
    }
}