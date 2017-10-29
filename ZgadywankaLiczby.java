package com.company;

import java.util.Scanner;

public class Zad6 {
    public static void main(String[] args) {
        int secretNumber = 600;
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        System.out.println("Podaj liczbę");

        do {
            userNumber = scanner.nextInt();
            if (userNumber > secretNumber)
                System.out.println("Podałeś za dużą liczbę");
            if (userNumber < secretNumber)
                System.out.println("Podałeś za małą liczbę");
        } while (userNumber != secretNumber);
        System.out.println("Gratulację udało ci się zgadnąć poprawną liczbę");

    }
}
