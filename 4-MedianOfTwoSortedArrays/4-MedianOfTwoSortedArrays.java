// Last updated: 10/4/2025, 2:36:04 PM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList <Integer> sum = new ArrayList<>();
        for (int item: nums1)
        {
            sum.add(item);
        }
        for (int item: nums2)
        {
            sum.add(item);
        }
        sum.sort(null);
        int length =sum.size();
        int half = (int)Math.floor(length/2.0);
        if (length%2==1)
        {
            return sum.get(half);
        }
        return (((double)(sum.get(half-1)+sum.get(half)))/2);
    }
}