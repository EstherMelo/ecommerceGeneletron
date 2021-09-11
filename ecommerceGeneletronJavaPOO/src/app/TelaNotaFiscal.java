package app;

public class TelaNotaFiscal extends TelaDadosDoCliente {
	//construtor
	

    public TelaNotaFiscal() {
		super();
		
		
	    limpa();
	    mostrarBanner();
	    System.out.println("\n\t\tPARABÉNS PELA SUA COMPRA, " + getNome() + "!!!!!");
	    //NOTA FISCAL
	    System.out.print("_______________________________________________________________________\n");
	    System.out.print("\t\t+++ GENELETRON +++\n");
	    System.out.print("Avenida Paulista,908\t\tFone:(11)234-5678\n");
	    System.out.print("CNPJ 12.345.678/999.111\n");
	    System.out.print("=======================================================================\n");
	    System.out.println("Nome do cliente: " + getNome());
	    System.out.print("\nCOD.\t\tPRODUTO\t\t\tVL.TOTAL\t\tQTD.\n");
	    
	    exibirLista(carrinho);
	   	                           
	    System.out.printf("\n\nTotal. . . . . . . . . . . . . . . . . . . . . . . . . . . . R$ %.3f",getTotalDaCompra());
	    System.out.print("\n_____________________________________________________________________\n");                           
	    
	    String formasDePagamento[] = {"À VISTA","CARTÃO","PARCELADO EM 2x"};

	   System.out.print("Forma de pagamento: " + formasDePagamento[getFormaDePagamento() - 1] + "\n");   
	   if (getFormaDePagamento() == 3){
	        System.out.printf("\nPARCELA #1: R$ %.3f",getParcelasIguais());
	        System.out.printf("\nPARCELA #2: R$ %.3f",getParcelasIguais());
	        }	
	   System.out.printf("\nImposto : . . . . . . . . . . . . . . . . . .  . . . . . . . R$ %.3f",getImpostoDaCompra(),"\n");
	    System.out.printf("\nValor total da compra: . . . . . . . . . . . . . . . . . . . R$ %.3f",getTotalAPagar(),"\n");	                                                     
	    System.out.print("\n======================================================================\n\n\n\n\n");
			
	}
	
}
