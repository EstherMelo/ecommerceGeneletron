programa
{
	// 0) bibiotecas
	inclua biblioteca Tipos
	inclua biblioteca Texto 
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util
	
	funcao inicio()
	{
	// 1) variáveis
		cadeia nomeCliente
		cadeia produtos[10][4]
		inteiro carrinho[10]
		caracter comprando 
		cadeia codigo
		inteiro quantidade
	     caracter  continuarComprandoV
		logico continuarCompra
	     logico perguntandoQuantidade
	     inteiro linhaDoCodigoInserido
	     inteiro updateCarrinho
		logico perguntandoCodigo
		inteiro resetarCompra
		logico finalizarPrograma
		logico quantidadeValidada = falso
	     
		comprando = 'n'
		continuarCompra = verdadeiro
		perguntandoQuantidade = verdadeiro
		perguntandoCodigo = verdadeiro
		finalizarPrograma = falso
		codigo = ""
		linhaDoCodigoInserido = 0
		updateCarrinho = 0
		resetarCompra = 0
	// 2) Nosso banco de dados | cadastrando os nossos produtos na matriz
		produtos[0][0] = "G1-1"
		produtos[0][1] = "Notebook Acer Gamer   "
		produtos[0][2] = "4.700,00"
		produtos[0][3] = "10"
		
		produtos[1][0] = "G1-2"
		produtos[1][1] = "Smart TV LG 55´       "
		produtos[1][2] = "2.799,00"
		produtos[1][3] = "10"
	
		produtos[2][0] = "G1-3"
		produtos[2][1] = "Fone de ouvido Edifier"
		produtos[2][2] = "229,00"
		produtos[2][3] = "10"
	
		produtos[3][0] = "G1-4"
		produtos[3][1] = "Smartphone Motorola   "
		produtos[3][2] = "1.799,00"
		produtos[3][3] = "10"
	
		produtos[4][0] = "G1-5"
		produtos[4][1] = "Aspirador Robô de Pó  "
		produtos[4][2] = "382,90"
		produtos[4][3] = "10"
	
		produtos[5][0] = "G1-6"
		produtos[5][1] = "Lâmpada Inteligente   "
		produtos[5][2] = "100,90"
		produtos[5][3] = "10"
		
		produtos[6][0] = "G1-7"
		produtos[6][1] = "Xbox Séries S         "
		produtos[6][2] = "2.518,00"
		produtos[6][3] = "10"
		
		produtos[7][0] = "G1-8"
		produtos[7][1] = "Roteador TP-Link      "
		produtos[7][2] = "279,00"
		produtos[7][3] = "10"
		
		produtos[8][0] = "G1-9"
		produtos[8][1] = "Playstation 4         "
		produtos[8][2] = "2.799,00"
		produtos[8][3] = "10"
		
		produtos[9][0] = "G1-10"
		produtos[9][1] = "Teclado gamer         "
		produtos[9][2] = "449,00"
		produtos[9][3] = "10"
	
	// 3) mostrar tela1_inicio
		escreva("GENELETRON\n")
		escreva ("-----------------------------------------------\n")	
		escreva("Gerando economia e qualidade pro seu dia a dia!\n\n")

		escreva();



	
		escreva("DESEJA FAZER COMPRAS (S ou N): ")
		leia (comprando) 
		se (Texto.caixa_baixa(Tipos.caracter_para_cadeia(comprando))=="s")
		{
		     faca 
		     {
			// zerar carrinho
				se (resetarCompra == 10)
				{				
					para (inteiro linha = 0; linha < 10; linha++)
					{
						carrinho[linha] = 0
					}						
					updateCarrinho = 0
					perguntandoQuantidade = verdadeiro
					perguntandoCodigo = verdadeiro
					resetarCompra = 0
					finalizarPrograma = falso
				}				 	
				// atualiza a tela dps de inserir a quantidade
				enquanto (updateCarrinho == 0 ou updateCarrinho == 1)
			     { 
			     	limpa()
			     	escreva("GENELETRON\n")
					escreva("-----------------------------------------------\n")
					escreva("Gerando economia e qualidade pro seu dia a dia!\n\n")
			     	escreva("COD	  PRODUTOS			  VALOR		 QUANT\n") 
			     	escreva("___________________________________________________________________\n")			     	
				// 4) mostrar tela2_comprando
					para(inteiro linha = 0; linha<10; linha++)
					{
						para(inteiro coluna = 0; coluna<4; coluna++)
						{
							se (Tipos.cadeia_para_inteiro(produtos[linha][3], 10) > 0)
							{
								escreva(produtos[linha][coluna]+ "\t  ")						
								se (coluna == 3)
									escreva("\n")
							}
							senao
								pare								
						}				
					}
				// 5) Mostrando nosso carrinho	
					escreva("\nCarrinho de compras: \n")
					para (inteiro linha = 0; linha<10; linha++)
					{
						se(carrinho[linha] > 0) 
						{
							escreva(produtos[linha][0]+"\t  "+ produtos[linha][1]+"\t  "+produtos[linha][2]+"\t  "+carrinho[linha])
							escreva("\n") 
						}
					}
					escreva("\n")
				// 6) Perguntando o código
					se (updateCarrinho == 0)
					{
						quantidadeValidada = falso
<<<<<<< HEAD
						faca{
							escreva("\nDigite o código do produto: ")
=======
						faca
						{
							escreva("\nDigite o codigo do produto: ")
>>>>>>> 27ba768c78b586f174762f701ec24d0c337a41c1
							leia(codigo)
						
							para(inteiro linha = 0; linha<10; linha++)
							{
								se(produtos[linha][0] == Texto.caixa_alta(codigo))
								{
									// 7.1) Verifica se a quantidade no estoque é zero
										se (Tipos.cadeia_para_inteiro(produtos[linha][3], 10) == 0)
										{
											escreva("Produto Indisponível do Estoque!")
											pare											
										}
									
									// 7.2) Mostra os dados do produto, depois de inserir o código
										escreva(produtos[linha][0]+"\t  "+ produtos[linha][1]+"\t  "+produtos[linha][2]+"\t  "+produtos [linha][3])
										linhaDoCodigoInserido = linha
										perguntandoCodigo=falso									
							  	}//fecha o se
							  	senao se(Texto.caixa_alta(codigo) != "G1-1" e Texto.caixa_alta(codigo) != "G1-2" e Texto.caixa_alta(codigo) != "G1-3" e Texto.caixa_alta(codigo) != "G1-4" e Texto.caixa_alta(codigo) != "G1-5" e Texto.caixa_alta(codigo) != "G1-6" e Texto.caixa_alta(codigo) != "G1-7" e Texto.caixa_alta(codigo) != "G1-8" e Texto.caixa_alta(codigo) != "G1-9" e Texto.caixa_alta(codigo) != "G1-10" ) 
							  	{
<<<<<<< HEAD
							  		escreva("Opção inválida")
							  		pare
							  	}
							}//fecha o loop 
							escreva("\n")
							
						}enquanto(perguntandoCodigo==verdadeiro)
	
							//8) Perguntando a quantidade						
							faca
							{ 
								escreva("\nInforme a quantidade de produtos: ")
								cadeia validarQuantidade
								leia(validarQuantidade)
								logico validando = verdadeiro
								//validar se somente numeros foram digitados
								inteiro len = Texto.numero_caracteres(validarQuantidade)								
=======
							  		escreva("Código Inválido!")
							  		pare
							  	}
							}//fecha o loop 
							escreva("\n")							
						}enquanto(perguntandoCodigo==verdadeiro)	
						
				// 8) Perguntando a quantidade						
							faca{ 
								escreva("\nInforme a quantidade de produtos: ")
								cadeia validarQuantidade
								leia(validarQuantidade)
								logico validando = verdadeiro								
								
								//validar se somente numeros foram digitados
								inteiro len = Texto.numero_caracteres(validarQuantidade)
								
>>>>>>> 27ba768c78b586f174762f701ec24d0c337a41c1
								inteiro c = 0
								inteiro caracterIncorreto = 0
									enquanto(c < len e Texto.obter_caracter(validarQuantidade , c) != '0' e  Texto.obter_caracter(validarQuantidade , c) != '1' e  Texto.obter_caracter(validarQuantidade , c) != '2' e  Texto.obter_caracter(validarQuantidade , c) != '3' e  Texto.obter_caracter(validarQuantidade , c) != '4' e  Texto.obter_caracter(validarQuantidade , c) != '5' e  Texto.obter_caracter(validarQuantidade , c) != '6' e  Texto.obter_caracter(validarQuantidade , c) != '7' e  Texto.obter_caracter(validarQuantidade , c) != '8' e  Texto.obter_caracter(validarQuantidade , c) != '9' )
									{
										caracterIncorreto += 1
										c++	
										se (caracterIncorreto > 0)
										{
											escreva("Escreva somente números de 1 a 10!!!\n")
											quantidadeValidada = falso	
											pare								
										}
<<<<<<< HEAD
									}														
=======
									}													
>>>>>>> 27ba768c78b586f174762f701ec24d0c337a41c1
								se (caracterIncorreto == 0)
								{
									quantidadeValidada = verdadeiro
								}
								se (quantidadeValidada == verdadeiro)
								{
									quantidade = Tipos.cadeia_para_inteiro(validarQuantidade, 10)								
									//validar caso não seja número
									inteiro quantEstoque = Tipos.cadeia_para_inteiro(produtos[linhaDoCodigoInserido][3],10)
									se(quantEstoque>=quantidade)
									{
										// adiciona quantidade no carrinho
										carrinho[linhaDoCodigoInserido]+=quantidade 
										perguntandoQuantidade=falso		
										 //dando baixa no estoque 
										 quantEstoque-=quantidade
										 produtos[linhaDoCodigoInserido][3]=Tipos.inteiro_para_cadeia(quantEstoque,10)
									}
									senao
									{
										escreva("\nQuantidade insuficiente no estoque!")
								     }
							     }     
						 	}enquanto (perguntandoQuantidade==verdadeiro)				 	
					}// f. se updateCarrinho==0
					updateCarrinho += 1
			     }// f. updateCarrinho
				// 9) Perguntar se ele continua ou não
				escreva("Gostaria de continuar comprando (s ou n) ")
				leia   (continuarComprandoV)				
				se(continuarComprandoV == 'n' ou continuarComprandoV == 'N')
				{
					se ((continuarComprandoV == 'n' ou continuarComprandoV == 'N') e finalizarPrograma == verdadeiro)
					{
						escreva ("ATÉ BREVE!!")
						continuarCompra = falso
						pare
<<<<<<< HEAD
					}					
=======
					}
>>>>>>> 27ba768c78b586f174762f701ec24d0c337a41c1
					// 10) mostrar carinho de compra, total e imposto, e escolher a forma de pagamento 
						inteiro formaDePagamento
						real    totalDaCompra
						real	   impostoDaCompra	
						real	   totalAPagar
						real    parcelasIguais
						logico  escolhendoFormaDePagamento
					
						totalDaCompra = 0.0
						impostoDaCompra = 0.0
						totalAPagar = 0.0
						escolhendoFormaDePagamento = verdadeiro
						parcelasIguais = 0.0
						
						limpa()
						// 10.a) calcular total da compra
						para (inteiro linha = 0; linha < 10; linha++)
						{
							se (carrinho[linha] != 0)
							{
								// calcula a quantidade de cada produto vezes o preço
								real valorDoProduto = Tipos.cadeia_para_real(Texto.substituir(Texto.substituir(Texto.substituir(produtos[linha][2],".",""),",00",""),",","."))
								totalDaCompra += valorDoProduto * carrinho[linha] 								
							}
						}
						// 10.Calcular imposto
						impostoDaCompra = totalDaCompra * 0.09
						faca
						{
							limpa()
							escreva("GENELETRON\n")
							escreva("-----------------------------------------------\n")
							escreva("Gerando economia e qualidade pro seu dia a dia!\n\n")						
							// 10.Exibir total compra e imposto
							escreva("Total da compra: R$ " + totalDaCompra +"\n")
							escreva("Valor do Imposto sobre a Compra (9%): R$ " + mat.arredondar(impostoDaCompra, 2) + "\n\n")						
							// 10.Exibir as formas de pagamento
							escreva ("Escolha a forma de pagamento: \n")
							escreva ("OPÇÕES DE PAGAMENTO:\n") 
							escreva ("1) Á Vista Com 10% Desconto.\n")
							escreva ("2) No cartão com 10% de acrescimo.\n")
							escreva ("3) Em duas vezes com 15% de taxa.\n")
							leia(formaDePagamento)						
							//10. Calcular o totalAPagar
							totalAPagar = totalDaCompra + impostoDaCompra							
							se (formaDePagamento == 1)
							{
								totalAPagar -= totalAPagar * 0.10 // calculo do desconto
								escolhendoFormaDePagamento = falso							}
							senao se (formaDePagamento == 2)
							{
								totalAPagar += totalAPagar * 0.10 // calcule o acréscimo
								escolhendoFormaDePagamento = falso
							}
							senao se(formaDePagamento == 3)
							{
								totalAPagar += totalAPagar * 0.15 // parcelas
								parcelasIguais = (totalAPagar / 2)
								escolhendoFormaDePagamento = falso
							}
							senao
							{
								escreva ("Essa não é uma forma de pagamento válida!")
								escolhendoFormaDePagamento = verdadeiro
							}
						}enquanto(escolhendoFormaDePagamento == verdadeiro)		
					// 11) Exibir a nota fiscal
							limpa()
							escreva("GENELETRON\n")
							escreva("-----------------------------------------------\n")
							escreva("Gerando economia e qualidade pro seu dia a dia!\n\n")
							escreva("Nome do cliente: ")
							leia(nomeCliente)
							limpa()
							
							escreva("\nGENELETRON\n")
							escreva("-----------------------------------------------\n")
							escreva("Gerando economia e qualidade pro seu dia a dia!\n\n")
							inteiro apresentarCarrinho
							escreva("\nParabéns pela sua compra!!!!!!!\n\n")
							escreva("\tResumo da sua compra!!!\n\n")
							
							escreva("\tNome do cliente: ", nomeCliente, "\n")
							cadeia formasDePagamento[3] = {"À VISTA","CARTÃO","PARCELADO EM 2x"}
							escreva("\tForma de pagamento: " + formasDePagamento[formaDePagamento - 1] + "\n")	
							escreva("\tValor total da compra: R$ " + totalAPagar + "\n")
							se (formaDePagamento == 3)
							{
								escreva("\tPARCELA #1: R$ " + parcelasIguais + "\n")
								escreva("\tPARCELA #2: R$ " + parcelasIguais + "\n")
							}
							escreva("\tImposto total (9%): R$ " + mat.arredondar(impostoDaCompra, 2))							
							escreva("\n\t__________________________")
							escreva("\n\tFone: (11)5555-5678     \n")
							escreva("\tRua: Avenida do Git, 73   \n")
							escreva("\tCNPJ 90.876.123/6543.90   \n")
							escreva("\t__________________________")
							escreva("\t\n\n")		
							resetarCompra += 1
							finalizarPrograma = verdadeiro				
				}
				senao se(continuarComprandoV == 's' ou continuarComprandoV == 'S')
				{
						updateCarrinho=0
					     continuarCompra=verdadeiro
					     resetarCompra += 1
					     se (finalizarPrograma == verdadeiro)
					     {
					     	// zerar carrinho
							para(inteiro i = 0; i < 10; i++)
								carrinho[i] = 0
							finalizarPrograma = falso
					     }
				}
				senao 
				{
					escreva ("Opção Inválida, por favor digite ou S/N !\n\n")	
				}
						     
		}enquanto (continuarCompra==verdadeiro) // fim faça então master do programa
	} // fim senao
	senao se (Texto.caixa_baixa(Tipos.caracter_para_cadeia(comprando))=="n")
	{
		escreva("ATÉ BREVE!!!!\n")
	}
	senao
	{
		escreva("Opção inválida")
	}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
<<<<<<< HEAD
 * @POSICAO-CURSOR = 10287; 
=======
 * @POSICAO-CURSOR = 2342; 
>>>>>>> 27ba768c78b586f174762f701ec24d0c337a41c1
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */