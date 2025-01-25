class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char c=board[i][j];
                if(c!='.'){
                String p=c+"row"+i;
                String q=c+"column"+j;
                String r=c+"box"+(i/3)+"-"+(j/3);
                if(!set.add(p)||!set.add(q)|| !set.add(r))
                return false;
            }
            }
        }
        return true;
    }
}