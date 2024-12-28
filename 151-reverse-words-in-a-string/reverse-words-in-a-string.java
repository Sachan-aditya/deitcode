class Solution {
    public String reverseWords(String s) {
        int left=0;
        String []word=s.split(" ");
        int right=word.length-1;
        while(left<right)
        {
            String temp=word[left];
            word[left]=word[right];
            word[right]=temp;
            left++;
            right--;
        }
        StringBuilder sb=new StringBuilder();
        for(String words:word)
        {
            if(!words.isEmpty())
            {
                if(sb.length()>0)
                sb.append(" ");
            }
            sb.append(words);
        }
        return sb.toString();

    }
}