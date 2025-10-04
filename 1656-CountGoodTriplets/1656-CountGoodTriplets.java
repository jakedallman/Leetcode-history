// Last updated: 10/4/2025, 2:34:56 PM
class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int tally = 0;
        for (int i = 0; i < arr.length-2;i++)
        {
            for (int j = i+1; j < arr.length-1;j++)
            {
                for (int k = j+1; k < arr.length;k++)
                {
                    if (Math.abs(arr[i]-arr[j]) <=a && Math.abs(arr[j]-arr[k]) <=b && Math.abs(arr[i]-arr[k]) <= c)
                    {
                        tally++;
                    }
                }
            }
        }
        return tally;
    }
}