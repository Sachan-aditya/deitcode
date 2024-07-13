class Solution {
    public int maximumGain(String s, int x, int y) 
    {
      String imp,unimp;
      int imp_score,unimp_score;
      if(x>y)
      {
        imp="ab";
        imp_score=x;
        unimp="ba";
        unimp_score=y;
      }
      else
      {
        imp="ba";
        imp_score=y;
        unimp="ab";
        unimp_score=x;
      }
      int score=0;
      Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray())
        {
          if(ch==imp.charAt(1)&&stack.size()>0&&stack.peek()==imp.charAt(0))
          {
            score+=imp_score;
            stack.pop();
          }
          else
          {
            stack.push(ch);
          }
        }
        String str="";
        while(!stack.isEmpty())
        {
          str=stack.pop()+str;
        }
        for(char ch:str.toCharArray())
        {
          if(ch==unimp.charAt(1)&&stack.size()>0&&stack.peek()==unimp.charAt(0))
          {
            score+=unimp_score;
            stack.pop();
          }
          else
          {
            stack.push(ch);
          }
        }
        return score;
        
    }
}