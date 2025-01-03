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
        List<String> list=new ArrayList<>();
        if(digits.length()==0)
        return list;
        backtrack(digits,0,new StringBuilder(),map,list);
        return list;

    }
    private void backtrack(String digits,int index,StringBuilder sb,Map<Character,String> map,List<String> list)
{
    if(index==digits.length())
    {
        list.add(sb.toString());
        return;
    }
    char c=digits.charAt(index);
    String letter=map.get(c);
    for(char ch:letter.toCharArray())
    {
        sb.append(ch);
        backtrack(digits,index+1,sb,map,list);
    sb.deleteCharAt(sb.length()-1);
        
    }
}
}