class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;

        for (int i = 0; i < k; i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
                count++;
            }
        }

        int maxVowels = count;

        for (int i = k; i < s.length(); i++) {
            char incoming = s.charAt(i);
            char outgoing = s.charAt(i - k);

            if (incoming == 'a' || incoming == 'e' ||
                incoming == 'i' || incoming == 'o' ||
                incoming == 'u') {
                count++;
            }

            if (outgoing == 'a' || outgoing == 'e' ||
                outgoing == 'i' || outgoing == 'o' ||
                outgoing == 'u') {
                count--;
            }

            maxVowels = Math.max(maxVowels, count);

            if (maxVowels == k) {
                return k;
            }
        }

        return maxVowels;
    }
}