import java.util.Scanner;
public class Exe19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o numero de uma tabuada ");
        int numeroTabuada = scan.nextInt();

        for(int multiplicador = 0; multiplicador <= 10; multiplicador++) {
            System.out.println(numeroTabuada + " * " + multiplicador + " = " + (numeroTabuada*multiplicador));
        }
    }
}
