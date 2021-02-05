package com.everis;

import com.everis.util.Util;

import java.util.Scanner;

public class AzureFunctions {
    public static void main(String[] args) {
        String mail, name, phone;
        Scanner sc = new Scanner(System.in);
        Util util = new Util();
        System.out.println("Bienvenidos a este programa de consola!");
        System.out.println("---------");
        System.out.println("Ingrese un correo:");
        mail = sc.nextLine();
        System.out.println(mail + (util.isEmail(mail)?" es ":" no es ") + "correo");
        System.out.println("Ingresa tu numero de celular");
        phone = sc.nextLine();
        System.out.println("Ingresastes tu numero de celular!");
        System.out.println("Agrega tu nombre:");
        name = sc.nextLine();
        System.out.println("Agregaste tu nombre " + name);
        System.out.println("---------");
        System.out.println("Fin del programa");
    }
}
