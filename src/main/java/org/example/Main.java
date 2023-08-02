package org.example;

public class Main {

    public static void main(String[] args) {
        Solution tt = new Solution();
        int n = 43261596;
        System.out.println("Input: " + Integer.toBinaryString(n));
        int reversed = tt.reverseBits(n);
        System.out.println("Reversed: " + Integer.toBinaryString(reversed));
    }
}