package com.everis;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;

        System.out.println("Bienvenidos a este programa de consola!");
        System.out.println("---------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        name = scanner.next();
        System.out.println("Felicitaciones " + name + " ingresastes tu nombre!");

    }
}
