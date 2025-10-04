// Last updated: 10/4/2025, 2:35:39 PM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
        {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i+1;j++)
            {
                if (j==0 || j == i)
                {
                    temp.add(1);
                    continue;
                } else {
                    temp.add(output.get(i-1).get(j-1)+output.get(i-1).get(j));
                }
            }
            output.add(temp);
            
        }
        return output;
    }
}