import java.util.Scanner;
public class Exe14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int trocadorValor;
        System.out.println("Digite um valor : ");
        int valorA = scan.nextInt();
        System.out.println("Digite um valor : ");
        int valorB = scan.nextInt();
        System.out.println("valor A : " + valorA + " valor B : " + valorB);

        trocadorValor = valorA + valorB;
        valorB = trocadorValor - valorB;
        valorA = trocadorValor - valorA;

        System.out.println("valor A : " + valorA + " valor B : " + valorB);
    }
}
