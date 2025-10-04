// Last updated: 10/4/2025, 2:35:16 PM
class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        for (int i = 0; i < secret.length();i++)
        {
            if (secret.substring(i,i+1).equals(guess.substring(i,i+1)))
            {
                bulls++;
                secret = secret.substring(0,i)+secret.substring(i+1);
                guess = guess.substring(0,i)+guess.substring(i+1);
                i--;
            }
        }
        int cows = 0;
        for (int i = 0; i < 10; i++)
        {
            String number = Integer.toString(i);
            while (secret.contains(number) && guess.contains(number))
            {
                secret = secret.replaceFirst(number,"");
                guess = guess.replaceFirst(number,"");
                cows++;
            }
        }
        return bulls + "A" + cows + "B";
    }
}