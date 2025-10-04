// Last updated: 10/4/2025, 2:35:50 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i ++)
        {
            ArrayList<Character> stor1 = new ArrayList<>();
            ArrayList<Character> stor2 = new ArrayList<>();
            for (int j = 0; j < board.length; j++)
            {
                if (!stor1.contains(board[i][j]) || (board[i][j]) =='.')
                {
                    stor1.add(board[i][j]);
                } else{
                    return false;
                }
                if (!stor2.contains(board[j][i]) || '.' == (board[j][i]))
                {
                    stor2.add(board[j][i]);
                } else{
                    return false;
                }
            }
        }
        for (int i =0; i < board.length; i+=3)
        {

            for (int j = 0; j < board.length; j+=3)
            {
                ArrayList<Character> stor1 = new ArrayList<>();
                stor1.add(board[i][j]);
                stor1.add(board[i][j+1]);
                stor1.add(board[i][j+2]);
                stor1.add(board[i+1][j]);
                stor1.add(board[i+1][j+1]);
                stor1.add(board[i+1][j+2]);
                stor1.add(board[i+2][j]);
                stor1.add(board[i+2][j+1]);
                stor1.add(board[i+2][j+2]);
                for (int k =0; k < stor1.size();k++)
                {
                    char temp = stor1.get(k);
                    stor1.remove(k);
                    if (stor1.contains(temp) && temp != '.')
                    {
                        return false;
                    } else if (temp == '.')
                    {
                        k--;
                    }
                }
            }
        }
        return true;
    }
}