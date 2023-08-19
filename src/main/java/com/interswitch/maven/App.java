package com.interswitch.maven;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        UpperLowerCase upperLowerCase = new UpperLowerCase();

        System.out.println("good-day");
        System.out.println("To upper case: ");
        System.out.printf("%s to %s: \n", "Hello World", upperLowerCase.wordToUpperCase("Hello World"));
        System.out.println("To lower case: ");
        System.out.printf("%s to %s: \n", "Hello World", upperLowerCase.wordToLowerCase("Hello World"));
        System.out.println();
        System.out.println("Go home Feature");
        System.out.printf("Go home by: %s", LocalDateTime.now());
    }
}