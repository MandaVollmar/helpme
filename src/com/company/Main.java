package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Question: ");
        String question = input.nextLine();


        if (question.length() < 200) {
            System.out.println("Ask a better question!");
        } else if (question.length() > 500) {
            System.out.println("Simplify your question!");
        } else {
            System.out.println("Great Job!!");
        }
    }
}

