import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exe08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero inteiro : ");
        int numero1 = scan.nextInt();
        System.out.println("Digite um numero inteiro : ");
        int numero2 = scan.nextInt();
        System.out.println("Digite um numero inteiro : ");
        int numero3 = scan.nextInt();

        Integer [] numeros = new Integer[3];
        numeros[0] = numero1;
        numeros[1] = numero2;
        numeros[2] = numero3;

        Arrays.sort(numeros, Collections.reverseOrder());

        System.out.println(Arrays.toString(numeros));
    }
}
