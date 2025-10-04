// Last updated: 10/4/2025, 2:35:54 PM
class Solution {
    public int removeElement(int[] nums, int val) {
        ArrayList<Integer> place = new ArrayList<>();
        for (int item : nums)
        {
            if (item != val)
            {
                place.add(item);
            }
        }
        for (int i =0; i < place.size(); i++)
        {
            nums[i]= place.get(i);
        }
        return place.size();
    }
}