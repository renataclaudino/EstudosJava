import java.util.Scanner;

// Dica: A convenção em Java é começar nomes de classes com letra maiúscula (CalculadoraImc)
public class calculadoraImc {
    public static void main (String[] args){
        // ERRO 3 CORRIGIDO: Scanner com 'S' maiúsculo
        Scanner entrada = new Scanner (System.in);
        
        double peso, altura, imc;
        
        // ERRO 1 CORRIGIDO: Usando System.out.println
        System.out.println("Bem vindo à calculadora de IMC!!");
        
        System.out.println("Digite o seu nome: ");
        // ERRO 2 CORRIGIDO: String com 'S' maiúsculo
        String name = entrada.nextLine();
        
        // ERRO 1 CORRIGIDO: System com 'S' maiúsculo
        System.out.print("Digite o seu peso (em kg): ");
        peso = entrada.nextDouble();
        
        System.out.print("Digite a sua altura (em metros): ");
        altura = entrada.nextDouble();
        
        // ERRO 4 CORRIGIDO: Fórmula correta do IMC
        imc = peso / (altura * altura);
        
        // ERRO 5 CORRIGIDO: Usando o println que é mais simples para concatenar
        System.out.println("Olá " + name + ", seu IMC é: " + imc);
        
        // DICA DE BOA PRÁTICA: Fechar o scanner no final para liberar recursos
        entrada.close();
    }
}