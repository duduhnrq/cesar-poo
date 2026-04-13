package ex010;

public class Pessoa {
    private String nome;
    // private int idade;
    private float altura;
    private double peso;
    // private char sexo;

    public Pessoa(String nome, int idade, float altura, double peso, char sexo) {
        this.nome = nome;
        // this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        // this.sexo = sexo;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }

    public String categoriaIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }

    public String toString() {
        return String.format(
            "Nome: %s | IMC: %.2f | Categoria: %s",
            nome, calcularIMC(), categoriaIMC()
        );
    }
}
