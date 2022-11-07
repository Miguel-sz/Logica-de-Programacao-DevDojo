package academydevdojo.lacosderepeticao.whiles;

import java.util.Scanner;

/*Apresentar ao usuário uma tela solicitando um login e depois uma senha.
O usuário e senha devem estar armazenados em constantes no seu programa.
Se o usuário acertar o usuário e a senha exibir mensagem ACESSO CONCEDIDO,
caso contrário exibir mensagem ACESSO NEGADO e voltar a pedir usuário e senha.
Essa condição deve-se repetir até que o usuário acerte a combinação.
 */
public class Aula04ExercicioLogin {
    public static void main(String[] args) {
        final String login = "Luffy";
        final String password = "ReiDosPiratas";

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o seu usuário");
            String loginDigitado = scanner.nextLine();
            System.out.println("Digite sua senha");
            String passwordDigitado = scanner.nextLine();
            if (login.equals (loginDigitado) &&  password.equals (passwordDigitado)) {
                System.out.println("ACESSO CONCEDIDO");

                break;
            }
                System.out.println("ACESSO NEGADO");

            }
        System.out.println("PROGRAMA TERMINADO");
        }

    }


