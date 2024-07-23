class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> freq = new HashMap();
        for(int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        return Arrays.stream(nums)
               .boxed()
               .sorted( (a,b)-> {
                    if(freq.get(a) == freq.get(b)) {
                        return Integer.compare(b, a);
                    }
                    return freq.get(a).compareTo(freq.get(b));
                })
               .mapToInt(i -> i)
               .toArray();
    }
}