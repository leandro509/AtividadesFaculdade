import java.util.Scanner;
public class Exe03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double soma = 0;
        System.out.println("Digite o primeiro numero  ");
        int numero1 = scan.nextInt();
        System.out.println("Digite o segundo numero ");
        int numero2 = scan.nextInt();
        if(numero1 == numero2 ) {
            soma = numero1 + numero2;
            System.out.println("O resultado eh " + soma);
        }else {
            soma = numero1 * numero2;
            System.out.println("O resultado eh " + soma);
        }
    }
}
