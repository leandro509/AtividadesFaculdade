import java.util.Scanner;
public class Exe17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit : ");
        double temperaturaF = scan.nextDouble();

        double conversorTemperatura = (5 * (temperaturaF - 32) / 9);

        System.out.println("Temperatura Fahrenheit - " + temperaturaF + " Temperatura Graus Celsius - " + conversorTemperatura);
    }
}
