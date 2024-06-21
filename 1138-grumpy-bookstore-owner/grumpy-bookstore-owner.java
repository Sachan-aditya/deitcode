class Solution {
   public int maxSatisfied(int[] c, int[] g, int minutes) {
        int n = c.length;
        int s = 0;

        for (int i = 0; i < n; i++) {
            if (g[i] == 0) {
                s += c[i];
            }
        }

        int gain = 0;
        for (int i = 0; i < minutes; i++) {
            if (g[i] == 1) {
                gain += c[i];
            }
        }

        int maxGain = gain;
        for (int i = minutes; i < n; i++) {
            if (g[i] == 1) {
                gain += c[i];
            }
            if (g[i - minutes] == 1) {
                gain -= c[i - minutes];
            }
            maxGain = Math.max(maxGain, gain);
        }

        return s + maxGain;
    }
}
