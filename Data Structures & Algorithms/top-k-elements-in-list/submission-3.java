class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            frequencyMap.put(nums[i], frequencyMap.getOrDefault(nums[i],0)+1);
        }

        List<Integer> result = new ArrayList<>(frequencyMap.keySet());

        Collections.sort(result, (a,b) -> frequencyMap.get(b) - frequencyMap.get(a));

        int[] ans = new int[k];
        for(int j=0; j<k;j++){
            ans[j] = result.get(j);
        }
    return ans;

    }
}
