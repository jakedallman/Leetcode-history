// Last updated: 10/4/2025, 2:34:52 PM
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        for (int fruit = 0; fruit < fruits.length;fruit++)
        {
            for (int basket = 0; basket < baskets.length;basket++)
            {
                if (fruits[fruit] <= baskets[basket])
                {
                    baskets[basket]=0;
                    fruits[fruit] = 0;
                    break;
                }
            }
        }
        int counter = 0;
        for (int item : fruits)
        {
            if (item > 0)
            {
                counter++;
            }
        }
        return counter;
        
    }
}