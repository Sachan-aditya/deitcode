class Solution {
    public int maxDistance(int[] position, int m) {
     Arrays.sort(position);

        int left = 1; // Minimum possible distance
        int right = position[position.length - 1] - position[0]; // Maximum possible distance
        int best = 0;

        while (left <= right) {
            int mid = (left + right) / 2;
            int count = 1; 
            int lastPosition = position[0];
            for (int i = 1; i < position.length; i++) {
                if (position[i] - lastPosition >= mid) {
                    count++;
                    lastPosition = position[i];
                    if (count == m) {
                        break;
                    }
                }
            }

            if (count >= m) {
                best = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return best;
    }
}