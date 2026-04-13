package ex011;

public class Vetor {
    private double x, y, z;

    public Vetor(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vetor adicionar(Vetor v) {
        double novoX = this.x + v.x;
        double novoY = this.y + v.y;
        double novoZ = this.z + v.z;
        return new Vetor(novoX, novoY, novoZ);
    }

    public void multiplicacaoEscalar(double num) {
        this.x *= num;
        this.y *= num;
        this.z *= num;
    }

    public double produtoEscalar(Vetor v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    @Override
    public String toString() {
        return String.format("Vetor(%.2f, %.2f, %.2f)", x, y, z);
    }
}
