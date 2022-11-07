package academydevdojo.estruturascondicionais.ifselses;
/*
Receba um número inteiro do usuário e imprima o dia da semana correspondente
Sendo 1 igual a segunda feira
 */
public class DiasDaSemana {
    public static void main(String[] args) {
        int dia = 2;

        if (dia == 1) {
            System.out.println("Segunda");
        } else if (dia == 2) {
            System.out.println("Terça");
        } else if (dia == 3) {
            System.out.println("Quarta");
        } else if (dia == 4) {
            System.out.println("Quinta");
        } else if (dia == 5) {
            System.out.println("Sexta");
        } else if (dia == 6) {
            System.out.println("Sabádo");
        } else if (dia == 7) {
            System.out.println("Domingo");
        } else {
            System.out.println("Dia Inválido");
        }
    }
}
