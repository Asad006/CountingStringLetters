package org.example;

import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {

        String word;
        Scanner input = new Scanner(System.in);

        System.out.println("What is the input string?");
        word = input.nextLine();
        System.out.printf("%s has %d characters", word,word.length());

        // using our function
        StringLength l = new StringLength(word);
        System.out.printf("\n%s has %d characters", word,l.length());
    }
}
