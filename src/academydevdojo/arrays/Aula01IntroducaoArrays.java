package academydevdojo.arrays;

public class Aula01IntroducaoArrays {
    public static void main(String[] args) {
        double nota1 = 7.5;
        double nota2 = 8;
        double nota3 = 3;
        double nota4 = 6;
        double media = (nota1 + nota2 + nota3 + nota4) / 3;
        System.out.println("A média das 3 notas é: " + media);
        double [] notas = new double [4];
        System.out.println("-----------");
        notas[0] = 7.5;
        notas[1] = 8;
        notas[2] = 3;
        notas[3] = 6;
        System.out.println(notas[0]);
        System.out.println(notas[1]);
        System.out.println(notas[2]);
        System.out.println(notas[3]);


    }
}
