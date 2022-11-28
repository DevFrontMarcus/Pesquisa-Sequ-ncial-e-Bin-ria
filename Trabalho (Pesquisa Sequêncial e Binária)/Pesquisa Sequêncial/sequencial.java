import java.util.Locale;
import java.util.Scanner;

public class exercicio001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double l, h, a, m, v;

		Locale.setDefault(Locale.US);

		System.out.print("Por gentileza digite a largura: ");
		l = sc.nextDouble();

		System.out.print("Agora o valor da altura: ");
		h = sc.nextDouble();

		System.out.print("Preço do metro quadrado: ");
		m = sc.nextDouble();

		a = l * h;
		v = a * m;

		System.out.printf("Calculamos! o valor da area é: %.2f%n", a);
		System.out.printf("Também calculamos o preço é: %.2f", v);

		sc.close();

	}

}