package com.gss.basics;

public class Main {
    public static void main(String[] args) {
        String input = "Hello World";
        String result = rearrange(input);
        System.out.println(result);
    }

    public static String rearrange(String input) {
        char[] chars = input.toCharArray(); // Convert string to character array
        int length = chars.length;

        // Swap characters between the two halves
        for (int i = 0; i < length / 2; i++) {
            // Swap ith character with corresponding character from second half
            char temp = chars[i];
            chars[i] = chars[length - 1 - i];
            chars[length - 1 - i] = temp;
        }

        return new String(chars); // Convert the character array back to a string
    }
}
