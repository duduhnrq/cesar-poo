package ex011;

public class Teste {
    public static void main(String[] args) {
        Vetor a = new Vetor(1, 2, 3);
        Vetor b = new Vetor(4, 5, 6);

        Vetor soma = a.adicionar(b);
        System.out.println("A + B = " + soma);         // (5x̂ + 7ŷ + 9ẑ)

        double escalar = a.produtoEscalar(b);
        System.out.println("A · B = " + escalar);      // 32.0

        a.multiplicacaoEscalar(2);
        System.out.println("2 * A = " + a);            // (2x̂ + 4ŷ + 6ẑ)
    }
}
