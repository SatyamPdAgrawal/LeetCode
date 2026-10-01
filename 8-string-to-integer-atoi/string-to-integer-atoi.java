class Solution {
    public int myAtoi(String s) {
        int i = 0;
        long number = 0;
        int sign = 1;
        while (i < s.length() && s.charAt(i) == ' ') {
            i++;
        }

        if (i < s.length() && s.charAt(i) == '+') {
            sign = 1;
            i++;
        } 
        else if (i < s.length() && s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
        while (i < s.length() && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            number = number * 10 + digit;
            long result = number * sign;

            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(number * sign);
    }
}