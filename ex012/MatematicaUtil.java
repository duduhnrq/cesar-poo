package ex012;

public class MatematicaUtil {
    private MatematicaUtil() {
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public double media(double a, double b) {
        return (a + b) / 2;
    }

    public boolean ePrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
