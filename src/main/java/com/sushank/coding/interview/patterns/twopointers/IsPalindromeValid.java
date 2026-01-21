package com.sushank.coding.interview.patterns.twopointers;

/*
Is Palindrome Valid
Easy
A palindrome is a sequence of characters that reads the same forward and backward.

Given a string, determine if it's a palindrome after removing all non-alphanumeric characters. A character is alphanumeric if it's either a letter or a number.

Example 1:
Input: s = 'a dog! a panic in a pagoda.'
Output: True
Example 2:
Input: s = 'abc123'
Output: False
Constraints:
The string may include a combination of lowercase English letters, numbers, spaces, and punctuations.
 */

public class IsPalindromeValid {

    public static void main(String[] args) {
        String inputString = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(inputString);
        System.out.println("Is Input String Palindrome: " + result);
    }

    public static boolean isPalindrome(String inputString) {
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {

            char l = inputString.charAt(left);
            char r = inputString.charAt(right);

            if (!Character.isLetterOrDigit(l)) {
                left++;
                continue;
            }
            if (!Character.isLetterOrDigit(r)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(l) != Character.toLowerCase(r)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
