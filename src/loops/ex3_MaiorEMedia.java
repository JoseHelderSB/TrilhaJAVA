package loops;
/*
Programa que leia 5 números
 e informa o maior número e a média deles
 */

import java.util.Scanner;

public class ex3_MaiorEMedia {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        double media = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if(numero > maior) maior = numero;
            count++;
        }while (count < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média dos números é: " + (soma / count));



    }
    
}
