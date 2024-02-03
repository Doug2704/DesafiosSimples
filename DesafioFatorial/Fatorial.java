import java.util.Scanner;

/***
 * 
 * @author Douglas
 *
 */
//Solicite um número inteiro ao usuário e calcule o fatorial desse número.
//EX: 5!=120 (Fatorial de 5 é igual a 120)
//Cálculo: 1x2x3x4x5 = 120
public class Fatorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Vamos calcular o fatorial de um número");
		System.out.print("Insira um número inteiro positivo: ");
		int entrada = sc.nextInt();

		long fatorial = 1l;
		for (int i = 1; i <= entrada; i++) {
			fatorial *= i;
		}
		System.out.print("O fatorial de " + entrada + " é "+entrada+"!= ");

		for (int i = 1; i <= entrada; i++) {
			if (i == entrada) {
				System.out.print(i);
			} else {
				System.out.print(i + " x ");
			}
		}
		System.out.print(" = " + fatorial);
		sc.close();
	}

}
