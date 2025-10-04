// Last updated: 10/4/2025, 2:35:57 PM
class Solution {
    public List<String> letterCombinations(String digits) {
        ArrayList<String> output= new ArrayList<>();
        String[] two = {"a","b","c"};
        String[] three = {"d","e","f"};
        String[] four = {"g","h","i"};
        String[] five = {"j","k","l"};
        String[] six = {"m","n","o"};
        String[] seven = {"p","q","r","s"};
        String[] eight = {"t","u","v"};
        String[] nine = {"w","x","y","z"};
        String character = "";
        if (digits.length() > 0)
        {
            character = digits.substring(0,1);
        } 
        for (int i = 0; i < digits.length(); i++)
        {
            character = digits.substring(i,i+1);
            if (i == 0)
            {
                if (character.equals("2"))
                {
                    for (String item : two)
                    {
                        output.add(item);
                    }
                }
                else if (character.equals("3"))
                {
                    for (String item : three)
                    {
                        output.add(item);
                    }
                }
                else if (character.equals("4"))
                {
                    for (String item : four)
                    {
                        output.add(item);
                    }
                }
                else if (character.equals("5"))
                {
                    for (String item : five)
                    {
                        output.add(item);
                    }
                }
                else if (character.equals("6"))
                {
                    for (String item : six)
                    {
                        output.add(item);
                    }
                }
                else if (character.equals("7"))
                {
                    for (String item : seven)
                    {
                        output.add(item);
                    }
                }
                else if (character.equals("8"))
                {
                    for (String item : eight)
                    {
                        output.add(item);
                    }
                }
                else if (character.equals("9"))
                {
                    for (String item : nine)
                    {
                        output.add(item);
                    }
                }
            } 
            else
            {
                int length = output.size();
                for (int j = 0; j < length; j++)
                {
                    String banana = output.get(j);
                    if (character.equals("2"))
                    {
                        for (String item : two)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                    else if (character.equals("3"))
                    {
                        for (String item : three)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                    else if (character.equals("4"))
                    {
                        for (String item : four)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                    else if (character.equals("5"))
                    {
                        for (String item : five)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                    else if (character.equals("6"))
                    {
                        for (String item : six)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                    else if (character.equals("7"))
                    {
                        for (String item : seven)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                    else if (character.equals("8"))
                    {
                        for (String item : eight)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                    else if (character.equals("9"))
                    {
                        for (String item : nine)
                        {
                            output.add(banana+item);
                        }
                        output.remove(j);
                        j--;
                        length--;
                    }
                }
            }
        }
            
        return output;
    }
}