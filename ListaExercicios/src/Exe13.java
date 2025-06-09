import java.util.Scanner;
public class Exe13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome ");
        String nome = scan.nextLine();
        System.out.println("Digite sua idade ");
        int idade = scan.nextInt();
        if(idade < 18 ) {
            System.out.println(nome + " eh de menor");
        }else{
            System.out.println(nome + " eh de maior");
        }
    }
}
