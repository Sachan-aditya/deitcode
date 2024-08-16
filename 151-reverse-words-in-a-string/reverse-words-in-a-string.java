class Solution {
    public String reverseWords(String s) {
      String ar[]=s.split(" ");
      //String res="";
      StringBuilder res=new StringBuilder();
      for(int i=ar.length-1;i>=0;i--)
      {
        if(ar[i].length()==0)
        continue;
      if(res.length()==0)
      {
          res.append(ar[i]);
      }
      else
      {
        res.append(" ");
      res.append(ar[i]);

    }
      }
    return res.toString();
}}