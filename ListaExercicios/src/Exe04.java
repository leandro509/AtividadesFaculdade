import java.util.Scanner;
public class Exe04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite qualquer numero inteiro : ");
        int numero = scan.nextInt();
        int [] sequenciaNumeros = new int[3];
        sequenciaNumeros[0] = numero;
        for(int i = 0; i < 2; i++) {
            sequenciaNumeros[i + 1] = numero + (i + 1);
            if(i == 1) {
                sequenciaNumeros[i + 1] = numero - i;
            }
        }

        System.out.println("Numero - " + sequenciaNumeros[0] + " - Antecessor - " + sequenciaNumeros[2] + " - Sucessor - " + sequenciaNumeros[1]);
    }
}
