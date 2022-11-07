package academydevdojo.estruturascondicionais.ifselses;
/*
Como secretário de alistamento militar eu gostaria que meu sistema aceitasse os seguintes
parâmetros para que eu possa agilizar o processo de cadastramento:
Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir alistamento não permitido
Se o sexo for Feminino e a idade for maior ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir alistamento não permitido
 */

public class AlistamentoMilitar {
    public static void main(String[] args) {
        char sexo = 'F';
        int idade = 15;

        if ((sexo == 'M' || sexo == 'F') && idade < 18) {
            System.out.println("Alistamento não permitido");
        } else if (sexo == 'M' && idade >= 18) {
            System.out.println("Alistamento Obrigadotório");
        } else if (sexo == 'F' && idade >= 18) {
            System.out.println("Você deseja se alistar?");
        }
    }
}
