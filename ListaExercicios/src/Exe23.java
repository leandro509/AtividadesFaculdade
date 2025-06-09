import java.util.Scanner;
public class Exe23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor da hora da aula ");
        double valorHoraAula = scan.nextDouble();
        System.out.println("Digite o numero de aula lecionadas no mes");
        int quantidadeAulas = scan.nextInt();
        System.out.println("Digite o percentual de desconto do INSS ");
        double descontoInss = scan.nextDouble();
        double valorSalarioFinal = ((valorHoraAula * quantidadeAulas) - ((descontoInss / 100) * (valorHoraAula * quantidadeAulas)));
        System.out.println("Salario sem desconto  = " + (valorHoraAula * quantidadeAulas) + " -- valor descontado = "
                + ((descontoInss / 100) * (valorHoraAula * quantidadeAulas)) + " -- salario liquido = " + valorSalarioFinal);
    }
}
