import java.util.Scanner;
public class Exe12 {
    public static void main(String[] args) {
        int formaPagamento;
        double valorAPagar = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do produto : ");
        double valor = scan.nextDouble();
        System.out.println("1 - À Vista em Dinheiro ou Pix, recebe 15% de desconto");
        System.out.println("2 - À Vista no cartão de crédito, recebe 10% de desconto");
        System.out.println("3 - Parcelado no cartão em duas vezes, preço normal do produto sem juros");
        System.out.println("4 - Parcelado no cartão em três vezes ou mais, preço normal do produto mais juros de 10%");
        System.out.println("Digite a forma de pagamento : ");

        formaPagamento = scan.nextInt();

        switch(formaPagamento) {

            case 1:
                valorAPagar = valor - (valor * 0.15);
                break;

            case 2 :
                valorAPagar = valor - (valor * 0.10);
                break;

            case 3 :
                valorAPagar = valor;
                break;
            case 4:
                valorAPagar = valor + (valor * 0.10);
                break;

            default:
                throw new RuntimeException("Nao foi selecionado uma forma de pagamento!");

        }

        System.out.println("Valor a pagar " + valorAPagar);

    }
}
