// Last updated: 10/4/2025, 2:34:58 PM
class Solution {
    public int fib(int n) {
        if (n ==0)
        {
            return 0;
        } else if (n==1)
        {
            return 1;
        } else{
            int current = 1;
            int last = 0;
            n--;
            while (n > 0)
            {
                current+=last;
                last = current-last;
                n--;
            }
            return current;
        }
    }
}