import java.util.Scanner;

/***
 * 
 * @author Douglas
 *
 *         Vai cirar uma bomba de combustível.
 * 
 *         Onde, o cliente vai selecionar o tipo do combustível Gasolina Comum,
 *         Gasolina Aditivada, ou Etanol. Cada um tem seu valor em reais
 *         diferente.
 * 
 *         O cliente vai selecionar, e escolher, quantos litros.
 * 
 *         E ai precisa dar o resultado, do valor por litro. do combustível
 *         selecionado
 */
public class BombaCombustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String combustivel = null;
		double precoCombustivel = 0;
		double litros = 0;
		int escolha;
		System.out.println("Selecione o combustível");
		System.out.print("(1) Gasolina Comum (2) Gasolina Aditivada (3) Etanol: ");
		do {
			escolha = sc.nextInt();
			if (escolha == 1) {
				combustivel = "Gasolina Comum";
				precoCombustivel = 5.80;
			} else if (escolha == 2) {
				combustivel = "Gasolina Aditivada";
				precoCombustivel = 6.00;
			} else if (escolha == 3) {
				combustivel = "Etanol";
				precoCombustivel = 3.60;
			} else {
				System.out.println("Opção Inválida");
				System.out.println("Selecione o combustível");
				System.out.print("(1) Gasolina Comum (2) Gasolina Aditivada (3) Etanol: ");

			}
		} while (escolha < 1 || escolha > 3);
		System.out.println("Combustível Selecionado: " + combustivel);
		System.out.print("Informe a quantidade de litros: ");
		litros = sc.nextDouble();
		System.out.printf("Total a pagar: R$%.2f", (precoCombustivel * litros));
	}
}
