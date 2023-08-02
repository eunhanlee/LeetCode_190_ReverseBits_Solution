package org.example;


public class Solution {
    /**
     * Reverses the bits of a 32-bit integer.
     *
     * @param n The input 32-bit integer whose bits are to be reversed.
     * @return The integer with reversed bits.
     */
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Left shift result by 1 to make space for the next bit.
            result |= (n & 1); // Set the least significant bit of result with the rightmost bit of n.
            n >>= 1; // Right shift n by 1 to get the next bit for the next iteration.
        }
        return result;
    }
}
