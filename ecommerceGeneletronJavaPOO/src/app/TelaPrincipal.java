package app;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import entities.Produto;

public class TelaPrincipal {
	// global vars
	public static String opsn;
	public static int i;
	public static Scanner leia = new Scanner(System.in);
	
	public static ArrayList<Produto> carrinho;
	public static ArrayList<Produto> produtos;
	
	// métodos úteis
	public static int exibirLista(ArrayList<Produto> l)
	{
		int qtdVisivel = 0;
		if (l.size() >= 1)
		{
			for (int linha = 0; linha < l.size(); linha++)
			{				
				if (l.get(linha).getQtdEstoque() > 0)
				{
					System.out.println (l.get(linha).toString());
					qtdVisivel++;
				}
			}
			return (qtdVisivel);
		}
		return (qtdVisivel);
	}
	public static void mostrarBanner()
	{
     	System.out.println("GENELETRON");
     	System.out.println("Gerando economia e qualidade pro seu dia a dia!");
     	System.out.println("");
	}
	public static void limpa()
	{
		for (int x = 0; x < 30; x++)		
			System.out.println("\n\n");		
	}
	public static String esseCodigoExiste(String c, ArrayList<Produto> l)
	{		
		for (int linha = 0; linha < 10; linha++)
			if (l.get(linha).getCodProduto().toLowerCase().equals(c.toLowerCase()) && l.get(linha).getQtdEstoque() > 0)
				return (Integer.toString(linha));
		return (Integer.toString(-1));
	}
	public static boolean eUmNumero(String qtdDigitada)
	{
		for (int i = 0; i < qtdDigitada.length(); i++)
			if (!Character.isDigit(qtdDigitada.charAt(i)))
					return (false);
		return (true);
	}
	public static void exibirContinuarComprando()
	{
		System.out.print("\n\n\n\t\t■■■■■■■■■■■■■■■■■■■■■\n");
		System.out.print("\t\t CONTINUAR COMPRANDO?\n\t\t\t S/N: ");
		
	}
	public static int opContinuarComprandoDigitadaEValida(int turno) throws InterruptedException
	{
		String op;
		op = leia.next();
		if (!op.toLowerCase().equals("s") && !op.toLowerCase().equals("n"))
		{
			System.out.println("OPÇÃO INVÁLIDA!");
			Thread.sleep(3000);	
			return (-1);
		}
		else if(op.toLowerCase().equals("s"))
		{
			return (1);
		}
		else if (op.toLowerCase().equals("n") && turno == 1 || turno == 3)
		{
			System.out.println("ATÉ BREVE!");
		}
		return (2);
	}
	
	
	// coração do programa
	public static void main(String[] args) throws InterruptedException {
		// vars -> global
		Locale.setDefault(Locale.US);
		boolean rodando				= true;
				
		// vars -> controle de fluxo do programa
		boolean pedindoOpValida		= true;
		
		boolean comprando 			= true; 
		
		boolean pedindoCodigo 		= true;
		String	codigoDigitado		= "0";
		
		boolean pedindoQuantidade 	= true;
		String	quantidadeDigitada	= "0";
		
		boolean exiContinuarComprando = false;
		
		boolean pedindoFormaDePagamento = true;
		String	formaDePagamentoInformada = "0";
		
		boolean pedindoDadosDoCliente	= true;
		
		int i = 0;
		String op = " ";
		String indiceProdutoDigitado = " ";
		
		
		// input -> cadastrando produtos
		carrinho = new ArrayList<Produto>();
		produtos = new ArrayList<Produto>();
		produtos.add(new Produto("G1-1", "Notebook Acer Gamer ", 4700, 10));
		produtos.add(new Produto("G1-2", "Smart TV LG 55´	", 2799, 10));
		produtos.add(new Produto("G1-3", "Monitor 4k 32'	", 2500, 10));
		produtos.add(new Produto("G1-4", "Smartphone Motorola", 1799, 10));
		produtos.add(new Produto("G1-5", "Cadeira gamer Thunderx3", 1500, 10));
		produtos.add(new Produto("G1-6", "Drone DGI	", 5300, 10));
		produtos.add(new Produto("G1-7", "Xbox Séries S	", 2518, 10));
		produtos.add(new Produto("G1-8", "Apple watch series 3", 1500, 10));
		produtos.add(new Produto("G1-9", "Playstation 4	", 2799, 10));
		produtos.add(new Produto("G1-10", "Projetor 4k LG	", 7000, 10));
		
		//TelaFormaDePagamento tfpag1 = new TelaFormaDePagamento();
		
		/* TELA INICIAL */
		do {
			TelaInicial ti1 = new TelaInicial();		
			if (opContinuarComprandoDigitadaEValida(1) != -1)
				pedindoOpValida = false;
			limpa();
		}while(pedindoOpValida);
		
		
		
		
		/* TELA PRINCIPAL */
		while(comprando && rodando)
		{
			mostrarBanner();		
			// 1) Mostrar Produtos
			System.out.println("CÓDIGO\tNOME\t\t\t\tPREÇO\t\tNO ESTOQUE");
			System.out.print("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
			if (exibirLista(produtos) == 0)
			{
				System.out.println("ATENÇÃO! NENHUM PRODUTO DISPONÍVEL NO ESTOQUE!");
				Thread.sleep(5000);
				
				System.out.println("VOCÊ SERÁ REDIRECIONADO PARA ESCOLHER A FORMA DE PAGAMENTO!");
				Thread.sleep(3000);
				
				limpa();
				TelaFormaDePagamento tfpag11 = new TelaFormaDePagamento();
				System.out.println("TESTANDOOOO!");
			}
			
			// 2) Mostrar Carrinho
			System.out.println("\n\nCARRINHO:");
			System.out.print("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n");
			exibirLista(carrinho);
		
			System.out.println("\n\n");		
			
			// 3) Perguntando o Código do Produto
			boolean jaTaNoCarrinho = false;
			int		indiceJaTaNoCarrinho = 0;
			
			while (pedindoCodigo) {
				System.out.print("DIGITE O CÓDIGO DO PRODUTO: ");
				codigoDigitado = leia.next();
				indiceProdutoDigitado = esseCodigoExiste(codigoDigitado, produtos);
				i = Integer.parseInt(indiceProdutoDigitado);
				if (indiceProdutoDigitado.equals("-1"))
				{
					System.out.println("CÓDIGO INVÁLIDO!\n");
					pedindoCodigo = true;
				}
				else 
				{
					// verificar se o produto já está no carrinho
					for (int linha = 0; linha < carrinho.size(); linha++)
					{
						if (carrinho.get(linha).getCodProduto().toLowerCase().equals(codigoDigitado.toLowerCase())) // se produto já está no carrinho
						{
							jaTaNoCarrinho = true;
							indiceJaTaNoCarrinho = linha;
							pedindoCodigo = false;
							break;
						}
					}
					if (!jaTaNoCarrinho || carrinho.size() == 0)
					{
						// se o carrinho for vazio, ou se o produto que eu to tentando comprar não estiver
						Produto newp = new Produto(produtos.get(i).getCodProduto(), produtos.get(i).getNomeProduto(), produtos.get(i).getPreco(), produtos.get(i).getQtdEstoque());
						carrinho.add(newp);
						carrinho.get(carrinho.size() - 1).seteCarrinho(true);
						pedindoCodigo = false;
					}
				}
			}
			
			// 4) Perguntando a Quantidade do Produto
			while (pedindoQuantidade) {
				System.out.print("DIGITE A QUANTIDADE QUE VOCÊ DESEJA: ");
				quantidadeDigitada = leia.next();			
				
				if (!eUmNumero(quantidadeDigitada))
					System.out.println("INFORME A QUANTIDADE UTILIZANDO APENAS NÚMEROS DE 1 A 9!");
				else if (!produtos.get(i).temNoEstoque(Integer.parseInt(quantidadeDigitada)))
					System.out.println("QUANTIDADE INVÁLIDA NO ESTOQUE!");
				else
				{
					pedindoQuantidade = false;
					
					// 5) dar baixa no estoque && adicionar a quantidade vendida no carrinho no produto
					produtos.get(i).darBaixar(Integer.parseInt(quantidadeDigitada));
					carrinho.get((jaTaNoCarrinho ? indiceJaTaNoCarrinho : i)).addCarrinho(Integer.parseInt(quantidadeDigitada));
					
					// 6) exibir mensagem de sucesso, esperar um pouquinho.. 								
					System.out.println("PRODUTO ADICIONADO AO CARRINHO COM SUCESSO!");
					Thread.sleep(1500);					
				}
			}		
			
			// 7) atualizar o carrinho, 
			if (exiContinuarComprando)
			{
				// 8) e mostrar o continuar comprando	
				exibirContinuarComprando();
				
				// 9) se N vai para forma de pagamento, se S, recomeça as compras
				do
				{
					int r = opContinuarComprandoDigitadaEValida(2);
					if (r == 1)
					{
						limpa();
						pedindoCodigo = true;
						pedindoQuantidade = true;
						exiContinuarComprando = false;
					}
					else if (r == 2)
					{
						limpa();
						TelaFormaDePagamento tfpag111 = new TelaFormaDePagamento();
					}
				}while(pedindoOpValida);
			}
			else 
				exiContinuarComprando = true;
		}
		
	}
}