// Last updated: 10/4/2025, 2:35:56 PM
class Solution {
    public boolean isValid(String s) {
        if (s.length() == 0)
        {
            return true;
        }
        ArrayList <String> list = new ArrayList<>();
        for (int i =0; i < s.length(); i++)
        {
            String item = s.substring(i,i+1);
            if (item.equals("("))
            {
                list.add("(");
            } else if (item.equals("{"))
            {
                list.add("{");
            } else if (item.equals("["))
            {
                list.add("[");
            } else if (item.equals(")"))
            {
                if (list.size() == 0)
                {
                    return false;
                }
                if (list.get(list.size()-1).equals("("))
                {
                    list.remove(list.size()-1);
                } else{
                    return false;
                }
            }
            else if (item.equals("]"))
            {
                if (list.size() == 0)
                {
                    return false;
                }
                if (list.get(list.size()-1).equals("["))
                {
                    list.remove(list.size()-1);
                } else{
                    return false;
                }
            }
            else if (item.equals("}"))
            {
                if (list.size() == 0)
                {
                    return false;
                }
                if (list.get(list.size()-1).equals("{"))
                {
                    list.remove(list.size()-1);
                } else{
                    return false;
                }
            }
        }
        if (list.size()== 0)
        {
            return true;
        } else{
            return false;
        }
        
    }
}