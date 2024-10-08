class Solution {
    public int maximumGain(String s, int x, int y) {
        //cdbcbbaaabab
        int a = 0;
        int b = 0;
        int min = Math.min(x, y);//4
        int res = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c > 'b') {
                res += Math.min(a, b) * min;//16
                a = 0;
                b = 0;
            } else if (c == 'a') {
                if (x < y && b > 0) {
                    b--;
                    res += y;
                } else {
                    a++;
                }
            } else {
                if (x > y && a > 0) {
                    a--;
                    res += x;
                } else {
                    b++;
                };
            }
        }
        
        res += Math.min(a, b) * min;
        
        return res;
    }
}