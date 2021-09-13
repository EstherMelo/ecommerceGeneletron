package app;

import java.util.ArrayList;

import entities.Produto;

public class TelaNotaFiscal extends TelaDadosDoCliente {
	//construtor	
    public TelaNotaFiscal() 
    {
		super();	
	}
    boolean continuarMostrandoNota = true;
    // método
    public void show()
    {
    	do
    	{
		 	    mostrarBanner();
		 	    System.out.println("\t\tPARABÉNS PELA SUA COMPRA, " + formTelaDadosDoCliente.getNome() + "!!!!!");
		 	    //NOTA FISCAL
		 	    System.out.print("\n\t\t\tGENELETRON \n");
		 	    System.out.print("Avenida Paulista,908\t\tFone:(11)234-5678\n");
		 	    System.out.print("CNPJ 12.345.678/999.111\n");
		 	    System.out.println("Nome do cliente: " + formTelaDadosDoCliente.getNome());
		 	    System.out.print("\nCOD.\t\tPRODUTO\t\t\tVL.TOTAL\tQTD.\n");
		 	    
		 	    exibirLista(carrinho);
		 	   	                           
		 	    System.out.printf("\n\nTotal. . . . . . . . . . . . . . . . . . . . . . . . . R$ %.2f", formTelaFormaDePagamento.getTotalDaCompra());
		 	                              
		 	    
		 	    String formasDePagamento[] = {"À VISTA","CARTÃO","PARCELADO EM 2x"};
		 	    
		 	   System.out.print("\nForma de pagamento: " + formasDePagamento[formTelaFormaDePagamento.getiFormaDePagamento() - 1] + "\n");   
		 	   if (formTelaFormaDePagamento.getiFormaDePagamento() == 3)
		 	   {
		 	        System.out.printf("\nPARCELA #1: R$ %.2f",formTelaFormaDePagamento.getParcelasIguais());
		 	        System.out.printf("\nPARCELA #2: R$ %.2f",formTelaFormaDePagamento.getParcelasIguais());
		 	   }	
		 	   System.out.printf("\nImposto : . . . . . . . . . . . . . . . . . .  . . . . . R$ %.2f",formTelaFormaDePagamento.getImpostoDaCompra(),"\n");
		 	    System.out.printf("\nValor total da compra: . . . . . . . . . . . . . . . . . .R$ %.2f",formTelaFormaDePagamento.getTotalAPagar(),"\n");	                                                     
		 	  System.out.println("\n");
		    // esperar um pouco
		 	esperaUmPouco(1000); 	
		 	// perguntar se ele deseja continuar a compra
		 	exibirContinuarComprando();
		 	int opsn = opContinuarComprandoDigitadaEValida(3);
		 	if (opsn == 1)
		 	{
		 		if (fecharALoja)
		 		{
		 			comprando = false;
		 			exiContinuarComprando = false;
		 		}
		 		else
		 		{
		 			carrinho = new ArrayList<Produto>();
		 	 		pedindoCodigo = true;
		 	 		pedindoQuantidade = true;
		 	 		exiContinuarComprando = false;
		 		}
		 		Limpador.limpa();
		 		continuarMostrandoNota = false;
		 	}
		 	else 
		 	{
		 		continuarMostrandoNota = true;
		 	}
		 	
		 	System.out.println("\n\n\n\n");
    	} while(continuarMostrandoNota);
   
    }
    
  
}
