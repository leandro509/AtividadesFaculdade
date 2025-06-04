import java.util.Scanner;
public class Exe01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero : ");
        double number1 = scan.nextDouble();
        System.out.println("Digite outro numero : ");
        double number2 = scan.nextDouble();
        System.out.println("Digite o ultimo numero : ");
        double number3 = scan.nextDouble();
        double soma = number1 + number2;

        if(soma > number3) {
            System.out.println("A soma eh maior que o numero 3");
        }else if(soma == number3) {
            System.out.println("A soma eh igual ao numero 3");
        }else {
            System.out.println("A soma eh menor que o numero 3");
        }
        scan.close();
    }
}
