package loops;

import java.util.Scanner;

/*Programa pede notas de 0 a 10. Mostre uma mensaggem caso o valor seja inválido
 e continue pedindo até que o usuário informe um valor válido */
public class ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while(nota < 0 | nota > 10){
            System.out.println("Nota inválida! Digite outra vez");
            nota = scan.nextInt();
        }
    }

}
