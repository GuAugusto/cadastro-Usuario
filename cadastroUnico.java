import java.util.Scanner;

public class cadastroUnico {

    public static void main(String[] args){
        Scanner entradaScanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao CU, cadastro unico. ");

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = entradaScanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf  = entradaScanner.nextLine();

        System.out.println("Digite sua idade: ");
        int idade  = entradaScanner.nextInt();

        System.out.println("Digite seu peso (kg): ");
        double peso = entradaScanner.nextDouble();

        System.out.println("Digite sua altura (m): : ");
        double altura = entradaScanner.nextDouble();

        entradaScanner.nextLine(); // limpa o buffer

        System.out.print("Digite seu estado civil: ");
        String estadoCivil = entradaScanner.nextLine();


        System.out.println("\n===== DADOS CADASTRADOS =====");
        System.out.println("Nome completo: " + nomeCompleto);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("\n===== FIM CADASTRO =====");


        entradaScanner.close();



    }
}
