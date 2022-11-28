
import java.util.Scanner;

public class Binaria {
    public static void main(String[] args) {
        int[] vetor = new int[9];
        int i, busca, meio;

        System.out.println("Por gentileza digite os Dados que deseja armazenar ");
        for (i = 0; i <= 10; i++) {

            Scanner entrada = new Scanner(System.in);
            vetor[i] = entrada.nextInt();

        }
        System.out.println("Agora por gentileza digite o numero que deseja buscar: ");
        Scanner entrada = new Scanner(System.in);
        busca = entrada.nextInt();

    }
}
