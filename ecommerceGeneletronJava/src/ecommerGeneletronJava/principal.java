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
				System.out.println("GENELETRON\n");
				System.out.println("-----------------------------------------------\n")	;
				System.out.println("Gerando economia e qualidade pro seu dia a dia!\n\n");

				System.out.println("DESEJA FAZER COMPRAS (S ou N): ");
				comprando = leia.next().charAt(0);
				//System.out.println(comprando);
				
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
					while (updateCarrinho == 0 || updateCarrinho == 1);
					     { 
					     	//limpa();
					     	System.out.println("GENELETRON\n");
					     	System.out.println("-----------------------------------------------\n");
					     	System.out.println("Gerando economia e qualidade pro seu dia a dia!\n\n");
					     	System.out.println("COD	  PRODUTOS			  VALOR		 QUANT\n") ;
					     	System.out.println("___________________________________________________________________\n")	;		     	
						// 4) mostrar tela2_comprando
							for(int linha = 0; linha<10; linha++)
							{
								for(int coluna = 0; coluna<4; coluna++)
								{
									if (Integer.parseInt(produtos[linha][3], 10) > 0)
									{
										System.out.println(produtos[linha][coluna]+ "\t  ");					
										if (coluna == 3) {
											System.out.println("\n");
									}
									else {
										break;								
								}				
							}
						// 5) Mostrando nosso carrinho	
					     	System.out.println("\nCarrinho de compras: \n");
							for (linha = 0; linha<10; linha++)
							{
								if(carrinho[linha] > 0) 
								{
									System.out.println(produtos[linha][0]+"\t  "+ produtos[linha][1]+"\t  "+produtos[linha][2]+"\t  "+carrinho[linha]);
									System.out.println("\n") ;
								}
							}
					     	System.out.println("\n");
						// 6) Perguntando o código
							if (updateCarrinho == 0){
								quantidadeValidada = false;
								
									System.out.println("\nDigite o codigo do produto: ");
									codigo = leia.next();
								
									for(linha = 0; linha<10; linha++)
									{
										if(produtos[linha][0] == codigo.toUpperCase())
										{
						// 7.1) Verifica se a quantidade no estoque é zero
							if(Integer.parseInt(produtos[linha][3], 10) == 0)
							{
								System.out.println("Produto Indisponível do Estoque!");
								break;										
							}
											
						// 7.2) Mostra os dados do produto, depois de inserir o código
						System.out.println(produtos[linha][0]+"\t "+ produtos[linha][1]+"\t "+produtos[linha][2]+"\t "+produtos [linha][3]);
						linhaDoCodigoInserido = linha;
						perguntandoCodigo=false;
						}//fecha o se
						else if(codigo.toUpperCase() != "G1-1" && codigo.toUpperCase() != "G1-2" && codigo.toUpperCase() != "G1-3" && codigo.toUpperCase() != "G1-4" && codigo.toUpperCase() != "G1-5" && codigo.toUpperCase() != "G1-6" && codigo.toUpperCase() != "G1-7" && codigo.toUpperCase() != "G1-8" && codigo.toUpperCase() != "G1-9" && codigo.toUpperCase() != "G1-10" )
						{
						System.out.println("Código Inválido!");
						break;
						}
						}//fecha o loop
						System.out.println("\n");
						}while(perguntandoCodigo==true);

						// 8) Perguntando a quantidade
						do{
						System.out.println("\nInforme a quantidade de produtos: ");
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
						System.out.println("Escreva somente números de 1 a 10!\n");
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
						System.out.println("\nQuantidade insuficiente no estoque!");
						}
						}
						}while (perguntandoQuantidade==true);
						}// f. se updateCarrinho==0

						updateCarrinho += 1;
						}// f. updateCarrinho
						}

