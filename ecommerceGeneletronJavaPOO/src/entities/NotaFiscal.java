package entities;

public class NotaFiscal {
	//atributos informacoes 
	private String nomeCliente;
	private String produtosComprados;
	private int qtde ;
	private String formaPagto;
	private int dataCompra;
	private double totalCompra;
	private String codigoProduto;
	
	//construtor
	public NotaFiscal(String nomeCliente, String produtosComprados, int qtde, String formaPagto, int dataCompra,
			double totalCompra, String codigoProduto) {
		super();
		this.nomeCliente = nomeCliente;
		this.produtosComprados = produtosComprados;
		this.qtde = qtde;
		this.formaPagto = formaPagto;
		this.dataCompra = dataCompra;
		this.totalCompra = totalCompra;
		this.codigoProduto = codigoProduto;
	}
	//encapsulamento - getters and setters
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getProdutosComprados() {
		return produtosComprados;
	}
	public void setProdutosComprados(String produtosComprados) {
		this.produtosComprados = produtosComprados;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	public String getFormaPagto() {
		return formaPagto;
	}
	public void setFormaPagto(String formaPagto) {
		this.formaPagto = formaPagto;
	}
	public int getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(int dataCompra) {
		this.dataCompra = dataCompra;
	}
	public double getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(double totalCompra) {
		this.totalCompra = totalCompra;
	}
	public String getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(String codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	//metodos
	
}
