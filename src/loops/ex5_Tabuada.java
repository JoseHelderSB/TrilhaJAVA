package loops;
/*Desenvolva um gerador de tabuada, capaz de gerar a yabuada de qualquer número
 * entre 1 a 10. O usuário informa o valor do número que ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo a seguir:
 * Tabuada do 3:
 * 3 X 1 = 3
 * 3 X 2 = 6
 * ...
 * 3 X 10 = 30
 */

 import java.util.Scanner;

public class ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;

        System.out.println("Insira o valor do número o qual deseja a tabuada: ");
        tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada + ": ");
        for(int i = 1; i <= 10 ; i++){
            System.out.println(tabuada + " X " + i + " = " + tabuada*i);
        }


    }
    
}
