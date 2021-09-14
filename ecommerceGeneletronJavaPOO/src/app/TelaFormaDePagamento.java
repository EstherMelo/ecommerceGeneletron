package app;

public class TelaFormaDePagamento extends TelaPrincipal {
	
		private Boolean 	escolhendoFormaDePagamento;
		private String 		formaDePagamento;
		private int			iFormaDePagamento;
		private double    	totalDaCompra;
    	private double   	impostoDaCompra;    
    	private double      totalAPagar;
    	private double   	parcelasIguais;
	
    	
    	public TelaFormaDePagamento()  
    	{
    		
    	}
    	
    	public void show()
    	{ 
			 // 10) mostrar carinho de compra, total e imposto, e escolher a forma de pagamento 
	
	        totalDaCompra = 0.0;
	        impostoDaCompra = 0.0;
	        totalAPagar = 0.0;
	        escolhendoFormaDePagamento = true;
	        parcelasIguais = 0.0;
	        formaDePagamento = "0";
	        
	        Limpador.limpa();
	        // 10.a) calcular total da compra
	        for(int linha = 0; linha < carrinho.size(); linha++)
	        {
	            if(carrinho.get(linha).getQtdEstoque() > 0)
	            {
	                double valorDoProduto = carrinho.get(linha).getPreco();
	                totalDaCompra += valorDoProduto * carrinho.get(linha).getQtdEstoque();   //calcula a quantidade de cada produto vezes o preÃ§o                                 
	              
	            }
	        }
	        // 10.b) calcular importo
	        impostoDaCompra = totalDaCompra * 0.09;
	
	        do {
	            mostrarBanner();
	            System.out.print("---------------------------------------------------------\n");
	            System.out.printf("Total da compra: R$  %.2f \n",totalDaCompra);
	            System.out.printf("Valor do Imposto sobre a Compra (9): R$ %.2f", impostoDaCompra);	                            
	            System.out.println("\nEscolha a forma de pagamento:");
	            System.out.print("---------------------------------------------------------\n");
	            System.out.print("               OPÇÕES DE PAGAMENTO:\n");
	            System.out.print("        __________________________________\n");
	            System.out.print("       |1) À vista com 10% de desconto    |\n");
	            System.out.print("       |__________________________________|\n");
	            System.out.print("       |2) No cartão com 10% de acréscimo |\n");
	            System.out.print("       |__________________________________|\n");
	            System.out.print("       |3) Em duas vezes com 15% de taxa  |\n");
	            System.out.print("       |__________________________________|\n");
	            System.out.print("Opção: ");
	            formaDePagamento = leia.next();
	            if (!eUmNumero(formaDePagamento, 2))
	            {
	            	
	            	 System.out.print ("ESSA FORMA DE PAGAMENTO NÃO É VÁLIDA! POR FAVOR DIGITE 1,2 OU 3!");
	            	 esperaUmPouco(2000);
	            	 escolhendoFormaDePagamento = true;
	            	 Limpador.limpa();
	            }
				else
				{		
						escolhendoFormaDePagamento = false;
						iFormaDePagamento = Integer.parseInt(formaDePagamento);
			            // 10.e) de acordo com a forma de pagamento, calcular o totalAPagar
			            totalAPagar = totalDaCompra + impostoDaCompra;
			            
			            if (iFormaDePagamento == 1)
			            {
			                totalAPagar -= totalAPagar * 0.10; // calculo do desconto
			                escolhendoFormaDePagamento = false;
			            }
			            else if(iFormaDePagamento == 2)
			            {
			                totalAPagar += totalAPagar * 0.10; // calcule o acrÃ©scimo
			                escolhendoFormaDePagamento = false;
			            }
			            else if(iFormaDePagamento == 3)
			            {
			                totalAPagar += totalAPagar * 0.15; // parcelas
			                parcelasIguais = (totalAPagar / 2);
			                escolhendoFormaDePagamento = false;
			            }            
	            
				}
	        }while(escolhendoFormaDePagamento == true);
	        Limpador.limpa();
	        formTelaDadosDoCliente.show();
	        
    	}

		public Boolean getEscolhendoFormaDePagamento() {
			return escolhendoFormaDePagamento;
		}

		public void setEscolhendoFormaDePagamento(Boolean escolhendoFormaDePagamento) {
			this.escolhendoFormaDePagamento = escolhendoFormaDePagamento;
		}

		public String getFormaDePagamento() {
			return formaDePagamento;
		}

		public void setFormaDePagamento(String formaDePagamento) {
			this.formaDePagamento = formaDePagamento;
		}

		public double getTotalDaCompra() {
			return totalDaCompra;
		}

		public void setTotalDaCompra(double totalDaCompra) {
			this.totalDaCompra = totalDaCompra;
		}

		public double getImpostoDaCompra() {
			return impostoDaCompra;
		}

		public void setImpostoDaCompra(double impostoDaCompra) {
			this.impostoDaCompra = impostoDaCompra;
		}

		public double getTotalAPagar() {
			return totalAPagar;
		}

		public void setTotalAPagar(double totalAPagar) {
			this.totalAPagar = totalAPagar;
		}

		public double getParcelasIguais() {
			return parcelasIguais;
		}

		public void setParcelasIguais(double parcelasIguais) {
			this.parcelasIguais = parcelasIguais;
		}

		public int getiFormaDePagamento() {
			return iFormaDePagamento;
		}

		public void setiFormaDePagamento(int iFormaDePagamento) {
			this.iFormaDePagamento = iFormaDePagamento;
		}
    	
    	
	
}
