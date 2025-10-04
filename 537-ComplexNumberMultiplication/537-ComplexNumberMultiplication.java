// Last updated: 10/4/2025, 2:35:05 PM
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int firstReal = 0;
        int secondReal = 0;
        int firstImaginary = 0;
        int secondImaginary = 0;
        for (int i = 0; i < num1.length();i++)
        {
            if (num1.substring(i,i+1).equals("+"))
            {
                firstReal = Integer.parseInt(num1.substring(0,i));
                firstImaginary = Integer.parseInt(num1.substring(i+1,num1.length()-1));
            }
        }
        for (int i = 0; i < num2.length();i++)
        {
            if (num2.substring(i,i+1).equals("+"))
            {
                secondReal = Integer.parseInt(num2.substring(0,i));
                secondImaginary = Integer.parseInt(num2.substring(i+1,num2.length()-1));
            }
        }
        return (firstReal * secondReal - firstImaginary * secondImaginary)+"+"+(firstReal*secondImaginary+secondReal*firstImaginary)+"i";
    }
}