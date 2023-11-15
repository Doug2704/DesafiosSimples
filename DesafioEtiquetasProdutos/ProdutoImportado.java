
public class ProdutoImportado extends Produto {
	private double taxaImportacao;

	public ProdutoImportado() {
		super();
	}

	public ProdutoImportado(String nome, double preco, double taxaImportacao) {
		super(nome, preco);
		this.taxaImportacao = taxaImportacao;
	}

	public double getTaxaImportacao() {
		return taxaImportacao;
	}

	public void setTaxaImportacao(double taxaImportacao) {
		this.taxaImportacao = taxaImportacao;
	}

	@Override
	public String etiqueta() {
		return getNome() + " R$" + String.format("%.2f", (getPreco() + taxaImportacao)) + " (Taxa de Importação: "
				+ String.format("%.2f", taxaImportacao) + ")";
	}
}
