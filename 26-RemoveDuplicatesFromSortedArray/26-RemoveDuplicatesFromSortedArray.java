// Last updated: 10/4/2025, 2:35:55 PM
class Solution {
    public int removeDuplicates(int[] nums) {
        ArrayList<Integer> holder = new ArrayList<>();
        if (nums[0] ==1)
        {
            holder.add(2);
        } else{
            holder.add(1);
        }
        for (int item: nums)
        {
            if (item != holder.get(holder.size()-1))
            {
                holder.add(item);
            }
        }
        holder.remove(0);
        for (int i =0; i < holder.size(); i++)
        {
            nums[i] = holder.get(i);
        }
        return holder.size();
    }
}