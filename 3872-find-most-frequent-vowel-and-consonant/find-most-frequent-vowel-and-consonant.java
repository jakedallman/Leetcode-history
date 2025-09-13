class Solution {
    public int maxFreqSum(String s) {
        int[] letters = new int[26];
        for (int i = 0; i < s.length();i++)
        {
            letters[s.charAt(i)-97]++;
        }
        int vowel = Math.max(letters[0],letters[4]);
        vowel = Math.max(vowel, letters[8]);
        vowel = Math.max(vowel, letters[14]);
        vowel = Math.max(vowel, letters[20]);

        int consonant = 0;
        for (int i = 0; i < 26;i++)
        {
            if (i != 0 && i != 4 && i!=8 && i!= 14&& i!=20)
            {
                if (letters[i] > consonant)
                {
                    consonant = letters[i];
                }
            }
        }
        return consonant+vowel;
    }
}