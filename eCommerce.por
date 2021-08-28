programa
{
	funcao inicio()
	{
// 1) variáveis
	cadeia produtos[10][4]
	cadeia carrinho [10][4]
	caracter comprando 

	comprando='n'
	
	

// 2) cadastrando os nossos produtos na matriz
	produtos[0][0] = "G1-1"
	produtos[0][1] = "notebook acer gamer"
	produtos[0][2] = "4.700,00"
	produtos[0][3] = "10"
	
	produtos[1][0] = "G1-2"
	produtos[1][1] = "Smart TV LG 55´"
	produtos[1][2] = "2.799,00"
	produtos[1][3] = "10"

	produtos[2][0] = "G1-3"
	produtos[2][1] = "Fone de ouvido Edifier"
	produtos[2][2] = "229,00"
	produtos[2][3] = "10"

	produtos[3][0] = "G1-4"
	produtos[3][1] = "Smartphone Motorola"
	produtos[3][2] = "1.799,00"
	produtos[3][3] = "10"

	produtos[4][0] = "G1-5"
	produtos[4][1] = "Aspirador Robô de Pó"
	produtos[4][2] = "382,90"
	produtos[4][3] = "10"

	produtos[5][0] = "G1-6"
	produtos[5][1] = "Lâmpada Inteligente"
	produtos[5][2] = "60,90"
	produtos[5][3] = "10"
	
	produtos[6][0] = "G1-7"
	produtos[6][1] = "Xbox Series S"
	produtos[6][2] = "2.517,90"
	produtos[6][3] = "10"
	
	produtos[7][0] = "G1-8"
	produtos[7][1] = "roteador TP link"
	produtos[7][2] = "279,00"
	produtos[7][3] = "10"
	
	produtos[8][0] = "G1-9"
	produtos[8][1] = "playstation 4"
	produtos[8][2] = "2.799,00"
	produtos[8][3] = "10"
	
	produtos[9][0] = "G1-10"
	produtos[9][1] = "teclado gamer"
	produtos[9][2] = "449,00"
	produtos[9][3] = "10"

// 3) mostrar tela1_inicio
/*
GENELETRON
Gerando economia e qualidade pro seu dia a dia!
DESEJA FAZER COMPRAS S/N: _
CASO NÃO: ATÉ BREVE!!!!
*/
 
	escreva("GENELETRON\n")
	escreva ("-----------------------------------------------\n")
	escreva("Gerando economia e qualidade pro seu dia a dia!\n\n")
	escreva("DESEJA FAZER COMPRAS S/N: _\n")
	leia (comprando) 
	se (comprando=='n')
	{
	  	escreva("CASO NÃO: ATÉ BREVE!!!!\n")
	}
	senao 
	{
	// 4) mostrar tela2_comprando
	/*
		- mostrar produtos
		- carrinho
		- perguntar código do produto 
		- ..
	*/



	
		
	}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1885; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */