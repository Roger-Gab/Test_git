import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		String name;
		double n1;
		double n2;
		double media;

		System.out.println("Digite o nome do aluno:");
		name = sc.next();

		System.out.println("Digite a primeira nota do aluno "+name);
		n1 = sc.nextDouble();

		System.out.println("Digite a segunda nota do aluno "+name);
		n2 = sc.nextDouble();

		media = (n1 + n2) / 2.0;

		if (media >= 6.0) {
			System.out.println("Aluno aprovado!");
			System.out.printf("Média: %.1f", media);
		} else {
			System.out.println("Aluno reprovado!");
			System.out.printf("Média: %.1f", media);
		}
		sc.close();
	}
}

