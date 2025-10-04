// Last updated: 10/4/2025, 2:36:01 PM
class Solution {
    public String intToRoman(int num) {
        String value ="";
        String temp ="";
        while (num >= 1000)
        {
            temp+="M";
            num-=1000;
        }
        if (num >= 900)
        {
            temp += "CM";
            num-=900;
        }
        value +=temp;
        temp = "";
        while (num >= 500)
        {
            temp+="D";
            num-=500;
        }
        if (num >=400)
        {
            temp += "CD";
            num -=400;
        }
        value += temp;
        temp = "";
        while (num >= 100)
        {
            temp+="C";
            num-=100;
        }
        if (num >= 90)
        {
            temp+="XC";
            num-=90;
        }
        value+=temp;
        temp = "";
        while (num >= 50)
        {
            num-=50;
            temp+="L";
        }
        if (num >= 40)
        {
            temp+="XL";
            num-=40;
        }
        value+=temp;
        temp ="";
        while (num >= 10)
        {
            num -= 10;
            temp+="X";
        }
        if (num >= 9)
        {
            num-=9;
            temp+="IX";
        }
        value += temp;
        temp ="";
        while (num >= 5)
        {
            num -=5;
            temp+="V";
        }
        if (num >= 4)
        {
            num-=4;
            temp+="IV";
        }
        value +=temp;
        temp ="";
        while (num >= 1)
        {
            num--;
            temp+="I";
        }
        value += temp;
        return value;
    }
}