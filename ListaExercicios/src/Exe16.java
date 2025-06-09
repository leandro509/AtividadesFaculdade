import java.util.Scanner;
public class Exe16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado 1 ");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o tamanho do lado 2 ");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o tamanho do lado 3 ");
        double lado3 = scan.nextDouble();

        if(lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triangulo e equilatero, os tres lados sao iguais");
        }else if(lado1 == lado2 || lado2 == lado3 || lado3 == lado1) {
            System.out.println("O triangulo e isosceles, dois lados sao iguais");
        }else {
            System.out.println("O triangulo e escaleno, os tres lados sao diferentes");
        }
    }
}
