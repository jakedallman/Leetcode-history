// Last updated: 10/4/2025, 2:35:08 PM
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        int counter = 1;
        while (counter <= n)
        {
            if (counter %3 == 0 && counter % 5==0)
            {
                answer.add("FizzBuzz");
            } else if (counter % 3 == 0)
            {
                answer.add("Fizz");
            } else if (counter % 5 == 0)
            {
                answer.add("Buzz");
            } else{
                answer.add(Integer.toString(counter));
            }
            counter++;
        }
        return answer;
    }
}