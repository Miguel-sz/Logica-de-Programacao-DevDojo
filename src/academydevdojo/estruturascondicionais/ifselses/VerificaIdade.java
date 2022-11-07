package academydevdojo.estruturascondicionais.ifselses;
/*
        Receba uma idade como entrada
        Se a idade for maior que 18 imprima "Adulto"
        Senão imprima "Ainda não é adulto"
         */
public class VerificaIdade {
    public static void main(String[] args) {

        int idade = 21;
        if (idade >= 18) {
            System.out.println("Adulto");
        } else {
            System.out.println("Ainda não é adulto");
        }
    }
}
