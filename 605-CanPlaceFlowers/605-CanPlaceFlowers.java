// Last updated: 10/4/2025, 2:35:03 PM
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1)
        {
            if (n==0)
            {
                return true;
            }
            return flowerbed[0]==0;
        }
        if (flowerbed[0]==0 && flowerbed[1]==0)
        {
            n--;
            flowerbed[0] = 1;
        } if (flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0)
        {
            n--;
            flowerbed[flowerbed.length-1] = 1;
        } 

        for (int i = 1; i < flowerbed.length-1;i++)
        {
            if (flowerbed[i]==0)
            {
                if (flowerbed[i-1] == 0 && flowerbed[i+1]==0)
                {
                    n--;
                    flowerbed[i]=1;
                }
            }
        }
        return n <=0;
    }
}