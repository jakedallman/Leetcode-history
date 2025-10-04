// Last updated: 10/4/2025, 2:35:49 PM
class Solution {
    public double myPow(double x, int n) {
        if (x == 1)
        {
            return 1;
        }
        if (x == -1 && n%2 == 0)
        {
            return 1;
        } else if (x== -1 && n%2 == 1)
        {
            return -1;
        }
        if (x == 0)
        {
            return 0;
        }
        if (n < -10000000)
        {
            return 0;
        }
        else if (n > 0)
        {
            double sum = 1;
            for (int i = 0; i< n; i++)
            {
                sum*=x;
            }
            return sum;
        } else if (n == 0)
        {
            return 1;
        } else
        {
            double sum = 1;
            for (int i = 0; i< Math.abs(n); i++)
            {
                sum*=x;
            }
            return (double) 1.0/sum;
        }
    }
    
}