package app;

public class TelaNotaFiscal {
	//construtor
	

    public TelaNotaFiscal() {
		super();
		
		System.out.print("GENELETRON\n");
	    System.out.print("-----------------------------------------------\n");
	    System.out.print("Gerando economia e qualidade pro seu dia a dia!\n\n");
	    System.out.print("Nome do cliente: ");
		
		String nomeDoCliente;
	    leia.nextLine();;
	    nomeDoCliente = leia.nextLine();
	    	
	    System.out.print(nomeDoCliente);
	    limpa();
	    System.out.print("\t\t\tGENELETRON\n");
	    System.out.print("------------------------------------------------------------------------\n");
	    System.out.print("\t  Gerando economia e qualidade pro seu dia a dia!\n");
	    //int apresentarCarrinho;  

	    System.out.println("\n\t\tPARABÉNS PELA SUA COMPRA, " +nomeDoCliente+ "!!!!!");
	    //NOTA FISCAL
	    //System.out.print("\nResumo da sua compra.\n");
	    System.out.print("_______________________________________________________________________\n");
	    System.out.print("\t\t+++ GENELETRON +++\n");
	    System.out.print("Avenida Paulista,908\t\tFone:(11)234-5678\n");
	    System.out.print("CNPJ 12.345.678/999.111\n");
	    System.out.print("=======================================================================\n");
	    System.out.println("Nome do cliente: " + nomeDoCliente);
	    System.out.print("\nCOD.\t\tPRODUTO\t\t\tVL.TOTAL\t\tQTD.\n");
	    for (int linha = 0; linha<10; linha++)
		{
			if(carrinho[linha] > 0) 
			{
				System.out.print(produtos[linha][0]+"\t  "+ produtos[linha][1]+"\t  "+produtos[linha][2]+"\t         "+carrinho[linha]);
				System.out.print("\n") ;
			}
		}
	   	                           
	    System.out.printf("\n\nTotal. . . . . . . . . . . . . . . . . . . . . . . . . . . . R$ %.3f",totalDaCompra);
	    System.out.print("\n_____________________________________________________________________\n");                           
	    
	    String formasDePagamento[] = {"À VISTA","CARTÃO","PARCELADO EM 2x"};

	   System.out.print("Forma de pagamento: " + formasDePagamento[formaDePagamento - 1] + "\n");   
	   if (formaDePagamento == 3){
	        System.out.printf("\nPARCELA #1: R$ %.3f",parcelasIguais);
	        System.out.printf("\nPARCELA #2: R$ %.3f",parcelasIguais);
	        }	
	   System.out.printf("\nImposto : . . . . . . . . . . . . . . . . . .  . . . . . . . R$ %.3f",impostoDaCompra,"\n");
	    System.out.printf("\nValor total da compra: . . . . . . . . . . . . . . . . . . . R$ %.3f",totalAPagar,"\n");	                                                     
	    System.out.print("\n======================================================================\n\n\n\n\n");
			
	}
	
}
