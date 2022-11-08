package academydevdojo.lacosderepeticao.fors;
/*
tabuada do número 1 até o 10, com resultado e números fixos
 */

public class Aula03ExercicioForAninhado {
    public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Fazendo tabuada do número: "+i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + (i*j));
            }
        }
    }
}