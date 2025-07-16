public class main {
    // AQUI ESTAVA O ERRO -> O método principal DEVE se chamar "main", eu tinha deixado como "Teste"
    // O método main é o ponto de entrada do programa Java, onde tudo começa a ser
    public static void main(String[] args) { 
        // Criando uma variável do tipo String (texto)
        String nome = "Renata";

        // Criando uma variável do tipo int (número inteiro)
        int idade = 32;

        // Criando uma variável do tipo double (número decimal)
        double altura = 1.79;

        // Criando uma variável do tipo boolean (verdadeiro/falso)
        boolean gostaDeJava = true;

        // Agora vamos imprimir essas informações!
        // O sinal de '+' aqui serve para juntar o texto com o valor da variável
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos.");
        System.out.println("Altura: " + altura + "m.");
        System.out.println("Gosta de Java? " + gostaDeJava);
    }
} //Lembrar que o nome da classe deve ser o mesmo do arquivo, ou seja, "main.java" deve conter a classe "main".