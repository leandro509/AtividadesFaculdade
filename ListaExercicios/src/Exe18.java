
public class Exe18 {
    public static void main(String[] args) {

        int anos = 0;

        String nome1 = "Francisco";
        double altura1 = 1.50;

        String nome2 = "Sarah";
        double altura2 = 1.10;

        System.out.println("Altura inicial " + nome1 + " -- " + altura1);
        System.out.println("Altura inicial " + nome2 + " -- " + altura2);

        while(altura2 <= altura1 ) {
                anos++;
                altura2 += 0.03;
                altura1 += 0.02;
        }

        System.out.println("Altura final " + nome1 + " -- " + altura1 + " -- anos passados " + anos);
        System.out.println("Altura final " + nome2 + " -- " + altura2 + " -- anos passados " + anos);


    }
}
