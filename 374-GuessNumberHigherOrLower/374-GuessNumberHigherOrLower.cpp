// Last updated: 10/4/2025, 2:35:11 PM
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

class Solution {
public:
    int guessNumber(int n) {
        int counter = 0;
        if (guess(0) == -1)
        {
            while (guess(counter) == -1)
            {
                counter--;
            }
            return counter;
        }  else{
            while (guess(counter) == 1)
            {
                counter++;
            }
            return counter;
        }
    }
};