import java.util.Scanner;

public class CalculadoraIMCHardcore {
    // Abre a classe

    // ERRO 1 CORRIGIDO: Assinatura correta do método main
    public static void main(String[] args) {
        // Todo o código de execução começa aqui, dentro do main

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso em kg: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a sua altura em metros: ");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        // ERRO 2 CORRIGIDO: Adicionados os parênteses em todas as condições
        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 24.9) {
            System.out.println("Classificação: Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Classificação: Sobrepeso");
        } else if (imc >= 30 && imc < 34.9) {
            System.out.println("Classificação: Obesidade grau I");
        } else if (imc >= 35 && imc < 39.9) {
            System.out.println("Classificação: Obesidade grau II");
        } else {
            System.out.println("Classificação: Obesidade grau III ou mórbida");
        }

        // ERRO 3 CORRIGIDO: Usando o println para simplicidade
        System.out.println("Seu IMC é: " + imc);

        entrada.close(); // Boa prática!

    } // Fecha o método main

} // Fecha a classe