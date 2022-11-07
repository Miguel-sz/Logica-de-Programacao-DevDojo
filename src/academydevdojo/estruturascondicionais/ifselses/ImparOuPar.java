package academydevdojo.estruturascondicionais.ifselses;
/*
Dado um número inteiro
Defina se ele é impar ou par
 */
public class ImparOuPar {
    public static void main(String[] args) {
        int numero = 37;
        if ((numero % 2) == 0) {
            System.out.println("PAR: " + (numero % 2));
        } else {
            System.out.println("IMPAR: " + (numero % 2));
        }
    }
}
