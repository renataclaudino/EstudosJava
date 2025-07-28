public class VerificaAprovacao{
    public static void main(String[] args) {
        double nota = 6.5;

        if (nota >= 7.0) {
            System.out.println("Aprovado!");
        } else if (nota >= 5.0) {
            // Só chega aqui se a primeira condição (nota >= 7.0) for falsa
            System.out.println("Recuperação.");
        } else {
            // Só chega aqui se TODAS as condições anteriores forem falsas
            System.out.println("Reprovado.");
        }
    }
}