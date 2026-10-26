class Solution {
    public boolean isPalindrome(String s) {
                char[] chars = s.toCharArray();

        int left = 0;
        int right = chars.length - 1;

        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.toLowerCase(chars[i]);
        }

        while (left < right){
            if(!Character.isLetterOrDigit(chars[left])){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(chars[right])){
                right--;
                continue;
            }

            if (chars[left] != chars[right]){
                return false;
            }
            left ++;
            right --;
        }
        return true;
    }   
}
