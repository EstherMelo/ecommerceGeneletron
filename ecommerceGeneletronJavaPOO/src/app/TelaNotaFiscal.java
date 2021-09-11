package app;

import java.util.ArrayList;

import entities.Produto;

public class TelaNotaFiscal extends TelaDadosDoCliente {
	//construtor	
    public TelaNotaFiscal() 
    {
		super();	
	}
    // método
    public void show()
    {
 	    mostrarBanner();
 	    System.out.println("\n\t\tPARABÉNS PELA SUA COMPRA, " + formTelaDadosDoCliente.getNome() + "!!!!!");
 	    //NOTA FISCAL
 	    System.out.print("_______________________________________________________________________\n");
 	    System.out.print("\t\t+++ GENELETRON +++\n");
 	    System.out.print("Avenida Paulista,908\t\tFone:(11)234-5678\n");
 	    System.out.print("CNPJ 12.345.678/999.111\n");
 	    System.out.print("=======================================================================\n");
 	    System.out.println("Nome do cliente: " + formTelaDadosDoCliente.getNome());
 	    System.out.print("\nCOD.\t\tPRODUTO\t\t\tVL.TOTAL\t\tQTD.\n");
 	    
 	    exibirLista(carrinho);
 	   	                           
 	    System.out.printf("\n\nTotal. . . . . . . . . . . . . . . . . . . . . . . . . . . . R$ %.3f", formTelaFormaDePagamento.getTotalDaCompra());
 	    System.out.print("\n_____________________________________________________________________\n");                           
 	    
 	    String formasDePagamento[] = {"À VISTA","CARTÃO","PARCELADO EM 2x"};

 	   System.out.print("Forma de pagamento: " + formasDePagamento[formTelaFormaDePagamento.getFormaDePagamento() - 1] + "\n");   
 	   if (formTelaFormaDePagamento.getFormaDePagamento() == 3)
 	   {
 	        System.out.printf("\nPARCELA #1: R$ %.3f",formTelaFormaDePagamento.getParcelasIguais());
 	        System.out.printf("\nPARCELA #2: R$ %.3f",formTelaFormaDePagamento.getParcelasIguais());
 	   }	
 	   System.out.printf("\nImposto : . . . . . . . . . . . . . . . . . .  . . . . . . . R$ %.3f",formTelaFormaDePagamento.getImpostoDaCompra(),"\n");
 	    System.out.printf("\nValor total da compra: . . . . . . . . . . . . . . . . . . . R$ %.3f",formTelaFormaDePagamento.getTotalAPagar(),"\n");	                                                     
 	    
 	  System.out.println("\n\n");
    // esperar um pouco
 	esperaUmPouco(1000); 	
 	// perguntar se ele deseja continuar a compra
 	exibirContinuarComprando();
 	if (opContinuarComprandoDigitadaEValida(3) == 1)
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
 	}
 	
 	System.out.println("\n\n\n\n");
    }
    
    
	
}
