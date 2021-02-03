package com.everis;

import com.everis.util.Util;

import java.util.Scanner;

public class AzureFunctions {
    public static void main(String[] args) {
        String phone;
        System.out.println("Bienvenidos a este programa de consola!");
        System.out.println("---------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un correo");
        String mail;
        mail = sc.nextLine();
        Util util = new Util();
        System.out.println(mail + (util.isEmail(mail)?" es ":" no es ") + "correo");
        System.out.println("Ingresa tu numero de celular");
        phone = sc.nextLine();
        System.out.println("Ingresastes tu numero de celular!");
    }
}
