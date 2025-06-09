import java.util.Random;
public class Exe21 {
    public static void main(String[] args) {
        Random gerador = new Random();

        int num = gerador.nextInt(101);

            System.out.println("Numero gerado = " + num);
    }
}
