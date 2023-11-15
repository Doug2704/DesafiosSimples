import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PrincipalProduto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos produtos deseja adicionar? ");
		int qtdProduto = sc.nextInt();

		List<Produto> produtos = new ArrayList<>();
		for (int i = 0; i < qtdProduto; i++) {
			System.out.print("Nome do Produto " + (i + 1) + ": ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço do Produto: ");
			double preco = sc.nextDouble();
			System.out.print("Tipo do Produto: (n) Novo (u) Usado (i) Importado ");
			char tipo = sc.next().charAt(0);

			if (tipo == 'u' || tipo == 'U') {
				System.out.print("Data de Fabricação (dd/MM/aaaa): ");
				LocalDate dataFabricacao = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
			}

			else if (tipo == 'i' || tipo == 'I') {
				System.out.print("Taxa de Importação: ");
				double taxaImportacao = sc.nextDouble();

				produtos.add(new ProdutoImportado(nome, preco, taxaImportacao));
			} else {

				produtos.add(new Produto(nome, preco));
			}

		}
		sc.close();
		System.out.println("Etiquetas dos Produtos: ");
		for (Produto prod : produtos) {
			System.out.println(prod.etiqueta());
		}
	}
}
