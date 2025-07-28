import java.util.Scanner; //importando a classe Scanner para ler dados inseridos pelo usuário

public class perfilInterativo {
    public static void main (String [] args) {
        Scanner leitor = new Scanner(System.in); //Criando um objeto leitor da classe Scanner
        
        System.out.print("Por favor, insira o seu nome: "); //aqui pedimos o nome do usuário
        String nome = leitor.nextLine();

        System.out.print("Por favor, digite o seu ano de nascimento: "); //aqui pedimos o ano de nascimento do usuário
        int anoNascimento = leitor.nextInt();

        // ERRO 2 (Correção): Limpando o "Enter" que o nextInt() deixou para trás.
        leitor.nextLine(); 

        System.out.print("Por favor, informe seu peso em kg: ");
        // MELHORIA: Usando double para o peso, pois pode ter casas decimais.
        double peso = leitor.nextDouble(); //Lendo o peso do usuário

        int anoAtual = 2025; // Definindo o ano atual
        int idade = anoAtual - anoNascimento; //Calculando a idade do usuário
        
        System.out.println("\n--- Perfil Gerado ---"); // Usei \n para pular uma linha e organizar
        System.out.println("Olá, " + nome +". Seja bem vindo ao nosso programa interativo!");
        System.out.println("Com base no ano de nascimento informado, você tem " + idade + " anos.");

        // ERRO 1 (Correção): Adicionado o '+' para concatenar.
        System.out.println("Seu peso declarado é " + peso + " kg");

        leitor.close(); // Não se esqueça de fechar o leitor no final!
    }
}