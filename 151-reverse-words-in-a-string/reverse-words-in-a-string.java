class Solution {
    public String reverseWords(String s) {
      String ar[]=s.split(" ");
      String res="";
      for(int i=ar.length-1;i>=0;i--)
      {
        if(ar[i].length()==0)
        continue;
      if(res.length()==0)
      {
        res+=ar[i];
      }
      else
      res+=" "+ar[i];

    }

    return res;
}}