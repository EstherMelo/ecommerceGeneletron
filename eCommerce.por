programa
{
	inclua biblioteca Tipos
	inclua biblioteca Texto 
	
	funcao inicio()
	{
	// 1) variáveis
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
	     
		comprando='n'
		continuarCompra=verdadeiro
		perguntandoQuantidade=verdadeiro
		perguntandoCodigo=verdadeiro
		codigo = ""
		linhaDoCodigoInserido = 0
		updateCarrinho = 0
		//carrinho[0]=0
		
		
	
	// 2) cadastrando os nossos produtos na matriz
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
		produtos[6][2] = "2.517,90"
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
	/*
	GENELETRON
	Gerando economia e qualidade pro seu dia a dia!
	DESEJA FAZER COMPRAS S/N: _
	CASO NÃO: ATÉ BREVE!!!!
	*/  
	 	//colocar codigo invalido
	 	
		escreva("GENELETRON\n")
		escreva ("-----------------------------------------------\n")
		escreva("Gerando economia e qualidade pro seu dia a dia!\n\n")
		escreva("DESEJA FAZER COMPRAS S/N: _\n")
		leia (comprando) 
		se (Texto.caixa_baixa(Tipos.caracter_para_cadeia(comprando))=="s")
		{
		  	
		
		     faca {
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
					escreva(produtos[linha][coluna]+ "\t  ")
					
					}
					escreva("\n")
				}
			// 5) Mostrando nosso carrinho	
				escreva("\nCarrinho de compras: \n\n")
				para (inteiro linha = 0; linha<10; linha++)
				{
					se(carrinho[linha]!=0) {
						escreva(produtos[linha][0]+"\t"+ produtos[linha][1]+"\t"+produtos[linha][2]+"\t"+carrinho[linha])
						escreva("\n") 
					}
				}
			
			// 6) Perguntando o código
				se (updateCarrinho == 0)
				{
					faca{
						
					
						escreva("\nDigite o codigo do produto: ")
						leia(codigo)
					
						para(inteiro linha = 0; linha<10; linha++)
						{
							se(produtos[linha][0]== Texto.caixa_alta(codigo))
							{
								// 7) Mostra os dados do produto, depois de inserir o código
								escreva(produtos[linha][0]+"\t"+ produtos[linha][1]+"\t"+produtos[linha][2]+"\t"+produtos [linha][3])
								linhaDoCodigoInserido = linha
								perguntandoCodigo=falso
								
						  	}//fecha o se
						  	senao se(Texto.caixa_alta(codigo) != "G1-1" e Texto.caixa_alta(codigo) != "G1-2" e Texto.caixa_alta(codigo) != "G1-3" e Texto.caixa_alta(codigo) != "G1-4" e Texto.caixa_alta(codigo) != "G1-5" e Texto.caixa_alta(codigo) != "G1-6" e Texto.caixa_alta(codigo) != "G1-7" e Texto.caixa_alta(codigo) != "G1-8" e Texto.caixa_alta(codigo) != "G1-9" e Texto.caixa_alta(codigo) != "G1-10" ) 
						  	{
						  		escreva("Opçao inválida")
						  		pare
						  	}
						}//fecha o loop 
					}enquanto(perguntandoCodigo==verdadeiro)

			// 8) Perguntando a quantidade						
						faca{ 
							escreva("\nDigite a quantidade necessária: ")
							leia(quantidade)
							//validar caso não seja número
							inteiro quantEstoque = Tipos.cadeia_para_inteiro(produtos[linhaDoCodigoInserido][3],10)
							se(quantEstoque>=quantidade){
								carrinho[linhaDoCodigoInserido]+=quantidade // add qtd no carrinho
								perguntandoQuantidade=falso

								 //dando baixa no estoque 
								 quantEstoque-=quantidade
								 produtos[linhaDoCodigoInserido][3]=Tipos.inteiro_para_cadeia(quantEstoque,10)
							}
							senao{
								escreva("Quantidade insuficiente no estoque!")
						     }     
					 	}enquanto (perguntandoQuantidade==verdadeiro)					 	
				
				}// f. se updateCarrinho==0

				updateCarrinho += 1
		     }// f. updateCarrinho
			
			// 9) Perguntar se ele continua ou não
			escreva("Gostaria de continuar comprando (s ou n) ")
			leia   (continuarComprandoV)
			se(continuarComprandoV=='n'ou continuarComprandoV=='N'){
/////////////////////////////////////////////////////////////////////////
// 10) mostrar carinho de compra, total e imposto, e escolher a forma de pagamento 
	inteiro formaDePagamento
	real    totalDaCompra
	real	   impostoDaCompra	

	totalDaCompra = 0.0
	impostoDaCompra = 0.0
	limpa()
	// 10.a) calcular total da compra
	para (inteiro linha = 0; linha < 10; linha++)
	{
		se (carrinho[linha] != 0)
		{
			totalDaCompra += Tipos.cadeia_para_real(produtos[linha][3]) * carrinho[linha] 
			// calcula a quantidade de cada produto vezes o preço
		}
	}
	// 10.b) calcular importo
	impostoDaCompra = (totalDaCompra * 0.09) / 100

	// 10.c) mostrar os dois
	escreva("Total da compra: " + totalDaCompra +"\n")
	escreva("Imposto em cima da compra: " + impostoDaCompra+"\n\n")

	// 10.d) exibir as formas e mostrar forma de pagamento
	escreva ("Escolha a forma de pagamento: \n")
	escreva ("OPÇÕES DE PAGAMENTO:\n") 
	escreva ("1) Á VISTA COM 10% DESCONTO\n")
	escreva ("2) NO CARTÃO COM ACRÉSCIMO DE 10%\n")
	escreva ("3) É EM DUAS VEZES COM 15% TOTAL DE ACRESCIMO - TEM QUE MOSTRA O VALOR DE CADA PARCELA\n")
	leia(formaDePagamento)

	// 10.e) de acordo com a forma de pagamento, calcular o totalAPagar
	// ...

	inteiro teste
	leia(teste)



// 11) mostrar os parabens pela comprar, exibir a nota fiscal, e perguntar se ele quer continuar a compra( 





//////////////////////////////////////////////////////////////////////////
				     //continuarCompra=falso
			}
			senao {
					updateCarrinho=0
				    continuarCompra=verdadeiro	
			}
				     
		}enquanto (continuarCompra==verdadeiro)
	} // fim senao
	senao se (Texto.caixa_baixa(Tipos.caracter_para_cadeia(comprando))=="n")
	{
		escreva("ATÉ BREVE!!!!\n")
	}
	senao
	{
		escreva("Opçao inválida")
	}
				
	/*1)salvar esse produto na matriz carrinho
	2)dar baixa na quantidade matriz produto (conversão de cadeia para real)
	3)mostrar a tabela unitaria do produto */
	//mostrar msg continua compra
	
	}//fim ininio
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 6632; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */