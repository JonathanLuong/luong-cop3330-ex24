package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 24 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    static boolean anagramCheck(String first, String second) {

        char arr1[] = first.toCharArray();
        char arr2[] = second.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Gets length of each string
        int len1 = arr1.length;
        int len2 = arr2.length;

        if (len1 != len2)
            return false;

        for (int i = 0; i < len1; i++) {
            if (arr1[i] != arr2[i])
                return false; // If the chars are not the same return false
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader

        System.out.printf("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.printf("\nEnter the first string: ");
        String first = reader.nextLine();
        System.out.printf("Enter the second string: ");
        String second = reader.nextLine();

        if (anagramCheck(first, second) == true)
            System.out.printf(first + " and " + second + " are anagrams.");
        else
            System.out.printf(first + " and " + second + " are not anagrams.");

    }
}