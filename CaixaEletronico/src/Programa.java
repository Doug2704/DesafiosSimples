import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Conta conta = new Conta();
		System.out.print("Numero da conta: ");
		int i = sc.nextInt();
		double valor = 0;
		while (i != 1 || i != 2) {
			if (i == 1) {
				conta.setDono("Douglas");
				conta.setSaldo(500.50);
				break;
			} else if (i == 2) {
				conta.setDono("Silvia");
				conta.setSaldo(1500.50);
				break;
			} else {
				System.out.println("Conta inexistente");
				System.out.print("Numero da conta: ");
				i = sc.nextInt();
			}
		}

		System.out.print(conta.getDono() + " seu saldo é de: " + conta.stingSaldo());
		System.out.print("O que deseja fazer? (1) sacar (2) depositar (0)Sair ");

		i = sc.nextInt();
		while (i != 0) {

			while (i != 1 || i != 2) {
				if (i == 1) {
					System.out.print("Sacar: ");
					valor = sc.nextDouble();
					conta.sacar(valor);

					break;
				} else if (i == 2) {
					System.out.print("Depositar: ");
					valor = sc.nextDouble();
					conta.depositar(valor);
					break;
				} else {
					System.out.println("Opção Inválida");
					System.out.print("(1) sacar (2) depositar ");
					i = sc.nextInt();
				}
			}
			System.out.print("Saldo Atual: " + conta.stingSaldo());
			System.out.print("O que deseja fazer? (1) sacar (2) depositar (0)Sair ");
			i = sc.nextInt();

		}
		System.out.println("\nBanco Java Agradece a preferência");
		System.out.println("Volte Sempre");
		sc.close();

	}
}
