// Last updated: 10/4/2025, 2:36:00 PM
class Solution {
    public int romanToInt(String s) {
        int sum =0;
        String doubles = "";
        for (int i =0; i < s.length(); i++)
        {
            if (s.length()-i > 1){
                doubles = s.substring(i,i+2);
            } 
            
            if (doubles.equals("IV"))
            {
                sum+=4;
                i++;
                doubles = "";
                continue;
            }
            else if (doubles.equals("IX"))
            {
                sum+=9;
                i++;
                doubles = "";
                continue;
            }
            else if (doubles.equals("XL"))
            {
                sum+=40;
                i++;
                doubles = "";
                continue;
            }
            else if (doubles.equals("XC"))
            {
                sum+=90;
                i++;
                doubles = "";
                continue;
            }
            else if (doubles.equals("CD"))
            {
                sum+=400;
                i++;
                doubles = "";
                continue;
            }
            else if (doubles.equals("CM"))
            {
                sum+=900;
                i++;
                doubles = "";
                continue;
            }
            else
            {
                String singles = s.substring(i,i+1);
                if (singles.equals("I"))
                {
                    sum++;
                }
                else if (singles.equals("V"))
                {
                    sum +=5;
                } 
                else if (singles.equals("X"))
                {
                    sum +=10;
                }
                else if (singles.equals("L"))
                {
                    sum +=50;
                }
                else if (singles.equals("C"))
                {
                    sum +=100;
                }
                else if (singles.equals("D"))
                {
                    sum +=500;
                } else if (singles.equals("M")){
                    sum+=1000;
                }
            }

        }
        return sum;
    }
}