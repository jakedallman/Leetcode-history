// Last updated: 10/4/2025, 2:35:46 PM
class Solution {
    public int[] plusOne(int[] digits) {
    digits[digits.length-1]++;
    for (int i = digits.length-1; i > 0; i--)
    {
        if (digits[i] > 9)
        {
            digits[i]-=10;
            digits[i-1]++;
        }
    }
    if (digits[0] > 9)
    {
        int[] output = new int[digits.length+1];
        output[0] = 1;
        digits[0]-=10;
        for (int i = 0; i < digits.length;i++)
        {
            output[i+1] = digits[i];
        }
        return output;
    } 
    return digits;
    }
}