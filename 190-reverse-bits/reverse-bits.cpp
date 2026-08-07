class Solution {
public:
    int reverseBits(int n){
        int rev = 0;
        for(int i = 1; i <= 32; i++){
            int lastD = n & 1; // Extract the last bit (0 or 1)

            rev = rev << 1;
            rev = rev | (lastD);
            n = n >>1 ;
        }
        return rev;
    }
};