package ex006;

public class VeiculoTeste {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC-1234", "João Silva", "Civic", "Honda", 75000.0f);
        Veiculo veiculo2 = new Veiculo("XYZ-5678", "Maria Oliveira", "Corolla", "Toyota", 68000.0f);

        System.out.println("Veículo 1:");
        System.out.println("Placa: " + veiculo1.getPlaca());
        System.out.println("Nome do Dono: " + veiculo1.getNomeDono());
        System.out.println("Modelo: " + veiculo1.getModelo());
        System.out.println("Fabricante: " + veiculo1.getFabricante());
        System.out.println("Valor: R$ " + veiculo1.getValor());

        System.out.println("\nVeículo 2:");
        System.out.println("Placa: " + veiculo2.getPlaca());
        System.out.println("Nome do Dono: " + veiculo2.getNomeDono());
        System.out.println("Modelo: " + veiculo2.getModelo());
        System.out.println("Fabricante: " + veiculo2.getFabricante());
        System.out.println("Valor: R$ " + veiculo2.getValor());
    }
}
