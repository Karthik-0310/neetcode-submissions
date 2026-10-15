class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> indexMap = new HashMap<>();

        // Write your logic here
        for (String str : strs) {
            char[] splitString = str.toCharArray();
            Arrays.sort(splitString);
            String sortedString = new String(splitString);

            if (indexMap.containsKey(sortedString)){
                indexMap.get(sortedString).add(str);
            }else {
                List<String> group = new ArrayList<>();
                group.add(str);
                indexMap.put(sortedString, group);
            }

        }
        return new ArrayList<>(indexMap.values());
    }
}
