import java.util.Scanner;

public class App {
    private static final Scanner ENTRADA = new Scanner(System.in);
    
    public static void main(String[] args) throws Exception {
        int a = ENTRADA.nextInt();
        double b = ENTRADA.nextDouble();
        boolean c = ENTRADA.nextBoolean();
        long d = ENTRADA.nextLong();

        System.out.println("Valor inteiro: " + a);
        System.out.println("Valor double: " + b);
        System.out.println("Valor booleano: " + c);
        System.out.println("Valor long: " + d);
    }
}
