import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double conta;
        try {
            Scanner leitor = new Scanner(System.in);
            System.out.println("Digite um nummero: ");
            var n1 = leitor.nextDouble();

            System.out.println("Diite um divisor para esse numero: ");
            var n2 = leitor.nextDouble();

            conta = n1 / n2;


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("resultado da conta é: " + conta);
    }
}
