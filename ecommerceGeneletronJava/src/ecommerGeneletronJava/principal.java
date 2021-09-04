package ecommerGeneletronJava;

import java.util.Locale;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// 0) config project
				Locale.setDefault(Locale.US);
		
		// 1) variáveis
				Scanner leia = new Scanner(System.in);
				String nomeCliente;
				String produtos[][] = new String[10][4];
				int carrinho[] = new int [10];
				char comprando; 
				String codigo;
				int quantidade;
			    char  continuarComprandoV;
				boolean continuarCompra;
			    boolean perguntandoQuantidade;
			    int linhaDoCodigoInserido;
			    int updateCarrinho;
				boolean perguntandoCodigo;
				int resetarCompra;
				boolean finalizarPrograma;
				boolean quantidadeValidada = false;
			     
				comprando = 'n';
				continuarCompra = true;
				perguntandoQuantidade = true;
				perguntandoCodigo = true;
				finalizarPrograma = false;
				codigo = " ";
				linhaDoCodigoInserido = 0;
				updateCarrinho = 0;
				resetarCompra = 0;
				continuarComprandoV = 's';
				
			// 2) Nosso banco de dados | cadastrando os nossos produtos na matriz
				produtos[0][0] = "G1-1";
				produtos[0][1] = "Notebook Acer Gamer   ";
				produtos[0][2] = "4.700,00";
				produtos[0][3] = "10";
				
				produtos[1][0] = "G1-2";
				produtos[1][1] = "Smart TV LG 55´       ";
				produtos[1][2] = "2.799,00";
				produtos[1][3] = "10";
			
				produtos[2][0] = "G1-3";
				produtos[2][1] = "Fone de ouvido Edifier";
				produtos[2][2] = "229,00";
				produtos[2][3] = "10";
			
				produtos[3][0] = "G1-4";
				produtos[3][1] = "Smartphone Motorola   ";
				produtos[3][2] = "1.799,00";
				produtos[3][3] = "10";
			
				produtos[4][0] = "G1-5";
				produtos[4][1] = "Aspirador Robô de Pó  ";
				produtos[4][2] = "382,90";
				produtos[4][3] = "10";
			
				produtos[5][0] = "G1-6";
				produtos[5][1] = "Lâmpada Inteligente   ";
				produtos[5][2] = "100,90";
				produtos[5][3] = "10";
				
				produtos[6][0] = "G1-7";
				produtos[6][1] = "Xbox Séries S         ";
				produtos[6][2] = "2.518,00";
				produtos[6][3] = "10";
				
				produtos[7][0] = "G1-8";
				produtos[7][1] = "Roteador TP-Link      ";
				produtos[7][2] = "279,00";
				produtos[7][3] = "10";
				
				produtos[8][0] = "G1-9";
				produtos[8][1] = "Playstation 4         ";
				produtos[8][2] = "2.799,00";
				produtos[8][3] = "10";
				
				produtos[9][0] = "G1-10";
				produtos[9][1] = "Teclado gamer         ";
				produtos[9][2] = "449,00";
				produtos[9][3] = "10";
			
			// 3) mostrar tela1_inicio
				System.out.print("GENELETRON\n");
				System.out.print("-----------------------------------------------\n")	;
				System.out.print("Gerando economia e qualidade pro seu dia a dia!\n\n");

				System.out.print("DESEJA FAZER COMPRAS (S ou N): ");
				comprando = leia.next().charAt(0);
				
				if (Character.toString(comprando).toLowerCase().equals("s"))
				{					
				     do 
				     {				    	 
					// zerar carrinho
						if(resetarCompra == 10)
						{				
							for (int linha = 0; linha < 10; linha++)
							{
								carrinho[linha] = 0;
							}						
							updateCarrinho = 0;
							perguntandoQuantidade = true;
							perguntandoCodigo = true;
							resetarCompra = 0;
							finalizarPrograma = false;
						}				 	
						// atualiza a tela dps de inserir a quantidade
					 while (updateCarrinho == 0 || updateCarrinho == 1)
					 { 
					     	limpa();
					     	System.out.print("GENELETRON\n");
					     	System.out.print("-----------------------------------------------\n");
					     	System.out.print("Gerando economia e qualidade pro seu dia a dia!\n\n");
					     	System.out.print("COD	  PRODUTOS			  VALOR		 QUANT\n") ;
					     	System.out.print("___________________________________________________________________\n")	;		     	
					     	// 4) mostrar tela2_comprando
							for(int linha = 0; linha<10; linha++)
							{
								for(int coluna = 0; coluna<4; coluna++)
								{
									if (Integer.parseInt(produtos[linha][3], 10) > 0)
									{
										System.out.print(produtos[linha][coluna]+ "\t  ");					
										if (coluna == 3) 
										{
											System.out.print("\n");
										}
									}
									else
									{
										break;		
									}
								}				
							}
						// 5) Mostrando nosso carrinho	
					     	System.out.print("\nCarrinho de compras: \n");
							for (int linha = 0; linha<10; linha++)
							{
								if(carrinho[linha] > 0) 
								{
									System.out.print(produtos[linha][0]+"\t  "+ produtos[linha][1]+"\t  "+produtos[linha][2]+"\t  "+carrinho[linha]);
									System.out.print("\n") ;
								}
							}
					     	System.out.print("\n");
						// 6) Perguntando o código
						if (updateCarrinho == 0)
						{
								quantidadeValidada = false;
								
						do {
									System.out.print("\nDigite o codigo do produto: ");
									codigo = leia.next();
									
							if(codigo.toUpperCase().equals("G1-1") || codigo.toUpperCase().equals("G1-2") || codigo.toUpperCase().equals("G1-3") || codigo.toUpperCase().equals("G1-4") || codigo.toUpperCase().equals("G1-5") || codigo.toUpperCase().equals("G1-6") || codigo.toUpperCase().equals("G1-7") || codigo.toUpperCase().equals("G1-8") || codigo.toUpperCase().equals("G1-9") || codigo.toUpperCase().equals("G1-10"))
							{
							
								for(int linha = 0; linha<10; linha++)
								{
										if(produtos[linha][0].equals(codigo.toUpperCase()))
										{
											// 7.1) Verifica se a quantidade no estoque é zero
											if(Integer.parseInt(produtos[linha][3], 10) == 0)
											{
												System.out.print("Produto Indisponível do Estoque!");
												break;										
											}													
											// 7.2) Mostra os dados do produto, depois de inserir o código
											System.out.print(produtos[linha][0]+"\t "+ produtos[linha][1]+"\t "+produtos[linha][2]+"\t "+produtos [linha][3]);
											linhaDoCodigoInserido = linha;
											perguntandoCodigo=false;
											break; // *
										}//fecha o se										
								 }
							}
							else
							{
								System.out.print("Código Inválido!");										
							}
						//fecha o loop
						System.out.print("\n");
						}while(perguntandoCodigo==true);

						// 8) Perguntando a quantidade
						do{
						System.out.print("\nInforme a quantidade de produtos: ");
						String validarQuantidade;
						validarQuantidade = leia.next();
						boolean validando = true;

						//validar se somente numeros foram digitados
						int len = validarQuantidade.length();

						int c = 0;
						int caracterIncorreto = 0;
						while(c < len && validarQuantidade.charAt(c) != '0' && validarQuantidade.charAt(c) != '1' && validarQuantidade.charAt(c) != '2' && validarQuantidade.charAt(c) != '3' && validarQuantidade.charAt(c) != '4' && validarQuantidade.charAt(c) != '5' && validarQuantidade.charAt(c) != '6' && validarQuantidade.charAt(c) != '7' && validarQuantidade.charAt(c) != '8' && validarQuantidade.charAt(c) != '9' )
						{
							caracterIncorreto += 1;
							c++;
							if(caracterIncorreto > 0)
							{
								System.out.print("Escreva somente números de 1 a 10!\n");
								quantidadeValidada = false;
								break;
							}
						}
						if (caracterIncorreto == 0)
						{
						quantidadeValidada =true;
						}
						if(quantidadeValidada == true)
						{
							quantidade = Integer.parseInt(validarQuantidade, 10);
							//validar caso não seja número
							int quantEstoque = Integer.parseInt(produtos[linhaDoCodigoInserido][3],10);
							if(quantEstoque>=quantidade){
								carrinho[linhaDoCodigoInserido]+=quantidade; // add qtd no carrinho
								perguntandoQuantidade=false;
								//dando baixa no estoque
								quantEstoque-=quantidade;
								produtos[linhaDoCodigoInserido][3]=Integer.toString(quantEstoque);
							}
							else{
							System.out.print("\nQuantidade insuficiente no estoque!");
							}
						}
						
						}while (perguntandoQuantidade==true);
						// f. se updateCarrinho==0
						}

						updateCarrinho += 1;
						}// f. updateCarrinho
				

// 9) Perguntar se ele continua ou não
					System.out.print("Gostaria de continuar comprando (s ou n) ");
					continuarComprandoV = leia.next().charAt(0);

                        if(continuarComprandoV == 'n' || continuarComprandoV == 'N')
                        {
                            if ((continuarComprandoV == 'n' || continuarComprandoV == 'N') && finalizarPrograma == true)
                            {
                                System.out.print("ATÉ BREVE!!");
                                continuarCompra = false;
                                break;
                            }
                            // 10) mostrar carinho de compra, total e imposto, e escolher a forma de pagamento 
                                int formaDePagamento;
                                double    totalDaCompra;
                                double   impostoDaCompra;    
                                double       totalAPagar;
                                double   parcelasIguais;
                                Boolean escolhendoFormaDePagamento;

                                totalDaCompra = 0.0;
                                impostoDaCompra = 0.0;
                                totalAPagar = 0.0;
                                escolhendoFormaDePagamento = true;
                                parcelasIguais = 0.0;
                                formaDePagamento = 0;

                                limpa();
                                // 10.a) calcular total da compra
                                for(int linha = 0; linha < 10; linha++)
                                {
                                    if(carrinho[linha] != 0)
                                    {
                                        double valorDoProduto = Double.parseDouble(produtos[linha][2].replaceAll(",00","").replaceAll(",","."));
                                        //System.out.println(valorDoProduto);
                                        totalDaCompra += valorDoProduto * carrinho[linha];                                 
                                        // calcula a quantidade de cada produto vezes o preço
                                        // .replaceAll(".","").replaceAll(",00","").replaceAll(",",".")
                                    }
                                }
                                // 10.b) calcular importo
                                impostoDaCompra = totalDaCompra * 0.09;

                                do {
                                    //limpa();
                                    System.out.print("GENELETRON\n");
                                    System.out.print("-----------------------------------------------\n");
                                    System.out.print("Gerando economia e qualidade pro seu dia a dia!\n\n");

                                    // 10.c) mostrar os dois
                                    System.out.print("Total da compra: R$ " + totalDaCompra +"\n");
                                    System.out.printf("Valor do Imposto sobre a Compra (9): R$ %.2f \n\n", impostoDaCompra);

                                    // 10.d) exibir as formas e mostrar forma de pagamento
                                    System.out.print("Escolha a forma de pagamento: \n");
                                    System.out.print("OPÇÕES DE PAGAMENTO:\n");
                                    System.out.print("1) Á Vista Com 10% Desconto.\n");
                                    System.out.print("2) No cartão com 10% de acrescimo.\n");
                                    System.out.print("3) Em duas vezes com 15% de taxa.\n");
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
                                        totalAPagar += totalAPagar * 0.10; // calcule o acréscimo
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
                                        System.out.print ("Essa não é uma forma de pagamento válida!");
                                        escolhendoFormaDePagamento = true;
                                    }
                                }while(escolhendoFormaDePagamento == true);

								// 11) mostrar os parabens pela comprar, exibir a nota fiscal, e perguntar se ele quer continuar a compra(

	                            limpa();
	                            System.out.print("GENELETRON\n");
	                            System.out.print("-----------------------------------------------\n");
	                            System.out.print("Gerando economia e qualidade pro seu dia a dia!\n\n");
	                            System.out.print("Nome do cliente: ");
	                            nomeCliente = leia.next();

	                            limpa();
	                            System.out.print("GENELETRON\n");
	                            System.out.print("-----------------------------------------------\n");
	                            System.out.print("Gerando economia e qualidade pro seu dia a dia!\n\n");
	                            int apresentarCarrinho;  

	                            System.out.print("\nParabéns pela sua compra!!!!!!!\n\n");
	                            System.out.print("\tResumo da sua compra!!!\n\n");
	                            System.out.print("\tNome do cliente: "+ nomeCliente+ "\n");
	                            String formasDePagamento[] = {"À VISTA","CARTÃO","PARCELADO EM 2x"};
	                            System.out.print("\tForma de pagamento: " + formasDePagamento[formaDePagamento - 1] + "\n");    
	                            System.out.printf("\tValor total da compra: R$ %.3f" ,totalAPagar , "\n");
	                            if (formaDePagamento == 3){
	                            System.out.print("\tPARCELA #1: R$ " + parcelasIguais + "\n");
	                            System.out.print("\tPARCELA #2: R$ " + parcelasIguais + "\n");

	                            }
	                            System.out.printf("\ns\tImposto total : R$ %.3f " ,impostoDaCompra, "\n");
	                            System.out.print("\n\t__________________________");
	                            System.out.print("\n\tFone: (11)5555-5678     \n");
	                            System.out.print("\tRua: Avenida do Git, 73   \n");
	                            System.out.print("\tCNPJ 90.876.123/6543.90   \n");
	                            System.out.print("\t__________________________");
	                            System.out.print("\t\n\n");                        
	                            resetarCompra += 1;
	                            finalizarPrograma = true;
	                }
	                else if(continuarComprandoV == 's' || continuarComprandoV == 'S')
	                {
	                        updateCarrinho=0;
	                         continuarCompra=true;
	                         resetarCompra += 1;
	                         if(finalizarPrograma == true){
	                             // zerar carrinho
	                            for(int i = 0; i < 10; i++)
	                            {
	                                carrinho[i] = 0;
	                            }

	                            finalizarPrograma = false;
	                         }
	                }
	                else {
	                    System.out.print ("Opção Inválida, por favor digite ou S/N !\n\n");    
	                }
	        // FIM FAÇA ENTÃO MOSTRAR PROGRAMA
	        }while(continuarCompra==true);

	    }
	   else if (Character.toString(comprando).toLowerCase().equals("n")){
	        System.out.print("ATÉ BREVE!!!!\n");
	   }
	   else{
	       System.out.print("Opção inválida!!!");
		}

	}
	
	public static void limpa()
	{
		for (int i = 0; i < 15;i++)
		{
		//	System.out.println();
		}
	}
}

