package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Дана сторона квадрата. Найти его периметр Р=4*а.

        Scanner in = new Scanner(System.in);
        System.out.print("a:");
        float a = in.nextFloat();
        float P = 4*a;
        System.out.println("P:" +P);
        in.close();

    }
}
