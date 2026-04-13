package ex008;

public class Teste {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setEspecie("Cachorro");
        animal.setVacinado(true);

        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Vacinado: " + animal.isVacinado());
    }
}
