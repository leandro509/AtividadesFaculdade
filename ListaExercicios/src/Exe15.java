import java.util.Scanner;
public class Exe15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int calculoAno;
        int calculoMes;
        int calculoDia;

        System.out.println("Digite seu ano de nascimento : ");
        int anoNascimento = scan.nextInt();
        System.out.println("Digite o mes de nascimento :");
        int mesNascimento = scan.nextInt();
        System.out.println("Digite o dia de nascimento : ");
        int diaNascimento = scan.nextInt();

        if(anoNascimento < 2025){
            calculoAno = 2025 - anoNascimento;

            if(mesNascimento != 6) {
                calculoAno --;
            }

            calculoMes =  (12 - 6) + (12 - mesNascimento);
            calculoDia = ( 30 - diaNascimento) + 9;

            if(calculoDia < 30) {
                calculoMes --;
            }

            System.out.println(calculoAno + " anos " + calculoMes + " meses " + calculoDia + " dias de vida!");
        }else{

            calculoAno = 2025 - anoNascimento;
            calculoMes = (6 - mesNascimento);

            if(calculoMes < 1) {
                calculoDia = (9 - diaNascimento);
            }

            calculoDia = (30 - diaNascimento) + 9;

            if(calculoDia < 30) {
                calculoMes--;
            }

            System.out.println(calculoAno + " anos " + calculoMes + " meses " + calculoDia + " dias de vida!");
        }
    }
}
