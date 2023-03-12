package arrays;
/*
 Faça um programa que leia um vetor de 6 caracteres,
 e diga quantas consoantes foram lidas. 
 */

import java.util.Scanner;

public class ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if
            (
                !(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))
             ) {
                consoantes[count] = letra;
                qtdConsoantes++;
             }

             count++;

        }while(count < consoantes.length);

        System.out.println(qtdConsoantes + " consoantes foram lidas.");
    }
}
