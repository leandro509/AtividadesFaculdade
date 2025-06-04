import java.util.Scanner;
public class Exe05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salario minimo : ");
        double salarioMinimo = scan.nextDouble();
        System.out.println("Digite o seu salario : ");
        double salarioUsuario = scan.nextDouble();

        double calculoSalarios = salarioUsuario / salarioMinimo;

        System.out.println("O usuario ganha " + calculoSalarios + " salario(s) minimos ");

    }
}
