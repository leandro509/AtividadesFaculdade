import java.util.Scanner;
public class Exe22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor 1 ");
        int valor1 = scan.nextInt();
        System.out.println("Digite o valor 2 ");
        int valor2 = scan.nextInt();

        System.out.println("O quociente da divisao entre " + valor1 + " e " + valor2 + " = " + (valor1 / valor2));
        System.out.println("O resto da divisao entre " + valor1 + " e " + valor2 + " = " + (valor1 % valor2));
    }
}
