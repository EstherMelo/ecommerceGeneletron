package entities;

public class Produto {

	// atributos

	private String 	codProduto;
	private String 	nomeProduto;
	private double 	preco;
	private int    	qtdEstoque;
	private int		qtdVendas;
	private boolean eCarrinho;

	// construto
	public Produto(String codProduto, String nomeProduto, double preco, int qtdEstoque) {
		super();
		this.codProduto = codProduto;
		this.nomeProduto = nomeProduto;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
		this.qtdVendas = 0;
		this.eCarrinho = false;
	}

	// encapsulamento - getters and setters
	
	public String getCodProduto() {
		return codProduto;
	}

	public int getQtdVendas() {
		return qtdVendas;
	}

	public void setQtdVendas(int qtdVendas) {
		this.qtdVendas = qtdVendas;
	}

	public boolean iseCarrinho() {
		return eCarrinho;
	}

	public void seteCarrinho(boolean eCarrinho) {
		this.eCarrinho = eCarrinho;
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
		return codProduto + "\t" + nomeProduto + "\t\tR$ " + preco
				+ "\t" + (eCarrinho == true ? this.qtdVendas : this.qtdEstoque);
	}	
	
	public boolean temNoEstoque(int qtdDesejada)
	{
		if (this.getQtdEstoque() < qtdDesejada)
		{
			
			return (false);
		}
					
		return (true);
	}
	
	public void darBaixar(int qtdDesejada)
	{
		this.qtdEstoque -= qtdDesejada;
		
	}
	
	public void addCarrinho(int qtdDesejada)
	{
		this.qtdVendas += qtdDesejada;
	}
}
