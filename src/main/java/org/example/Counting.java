package org.example;

import javax.swing.*;
import java.util.Scanner;


public class Counting {
    public static void main(String[] args) {

        String word;
        String word1;
        Scanner input = new Scanner(System.in);

        word = JOptionPane.showInputDialog("What is the input string?");

        JOptionPane.showMessageDialog(null,word +" has "+word.length()+" characters","Rectangle", JOptionPane.INFORMATION_MESSAGE);

        // using our function
        StringLength l = new StringLength(word);
        System.out.printf("\n%s has %d characters", word,l.length());
    }
}
