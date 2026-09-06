class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> count = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (count.containsKey(ch)) {
                count.put(ch, count.get(ch) + 1);
            } else {
                count.put(ch, 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            char ch = t.charAt(j);

            if (count.containsKey(ch) && count.get(ch) > 0) {
                count.put(ch, count.get(ch) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}