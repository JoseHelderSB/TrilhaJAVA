package loops;

/*
Faça um programa que leia N números inteiros e depois mostre
 a quantidade d pares e de ímpares
 */

 import java.util.Scanner;

public class ex4_ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPares = 0;
        int qtdImpares = 0;

        System.out.println("Quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            if(numero % 2 == 0) {
                qtdPares++;
            } else {
                qtdImpares++;
            }
            count++;
        }while (count < qtdNumeros);

        System.out.println("Pares: " + qtdPares);
        System.out.println("ímpares: " + qtdImpares);
    }

}
