class Solution {
    public String reverseVowels(String s) {

        char[] ch = s.toCharArray();

        int left = 0;
        int right = s.length() - 1;

        String vowels = "aeiouAEIOU";

        while (left < right) {

            if (vowels.indexOf(ch[left]) == -1) {
                left++;
            }
            else if (vowels.indexOf(ch[right]) == -1) {
                right--;
            }
            else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }
        }

        return new String(ch);
    }
}