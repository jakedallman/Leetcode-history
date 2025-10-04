// Last updated: 10/4/2025, 2:35:00 PM
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> output = new ArrayList<>();
        for (int i = 0; i < k;i++)
        {
            int closest = -99999;
            int index = 0;
            for (int j = 0; j < arr.length;j++)
            {
                if (Math.abs(arr[j]-x) < Math.abs(closest-x) || (Math.abs(arr[j]-x)== Math.abs(closest-x) && arr[j] < closest))
                {
                    closest = arr[j];
                    index = j;
                }
            }
            arr[index] = -999999999;
            output.add(closest);
        }
        output.sort(null);
        return output;
    }
}