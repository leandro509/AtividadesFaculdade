import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Exe24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kmPorLitro = 12;
        System.out.println("Digite o tempo da viagem em minutos : ");
        int minutos = scan.nextInt();
        System.out.println("Digite a sua velocidade media :");
        double velocidadeMedia = scan.nextDouble();

        double conversorMinutos = (minutos / 60);

        double distancia = conversorMinutos * velocidadeMedia;
        double litrosUsados = distancia / kmPorLitro;

        System.out.println("O tempo total da viagem foi " + conversorMinutos + " hora(s),  a velocidade media foi "
        + velocidadeMedia + "Km/h " + ", foram percorridos " + distancia + "Km " + " e foram gastos "
        + litrosUsados + " litros de gasolina!");

    }
}
