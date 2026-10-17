class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(countMap.containsKey(nums[i])){
                countMap.put(nums[i], countMap.get(nums[i]) + 1);
            }else {
                countMap.put(nums[i], 1);
            }
        }

        System.out.println(countMap);

        int[] result = new int[k];

        for (int i = 0; i < result.length; i++) {

            int maxFrequency = 0;
            int mostFrequencyNumber = 0;

            for (int num : countMap.keySet()){
                if (countMap.get(num) > maxFrequency){
                    maxFrequency = countMap.get(num);
                    mostFrequencyNumber = num;
                }
            }

            result[i] = mostFrequencyNumber;
            countMap.remove(mostFrequencyNumber);
        }



        return result;
    }
}
