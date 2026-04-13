package ex004;

public class BibliotecaMath {
    private BibliotecaMath() {
        // Construtor privado para evitar instância
    }

    public static double adicionar(double a, double b) {
        return a + b;
    }

    public static double media(double[] numeros) {
        double soma = 0;
        for (double n : numeros) {
            soma += n;
        }
        return soma / numeros.length;
    }

    public static boolean ePrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
