/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_miguelflores_11551106_;

import java.util.Scanner;

/**
 *
 * @author Miguel Flores
 */
public class Examen1_MiguelFlores_11551106_ {

    public static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        char resp;
        do {
            System.out.println("----MENU----");
            System.out.println("EJERCICIO 1");
            System.out.println("EJERCICIO 2");
            System.out.println("EJERCICIO 3");
            System.out.println("INGRESE EL EJERCICIO QUE DESEA EJECUTAR:");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    simplificar();
                    suma_division();

                    break;
                case 2:
                    String x = "";
                    x = cadena();
                    System.out.println("CODIFICADA");
                    System.out.println(x);
                    String y = "";
                    y = cadena_inversa();
                    System.out.println("DESCODIFICADA");
                    System.out.println(y);
                    break;
                case 3:
                    figura1();
                    break;

            }
            System.out.println(" ");
            System.out.println("Desea continuar en el sistema S/N");
            resp = leer.next().charAt(0);
        } while (resp == 's' || resp == 'S');

    }

    public static String cadena() {

        System.out.println("Ingrese una cadena: ");
        String cadena = leer.next();
        System.out.println("Ingrese el numero de desplazamiento ");
        int corrimiento = leer.nextInt();
        String cad_final = "";
        int correr;
        for (int i = 0; i < cadena.length(); i++) {
            char x = cadena.charAt(i);
            correr = (int) x;//Obtengo la letra en el numero ASCCI
            int convertidor = correr;
            for (int j = 0; j < corrimiento; j++) {
                convertidor += 1;
                if (convertidor == 123) {
                    convertidor = 97;
                }
            }
            char new_letra = (char) convertidor;
            cad_final += new_letra + "";
        }
        return cad_final;
    }

    public static String cadena_inversa() {

        System.out.println("Ingrese para descodificar: ");
        String cadena = leer.next();
        System.out.println("Ingrese el numero de desplazamiento que utilizo");
        int corrimiento = leer.nextInt();
        String cad_final = "";
        int correr;
        for (int i = 0; i < cadena.length(); i++) {
            char x = cadena.charAt(i);
            correr = (int) x;//Obtengo la letra en el numero ASCCI
            int convertidor = correr;
            for (int j = 0; j < corrimiento; j++) {
                if (convertidor == 97) {
                    convertidor = 123;
                }
                convertidor -= 1;
            }
            char new_letra = (char) convertidor;
            cad_final += new_letra + "";
        }
        return cad_final;
    }

    public static void figura1() {
        System.out.println("Ingrese el valor de n:");
        int tamano1 = leer.nextInt();//altura de la figura
        int x1 = tamano1 / 2;
        int x2 = tamano1 / 3;
        int tamano = (2 * (tamano1 + 1));
        int contador = (tamano / 2) + 2;//determina la mitad del triangulo 
        int cantidad = 1, letra = tamano1 - 1;
        char a = 'a', b = 'b', c = 'c', d = ' ';
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < contador; j++) {
                System.out.print("*");
            }
            contador--;
            if (i <= x1 + 1) {
                for (int j = 0; j < cantidad; j++) {
                    System.out.print("" + a);
                }
            }
            if (i >= x1 + 2) {
                for (int j = 0; j < cantidad; j++) {
                    System.out.print(b);
                }
            }
            if (i >= (x1) + 3) {
                for (int j = 0; j < cantidad; j++) {
                    System.out.print(d);
                }
            }
            cantidad += 2;
            System.out.println(" ");
        }
    }

    public static void simplificar() {

        System.out.println("Ingrese primera fraccion: ");
        int f1 = leer.nextInt();
        int f2 = leer.nextInt();
        System.out.println("Ingrese segunda multiplicacion:");
        int x1 = leer.nextInt();
        int x2 = leer.nextInt();
        int cont = 2;
        for (int i = cont; i < 11; i++) {
            if (f1 % i == 0 && f2 % i == 0) {
                f1 = f1 / i;
                f2 = f2 / i;
                cont = 2;
            }

            if (x1 % i == 0 && x2 % i == 0) {
                x1 = x1 / i;
                x2 = x2 / i;

            }

        }
        if (x1 % 2 == 0 && x2 % 2 == 0) {
            x1 = x1 / 2;
            x2 = x2 / 2;

        }
        System.out.println("Primera division simplificada: ");
        System.out.println(f1 + "/" + f2);
        System.out.println("Segunda division simplificada: ");
        System.out.println(x1 + "/" + x2);
    }

    public static void suma_division() {
        System.out.println("Ingrese primera fraccion simplificada : ");
        int f1 = leer.nextInt();
        int f2 = leer.nextInt();
        System.out.println("Ingrese segunda multiplicacion:");
        int x1 = leer.nextInt();
        int x2 = leer.nextInt();//Entendi mal la forma de sumar las fracciones y estaba separando cada numero para luego multiplicarlo, no sirve de nada esta.
        int a1 = 0, a2 = 0, a3 = 0, a4 = 0;//numerador A
        int b1 = 0, b2 = 0, b3 = 0, b4 = 0;//denominador A
        int c1 = 0, c2 = 0, c3 = 0, c4 = 0;//numerador B
        int d1 = 0, d2 = 0, d3 = 0, d4 = 0;//denominador B
        a3 = f1 % 10;//ultimo numero
        a2 = ((f1 % 100) - a1) / 10;//segundo
        a1 = ((f1 % 1000) - a2) / 100;//tercero
        System.out.println("");
        b3 = f1 % 10;//ultimo numero
        b2 = ((f1 % 100) - b1) / 10;//segundo
        b1 = ((f1 % 1000) - b2) / 100;//tercero
        System.out.println("");
        c3 = f1 % 10;//ultimo numero
        c2 = ((f1 % 100) - c1) / 10;//segundo
        c1 = ((f1 % 1000) - c2) / 100;//tercero
        System.out.println("");
        d3 = f1 % 10;//ultimo numero
        d2 = ((f1 % 100) - d1) / 10;//segundo
        d1 = ((f1 % 1000) - d2) / 100;//tercero
        System.out.println("");
        
    }

}
