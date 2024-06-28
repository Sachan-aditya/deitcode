class Solution {
    public boolean checkIfPangram(String s) {
       String a="abcdefghijklmnopqrstuvwxyz";
       for(char c:a.toCharArray())
       {
        if(!(s.contains(c+"")))
        return false;
       }
       return true;
    }
}