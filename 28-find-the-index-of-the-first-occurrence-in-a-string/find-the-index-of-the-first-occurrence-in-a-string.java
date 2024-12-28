class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();//9
        int m=needle.length();//3
        if(m==0)
        return 0;
        for(int i=0;i<=n-m;i++)
        {//1
            int j=0;//0<3   s==s  0<3 a==a//0<3   d==d
            while(j<m && haystack.charAt(i+j)==needle.charAt(j))
            {
                j++;//1//2//3
            }
            if(j==m)
            return i;

        }
        return -1;
    }
}