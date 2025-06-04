import java.util.Scanner;
public class Exe06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor : ");
        double valor = scan.nextDouble();
        double reajusteValor =  valor + (valor * 0.05);
        System.out.println("O valor com o reajuste eh " + reajusteValor);
    }
}
