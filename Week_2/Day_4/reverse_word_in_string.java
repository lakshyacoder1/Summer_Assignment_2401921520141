class Solution {
    public String reverseWords(String s) {
        char[] chars = s.toCharArray();
        int i = 0;

        while (i < chars.length) {
            int j = i;

            while (j < chars.length && chars[j] != ' ') {
                j++;
            }
            int left = i, right = j - 1;
            while (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            i = j + 1;
        }
        return new String(chars);
    }
}
