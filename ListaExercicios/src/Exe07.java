import java.util.Scanner;
public class Exe07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite true or false");
        boolean valor01 = scan.nextBoolean();
        System.out.println("Digite true or false");
        boolean valor02 = scan.nextBoolean();
        if(valor01 == true && valor02 == true) {
            System.out.println("Os dois valores sao verdadeiros.");
        }else if( valor01 == false && valor02 == false) {
            System.out.println("Os dois valores sao falsos.");
        }
    }
}
