class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

     Map<String, List<String>> groupedMap = new HashMap<>();

     for(int i=0; i<strs.length; i++){
        char[] chars = strs[i].toCharArray();
        Arrays.sort(chars);

        String key = new String(chars);

        groupedMap.putIfAbsent(key, new ArrayList<>());
        groupedMap.get(key).add(strs[i]);
     }

    return new ArrayList<>(groupedMap.values());

    }
}
