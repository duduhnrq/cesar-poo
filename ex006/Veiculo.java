package ex006;

public class Veiculo {
    private String placa;
    private String nomeDono;
    private String modelo;
    private String fabricante;
    private float valor;
    
    public Veiculo(String placa, String nomeDono, String modelo, String fabricante, float valor) {
        this.placa = placa;
        this.nomeDono = nomeDono;
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}