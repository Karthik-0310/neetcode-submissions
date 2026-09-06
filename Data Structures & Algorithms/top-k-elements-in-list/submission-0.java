class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for(int i=0; i<nums.length;i++){
            int key = nums[i];
            countMap.put(key, countMap.getOrDefault(nums[i],0)+1);
        }
                List<Integer> result = new ArrayList<>(countMap.keySet());

            Collections.sort(result, (a,b) -> countMap.get(b) - countMap.get(a));
            int[] ans = new int[k];
            for (int j = 0; j < k; j++) {
                ans[j] = result.get(j);
            }
            return ans;
    }
}
