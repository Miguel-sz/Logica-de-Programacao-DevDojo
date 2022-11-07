package academydevdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/* Como usuário eu gostaria de  de ter um menu visual  que seja navegável através de números.
O menu deve ser exibido da seguinte forma

1. Calcular Imposto
2. Depositar Salário
3. Sair

O menu deve ficar disponível enquanto eu não digitar o número 3.
Dessa forma o sistema ficará em execução, evitando ter que ser reiniciado a cada operação.
*/
public class Aula03Menu {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 3) {
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.println("Digite a Sua opção: ");
            opcao = teclado.nextInt();
        }
        System.out.println("Programa Encerrado");
    }
}
