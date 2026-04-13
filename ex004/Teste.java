package ex004;

public class Teste {
    public static void main(String[] args) {
        double soma = BibliotecaMath.adicionar(5.5, 3.2);
        System.out.println("Soma: " + soma);

        double[] numeros = {2.0, 4.0, 6.0, 8.0};
        double media = BibliotecaMath.media(numeros);
        System.out.println("Média: " + media);

        int numero = 17;
        boolean primo = BibliotecaMath.ePrimo(numero);
        System.out.println("O número " + numero + " é primo: " + primo);
    }
}
