import java.util.Scanner;
public class Exe11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do aluno : ");
        String nomeAluno = scan.nextLine();

        System.out.println("Digite a nota 1 : ");
        double nota1 = scan.nextDouble();
        System.out.println("Digite a nota 2 : ");
        double nota2 = scan.nextDouble();
        System.out.println("Digite a nota 3 : ");
        double nota3 = scan.nextDouble();
        System.out.println("Digite a nota 4");
        double nota4 = scan.nextDouble();
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        if(media >= 7) {
            System.out.println("O aluno " + nomeAluno + " foi aprovado com a media - " + media);
        } else{
            System.out.println("O aluno " + nomeAluno + " foi reprovado com a media - " + media);
        }
    }
}
