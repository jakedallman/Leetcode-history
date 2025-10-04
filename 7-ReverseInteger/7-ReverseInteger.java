// Last updated: 10/4/2025, 2:36:03 PM

class Solution {
    public int reverse(int x) {
        boolean positive = true;
        if (x < 0)
        {
            positive = false;
        } 
        int y = Math.abs(x);
        String original = Integer.toString(y);
        String temp = "";
        for (int i = original.length()-1; i > -1; i--)
        {
            temp += original.substring(i,i+1);
        }
        temp = temp.replaceAll("-","");
        long result = Long.parseLong(temp);
        if (result > Integer.MAX_VALUE)
        {
            return 0;
        }else if(positive){
            return (int) result;
        } else{
            return (int) result*(-1);
        }
    }
}