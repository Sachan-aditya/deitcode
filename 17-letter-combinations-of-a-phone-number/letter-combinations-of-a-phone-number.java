class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
         map.put('3',"def");
          map.put('4',"ghi");
           map.put('5',"jkl"); 
            map.put('6',"mno");
           map.put('7',"pqrs");
            map.put('8',"tuv");
            map.put('9',"wxyz");
            List<String> res=new ArrayList<>();
            if(digits.isEmpty())
            return res;
            backtrack(digits,0,new StringBuilder(),res,map);
            return res;
    }
    private void backtrack(String digits,int index, StringBuilder current,List<String>res,Map<Character,String>map)
    {
        if(index==digits.length()){
        res.add(current.toString());
        return;
        }
        char c=digits.charAt(index);
        String l=map.get(c);
        for(char ch:l.toCharArray())
        {
            current.append(ch);
            backtrack(digits,index+1,current,res,map);
            current.deleteCharAt(current.length()-1);

        }
    }
}