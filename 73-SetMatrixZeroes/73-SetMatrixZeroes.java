// Last updated: 10/4/2025, 2:35:44 PM
class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> columns = new ArrayList<>();
        for (int row = 0; row < matrix.length;row++)
        {
            for (int column = 0; column < matrix[row].length;column++)
            {
                if (matrix[row][column] ==0)
                {
                    rows.add(row);
                    columns.add(column);
                }
            }
        }
        for (int item : rows)
        {
            for (int i = 0; i < matrix[item].length; i++)
            {
                matrix[item][i] = 0;
            }
        }
        for (int item : columns)
        {
            for (int i = 0; i < matrix.length; i++)
            {
                matrix[i][item] = 0;
            }
        }
    }

}