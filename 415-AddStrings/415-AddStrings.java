// Last updated: 10/4/2025, 2:35:07 PM
class Solution {
    public String addStrings(String num1, String num2) {
        String output = "";
        while (num1.length() < num2.length())
        {
            num1="0"+num1;
        }
        while (num2.length() < num1.length())
        {
            num2="0"+num2;
        }
        int carry = 0;
        for (int i = num1.length()-1;i>= 0;i--)
        {
            int number = Integer.parseInt(num1.substring(i,i+1))+ Integer.parseInt(num2.substring(i,i+1));
            if (carry == 1)
            {
                number++;
                carry=0;
            }
            if (number > 9)
            {
                carry++;
                number-=10;
            }
            output = number+output;
        }
        if (carry ==1)
        {
            return "1"+output;
        }
        return output;
    }
}