package ex009;

public class Retangulo {
    private Retangulo() {
        // Construtor privado para evitar instância
    }

    public static double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public static double calcularPerimetro(double largura, double altura) {
        return 2 * (largura + altura);
    }

    public static String toString(double largura, double altura) {
        return "Retângulo [Largura: " + largura + ", Altura: " + altura + ", Área: " + calcularArea(largura, altura) + ", Perímetro: " + calcularPerimetro(largura, altura) + "]";
    }
}