// 9) Perguntar se ele continua ou não
					System.out.println("Gostaria de continuar comprando (s ou n) ");
					System.out.println(continuarComprandoV);

                        if(continuarComprandoV == 'n' || continuarComprandoV == 'N')
                        {
                            if ((continuarComprandoV == 'n' || continuarComprandoV == 'N') && finalizarPrograma == true)
                            {
                                System.out.println("ATÉ BREVE!!");
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

                                //limpa();
                                // 10.a) calcular total da compra
                                for(int linha = 0; linha < 10; linha++)
                                {
                                    if(carrinho[linha] != 0)
                                    {
                                        //double valorDoProduto = Tipos.cadeia_para_real((Texto.substituir(Texto.substituir(produtos[linha][2],".",""),",00",""),",","."));
                                        //totalDaCompra += valorDoProduto * carrinho[linha];                                 
                                        // calcula a quantidade de cada produto vezes o preço
                                    }
                                }
                                // 10.b) calcular importo
                                impostoDaCompra = totalDaCompra * 0.09;

                                do {
                                    //limpa();
                                    System.out.println("GENELETRON\n");
                                    System.out.println("-----------------------------------------------\n");
                                    System.out.println("Gerando economia e qualidade pro seu dia a dia!\n\n");

                                    // 10.c) mostrar os dois
                                    System.out.println("Total da compra: R$ " + totalDaCompra +"\n");
                                    System.out.printf("Valor do Imposto sobre a Compra (9%): R$ %.2f \n\n", impostoDaCompra);

                                    // 10.d) exibir as formas e mostrar forma de pagamento
                                    System.out.println("Escolha a forma de pagamento: \n");
                                    System.out.println("OPÇÕES DE PAGAMENTO:\n");
                                    System.out.println("1) Á Vista Com 10% Desconto.\n");
                                    System.out.println("2) No cartão com 10% de acrescimo.\n");
                                    System.out.println("3) Em duas vezes com 15% de taxa.\n");
                                    System.out.println(formaDePagamento);

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
                                        System.out.println ("Essa não é uma forma de pagamento válida!");
                                        escolhendoFormaDePagamento = true;
                                    }
                                }while(escolhendoFormaDePagamento == true);

								// 11) mostrar os parabens pela comprar, exibir a nota fiscal, e perguntar se ele quer continuar a compra(

	                            //limpa();
	                            System.out.println("GENELETRON\n");
	                            System.out.println("-----------------------------------------------\n");
	                            System.out.println("Gerando economia e qualidade pro seu dia a dia!\n\n");
	                            System.out.println("Nome do cliente: ");
	                            nomeCliente = leia.next();

	                            //limpa();
	                            System.out.println("GENELETRON\n");
	                            System.out.println("-----------------------------------------------\n");
	                            System.out.println("Gerando economia e qualidade pro seu dia a dia!\n\n");
	                            int apresentarCarrinho;  

	                            System.out.println("\nParabéns pela sua compra!!!!!!!\n\n");
	                            System.out.println("\tResumo da sua compra!!!\n\n");
	                            System.out.println("\tNome do cliente: "+ nomeCliente+ "\n");
	                            String formasDePagamento[] = {"À VISTA","CARTÃO","PARCELADO EM 2x"};
	                            System.out.println("\tForma de pagamento: " + formasDePagamento[formaDePagamento - 1] + "\n");    
	                            System.out.println("\tValor total da compra: R$ " + totalAPagar + "\n");
	                            if (formaDePagamento == 3){
	                            System.out.println("\tPARCELA #1: R$ " + parcelasIguais + "\n");
	                            System.out.println("\tPARCELA #2: R$ " + parcelasIguais + "\n");

	                            }
	                            System.out.printf("\tImposto total (9%): R$ %.2f " ,impostoDaCompra);
	                            System.out.println("\n\t__________________________");
	                            System.out.println("\n\tFone: (11)5555-5678     \n");
	                            System.out.println("\tRua: Avenida do Git, 73   \n");
	                            System.out.println("\tCNPJ 90.876.123/6543.90   \n");
	                            System.out.println("\t__________________________");
	                            System.out.println("\t\n\n");                        
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
	                    System.out.println ("Opção Inválida, por favor digite ou S/N !\n\n");    
	                }
	        // FIM FAÇA ENTÃO MOSTRAR PROGRAMA
	        }while(continuarCompra==true);

	    }
	   else if (Character.toString(comprando).toLowerCase().equals("n")){
	        System.out.println("ATÉ BREVE!!!!\n");
	   }
	   else{
	       System.out.println("Opção inválida!!!");
	   } 
				
				
				
				
	}
}
