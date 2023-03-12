package loops;

import java.util.Scanner;

/*
Fazer um programa que leia conjuntos de dois valores,
o primeiro representa o nome do aluno, o segundo a sua idade.
(Parar o programa inserindo o valor 0 no campo nome)
*/ 

public class ex1_NomeEIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            System.out.println("Idade: ");
            idade = scan.nextInt(); 
        }
        System.out.println("Fim do programa");
    }
}
