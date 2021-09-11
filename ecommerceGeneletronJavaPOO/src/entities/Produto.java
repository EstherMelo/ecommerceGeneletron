package entities;

public class Produto {

	// atributos

	private String codProduto;
	private String nomeProduto;
	private double preco;
	private int    qtdEstoque;

	// construto
	public Produto(String codProduto, String nomeProduto, double preco, int qtdEstoque) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}

	// encapsulamento - getters and setters
	public String getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(String codProduto) {
		this.codProduto = codProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	// seja o que Deus quiser....
	@Override
	public String toString() {
		return "Produto [codProduto=" + codProduto + ", nomeProduto=" + nomeProduto + ", preco=" + preco
				+ ", qtdEstoque=" + qtdEstoque + "]";
	}

}
