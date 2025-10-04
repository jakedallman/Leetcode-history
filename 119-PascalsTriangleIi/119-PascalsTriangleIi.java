// Last updated: 10/4/2025, 2:35:38 PM
class Solution {

    public int combination(int total, int pick)
    {
        double factor = 1;
        for (int i = total-pick+1; i <= total; i++)
        {
            factor*=i;
        }
        double factor2 = 1;
        for (int i = 2; i <= pick; i++)
        {
            factor2*=i;
        }
        return (int)Math.round(factor/factor2);
    }
    public List<Integer> getRow(int rowIndex) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i <= rowIndex;i++)
        {
            output.add(combination(rowIndex,i));
        }
        return output;
    }
}