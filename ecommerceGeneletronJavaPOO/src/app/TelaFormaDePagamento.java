package app;

public class TelaFormaDePagamento extends TelaPrincipal {
	
		private Boolean 	escolhendoFormaDePagamento;
		private int 		formaDePagamento;
    	
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
	        formaDePagamento = 0;
	        
	        limpa();
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
	
	            System.out.printf("Total da compra: R$  %.3f \n",totalDaCompra);
	            System.out.printf("Valor do Imposto sobre a Compra (9): R$ %.3f", impostoDaCompra,"\n\n");
	

	            System.out.println("â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– ");
	            System.out.println("\tEscolha a forma de pagamento: \n");
	            System.out.println("â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– â– ");
	            System.out.print(" __________________________________\n");
	            System.out.print("|1) Ã� Vista Com 10% Desconto       |\n");
	            System.out.print("|__________________________________|\n");
	            System.out.print("|2) No cartÃ£o com 10% de acrescimo |\n");
	            System.out.print("|__________________________________|\n");
	            System.out.print("|3) Em duas vezes com 15% de taxa  |\n");
	            System.out.print("|__________________________________|\n");
	            System.out.print("OpÃ§Ã£o: ");
	            formaDePagamento = leia.nextInt();
	           
	
	            // 10.e) de acordo com a forma de pagamento, calcular o totalAPagar
	            totalAPagar = totalDaCompra + impostoDaCompra;
	            
	            if (formaDePagamento == 1)
	            {
	                totalAPagar -= totalAPagar * 0.10; // calculo do desconto
	                escolhendoFormaDePagamento = false;
	            }
	            else if(formaDePagamento == 2)
	            {
	                totalAPagar += totalAPagar * 0.10; // calcule o acrÃ©scimo
	                escolhendoFormaDePagamento = false;
	            }
	            else if(formaDePagamento == 3)
	            {
	                totalAPagar += totalAPagar * 0.15; // parcelas
	                parcelasIguais = (totalAPagar / 2);
	                escolhendoFormaDePagamento = false;
	            }
	            else
	            {
	                System.out.print ("Essa nÃ£o Ã© uma forma de pagamento vÃ¡lida!");
	                escolhendoFormaDePagamento = true;
	            }	            
	            
	        }while(escolhendoFormaDePagamento == true);
	        
	        formTelaDadosDoCliente.show();
	        
    	}

		public Boolean getEscolhendoFormaDePagamento() {
			return escolhendoFormaDePagamento;
		}

		public void setEscolhendoFormaDePagamento(Boolean escolhendoFormaDePagamento) {
			this.escolhendoFormaDePagamento = escolhendoFormaDePagamento;
		}

		public int getFormaDePagamento() {
			return formaDePagamento;
		}

		public void setFormaDePagamento(int formaDePagamento) {
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
    	
    	
	
}
