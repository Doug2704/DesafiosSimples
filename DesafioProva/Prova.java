import java.util.Scanner;

/***
 * 
 * @author Douglas
 *
 */
public class Prova {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int qtdPerguntas = 5;
		int valorQuestao = 2;
		char resposta = 'a';
		char[] respostas = new char[qtdPerguntas];
		int nota = 0;

		String[] perguntas = { "Qual a maior estrela do nosso sistema solar?", "Qual a primeira letra do alfabeto?",
				"2x10 é igual a?", "O fantástico mundo de ____(desenho dos anos 80)", "Valor de PI?" };

		String[] alternativas = { "a) Sol  | b) Lua  | c) Marte", "a) Z    | b) C    | c) A",
				"a) 10   | b) 20   | c) 12", "a) Bob  | b) Carl | c) Zec", "a) 3.10 | b) 3    | c) 3.14" };
		char[] gabarito = { 'a', 'c', 'b', 'a', 'c' };

		System.out.print("Digite seu nome: ");
		nome = sc.next();
		System.out.println("--------------------------------");

		do {
			for (int i = 0; i < qtdPerguntas; i++) {

				System.out.println("Pergunta " + (i + 1));
				System.out.println(perguntas[i]);
				System.out.println(alternativas[i]);
				resposta = sc.next().charAt(0);
				respostas[i] = resposta;
				System.out.println("--------------------------------");
				if (respostas[i] == gabarito[i]) {
					nota += valorQuestao;
				} else if (resposta != 'a' && resposta != 'b' && resposta != 'c') {
					System.out.println("Alternativa não existe, tente novamente");
					i -= 1; // evita iterar i, mantendo na mesma pergunta
				}

			}
		} while (resposta != 'a' && resposta != 'b' && resposta != 'c');
		System.out.print(nome + ", ");
		if (nota >= 7) {
			System.out.println("você foi aprovado");
		} else if (nota >= 5) {
			System.out.println("você está na final");
		} else {
			System.out.println("você foi reprovado");
		}
		System.out.println("Sua nota foi " + nota);
	}

}
