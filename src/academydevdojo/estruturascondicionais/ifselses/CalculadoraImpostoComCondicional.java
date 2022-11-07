package academydevdojo.estruturascondicionais.ifselses;
    /*
Dado um determinado salário
se o salário for maior que 4500 imprima 30% do valor
senão imprima 15%
 */

public class CalculadoraImpostoComCondicional {
    /* public static void main(String[] args) {
        float salario = 4700.50F;
        if (salario < 4500) {
            float trintaCorcento = salario * 0.3F;
            System.out.println("30% do salário é igual a: " + trintaCorcento);
        } else {
            float dezPorCento = salario * 0.1F;
            System.out.println("10% do salário é igual a: " + dezPorCento);

        }

    }
    /*
    Desafio: Utilize apenas uma variavel para guardar o resultado e imprimir no final


    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        if (salario > 4500) {
            resultado = salario * 0.3F;
        } else {
            resultado = salario * 0.1F;
        }
        System.out.println("O valor final é: " + resultado);
    }

    Desafio 2 : Diga na impressão se é 30% ou 10%
    */

    public static void main(String[] args) {
        float salario = 4700.50F;
        float resultado = 0F;
        String porcentagem =  "";
        if (salario < 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30";
        } else {
            resultado = salario * 0.1F;
            porcentagem = "10";
        }
        System.out.println("O valor final em porcentagem de "+porcentagem+" é de " + resultado);

    }

}
