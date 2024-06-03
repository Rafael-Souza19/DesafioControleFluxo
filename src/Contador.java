import java.util.Scanner;
public class Contador{

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scan.nextInt();
        


        try {
            contar (numero1, numero2);
            System.out.println("Imprimindo o numero 1: " + numero1);
            System.out.println("Imprimindo o numero 2: " + numero2);

        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
            System.out.println("O segundo número deve ser maior que o primeiro");
        }
    }

    static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        if (numero1 > numero2) {
            throw new ParametrosInvalidosException();
                } 









    }

}