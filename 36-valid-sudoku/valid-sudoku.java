class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char current=board[i][j];
                if(current !='.')
                {
                    String row=current+"row"+i;
                    String column=current+"column"+j;
                    String box=current+"box"+(i/3)+"-"+(j/3);
                
                if(!set.add(row)||!set.add(column)||!set.add(box))
                return false;
                   }   }
        }
        return true;
    }
}