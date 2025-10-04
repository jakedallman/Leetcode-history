// Last updated: 10/4/2025, 2:34:55 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        int diagonal = 0;
        for (int [] item : dimensions)
        {
            if (item[0]*item[0]+item[1]*item[1] > diagonal)
            {
                diagonal = item[0]*item[0]+item[1]*item[1];
                area = item[0]*item[1];
            } else if (item[0]*item[0]+item[1]*item[1] == diagonal)
            {
                area = Math.max(area,item[0]*item[1]);
            }
        }
        return area;
    }
}