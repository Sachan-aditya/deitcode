class Solution {
    public boolean checkIfPangram(String s) {
       boolean ar[]=new boolean[26];
        for(int i=0;i<s.length();i++)
        {
        ar[s.charAt(i)-'a']=true;//97-97=0 ar[0]=true=1  , first array was 0, then 
        //if found then change 0 to 1

        }
        for(boolean cr:ar)
        {
            if(!cr)//-->if not true
            return false;
        }
        return true;
    }
}