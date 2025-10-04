// Last updated: 10/4/2025, 2:34:57 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int remainder = 0;
        int total = 0;
        while (numBottles > 0)
        {
            total+=numBottles;
            remainder+=numBottles;
            numBottles = 0;
            while (remainder >= numExchange)
            {
                numBottles+=1;
                remainder-=numExchange;
            }
        }
        return total;
    }
}