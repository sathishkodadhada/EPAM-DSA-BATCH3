package com.epam.dsa.day4;

public class ReverseString {
    public String reverseString(String input) {
        char[] chars = input.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }

    public String reverseStringUsingStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
