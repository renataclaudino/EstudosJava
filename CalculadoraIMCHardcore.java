import java.util.Scanner;

public class CalculadoraIMCHardcore {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu peso em kg: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a sua altura em centímetros: ");
        double alturaCm = entrada.nextDouble();

        // Convertendo para metros
        double altura = alturaCm / 100;

        double imc = peso / (altura * altura);

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

        System.out.printf("Seu IMC é: %.2f\n", imc);

        entrada.close();
    }
}
