class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
        int temp=n;
        int s=0;
        while(temp>0)
        {
            int a=temp%10;//9
            s+=a*a;//82
            temp/=10;//1
        }
        n=s;
        }
    return n==1;
    }
}