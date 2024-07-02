class Solution {
    public String customSortString(String order, String s) {
    StringBuilder sb=new StringBuilder();
    int[]count=new int[26];
    Set<Character> set=new HashSet<>();
    for(char j:order.toCharArray())
    {
        set.add(j);//cba
    }
    for(char i:s.toCharArray())
    {
        if(!set.contains(i))
        sb.append(i);//d
        else
        count[i-'a']++;//COUNT[0]=1 COUNT[1]=1 COUNT[2]=1
    }
      for(char c:order.toCharArray())//cba // T0 MAINTAIN ORDER
    {
       int i=count[c-'a'];//[99-97]//[2]==1 
       while(i-->0)
       sb.append(c);//cBA
    }
return sb.toString();
    }
}
