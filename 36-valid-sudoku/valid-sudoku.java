class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean row[][]=new boolean[9][9];
         boolean column[][]=new boolean[9][9];
          boolean box[][]=new boolean[9][9];
          for(int i=0;i<9;i++)
          {
            for(int j=0;j<9;j++)
            {
                int current=board[i][j];
                if(current !='.')
                {
                 int num=board[i][j]-'1';
                
                int boxi=(i/3)*3+(j/3);
                if(row[i][num]|| column[j][num]|| box[boxi][num])
                return false;
                row[i][num]=true;
                column[j][num]=true;
                box[boxi][num]=true;
            }}
          }
          return true;
    }
}