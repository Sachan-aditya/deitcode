class Solution {
    public boolean isHappy(int n) {
        if (n < 0) return false;
        Set<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = sums(n);
        }
        return n == 1;
    }

    public int sums(int n) {
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            sum += a * a;
            n /= 10;
        }
        return sum;
    }
}