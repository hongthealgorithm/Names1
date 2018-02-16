package com.company;

import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your first and last name ");
        Names names = new Names();
        names.findName(scanner.nextLine());

    }
}
