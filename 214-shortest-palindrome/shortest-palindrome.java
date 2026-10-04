class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;
        int[] lps = new int[combined.length()];
        int j = 0;
        for (int i = 1; i < combined.length(); i++) {
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = lps[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }
        int longest = lps[combined.length() - 1];
        String remaining = s.substring(longest);
        String add = new StringBuilder(remaining)
                .reverse()
                .toString();
        return add + s;
    }
}