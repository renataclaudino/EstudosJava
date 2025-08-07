public class Aula4Operadores {
    public static void main (String [] args){
        int a = 10, b = 3;

        System.out.println("Soma: " + (a +b));
        System.out.println("Subtração: " +(a-b));
        System.out.println("Multiplicação: " + (a*b));
        System.out.println("Divisão inteira: "+ (a/b));
        System.out.println("Resto: "+(a%b));
        
        a += 5;
        System.out.println("Novo valor de a: " + (a += 5));
    }
    
}
