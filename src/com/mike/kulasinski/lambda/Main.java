package com.mike.kulasinski.lambda;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard();
        Scanner scanner = new Scanner(System.in);

        keyboard.setListener(c -> System.out.println("Mam literke: " + c));

        String line;
        do {
            line = scanner.nextLine();
            if (!line.isEmpty()) {
                keyboard.click(line.charAt(0));
            }
        } while (line.isEmpty() || line.toUpperCase().charAt(0) != 'Q');
    }

}
