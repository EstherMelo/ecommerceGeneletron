package app;

public class TelaDadosDoCliente extends TelaFormaDePagamento {

	//atributos
	private String cpf;
	private String rg;
	private String nome;
	private String telefone;
	private String email;
	private char pronome;
	private int anoNascimento;
	private int genero;
	private int endereco;
	
	
	
	//construtor	
    public TelaDadosDoCliente() 
    {
		super();	
	}
    // método
    public void show()
    {   
		mostrarBanner();		
	    leia.nextLine();
	    System.out.print("Nome: ");
	    this.nome = leia.nextLine();	    	
	    formTelaNotaFiscal.show();
    }
	
	//encapsulamento - getters and setters
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getRg() {
		return rg;
	}


	public void setRg(String rg) {
		this.rg = rg;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public char getPronome() {
		return pronome;
	}


	public void setPronome(char pronome) {
		this.pronome = pronome;
	}


	public int getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}


	public int getGenero() {
		return genero;
	}


	public void setGenero(int genero) {
		this.genero = genero;
	}


	public int getEndereco() {
		return endereco;
	}


	public void setEndereco(int endereco) {
		this.endereco = endereco;
	}
	
	//metodos
	

}
