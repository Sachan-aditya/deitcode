class Solution {
    public int romanToInt(String s) {
        int sum=0;int curr=0;int prev=0;
        for(int i=0;i<s.length();i++)
        {//mcmxciv
            char c=s.charAt(i);
            if(c=='I')
            curr=1;
            else if(c=='V')
            curr=5;
            else if(c=='X')
            curr=10;
            else if(c=='L')
            curr=50;
            else if(c=='C')
            curr=100;//100
            else if(c=='D')
            curr=500;
            else if(c=='M')
            curr=1000;//1000+
           if(curr>prev)//mcmxciv//1000
           sum+=curr-2*prev;//1000//
           else
           sum+=curr;//1500
           prev=curr;//1000

        }
        return sum;
    }
}