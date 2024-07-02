class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map1 = new HashMap<>();
        Map<Integer, Integer> map2 = new HashMap<>();
        for (int num : nums1) 
            map1.put(num, map1.getOrDefault(num, 0) + 1);
        
        for (int num : nums2) 
            map2.put(num, map2.getOrDefault(num, 0) + 1);
        
        List<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getKey())) {
                int count = Math.min(entry.getValue(), map2.get(entry.getKey()));
                for (int i = 0; i < count; i++) {
                    result.add(entry.getKey());
                }
            }
        }
        
        int[] arr = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            arr[i] = result.get(i);
        }
        return arr;
    }
}