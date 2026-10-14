class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length; i++) {
            char[] ch = words[i].toCharArray();

            int left = 0;
            int right = ch.length - 1;

            while (left < right) {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;

                left++;
                right--;
            }

            words[i] = new String(ch);
        }

        return String.join(" ", words);
    }
}