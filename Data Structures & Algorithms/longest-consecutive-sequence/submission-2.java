class Solution {
    public int longestConsecutive(int[] nums) {

        if (nums.length == 0){
            return 0;
        }

        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            numSet.add(num);
        }

        int longest = 0;

        for (Integer num : numSet) {
            if (!numSet.contains(num-1)){
                int current = num;
                int count = 1;

                while (numSet.contains(current + 1)) {
                    count += 1;
                    current++;
                }
                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}