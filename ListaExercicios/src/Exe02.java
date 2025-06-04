import java.util.Scanner;
public class Exe02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        double numero = scan.nextDouble();
        if(numero % 2 == 0) {
            System.out.printf("O numero " + numero + " eh par");
            if(numero >= 0) {
                System.out.printf(" e eh positivo");
            }else {
                System.out.printf(" e eh negativo");
            }
        }else{
            System.out.printf("O numero " + numero + " eh impar");
            if(numero >= 0) {
                System.out.printf(" e eh positivo");
            }else {
                System.out.printf(" e eh negativo");
            }
        }
        scan.close();
    }
}
