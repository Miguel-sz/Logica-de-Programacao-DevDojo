package academydevdojo.variaveis;
/*
Crie uma variavel que irá guardar um valor de um salário
Calcule a porcentagem desse salário, sendo os valore da porcentagem:
30%
15%
5%
A cada vez que você calcular guarde o resultado em uma variavel
Imprima o resultado e reutilize a variavel que guarda o resultado para o novo calculo, repetindo o processo
 */
public class ReutilizandoVariaveis  {
    public static void main(String[] args) {
        double salario = 5000;
        double resultado = salario * 0.3;
        System.out.println("30% é: "+resultado);
        resultado = salario * 0.15;
        System.out.println("15% é: "+resultado);
        resultado = salario * 0.05;
        System.out.println("5% é: "+resultado);


    }
}
