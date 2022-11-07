package academydevdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/*
Eu como usuário gostaria de imprimir todos os números ímpares
de 0 até o valor digitado pelo usuário.
*/
public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor desejado: ");
        int ValorFinal = teclado.nextInt();
        int i = 0;
        while (i <= ValorFinal) {
            if (i % 2 != 0) {
                System.out.println("i = " + i);
            }
            i = i + 1;
        }

    }
}
