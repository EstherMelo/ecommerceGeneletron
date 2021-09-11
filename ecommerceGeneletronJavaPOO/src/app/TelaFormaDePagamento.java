package app;

public class TelaFormaDePagamento {
	public TelaFormaDePagamento() {
		do {
            //limpa();
            System.out.print("               GENELETRON\n");
            System.out.print("-----------------------------------------------\n");
            System.out.print("Gerando economia e qualidade pro seu dia a dia!\n\n");

            // 10.c) mostrar os dois

            System.out.printf("Total da compra: R$  %.3f \n",totalDaCompra);
            System.out.printf("Valor do Imposto sobre a Compra (9): R$ %.3f", impostoDaCompra,"\n\n");


            //System.out.print("\nTotal da compra: R$ " + totalDaCompra +"\n");
            //System.out.printf("Valor do Imposto sobre a Compra (9): R$ %.2f \n\n", impostoDaCompra);
            System.out.print("\n-----------------------------------------------\n");

            // 10.d) exibir as formas e mostrar forma de pagamento
            
            System.out.print("   Escolha a forma de pagamento: \n");
            System.out.print("-----------------------------------------------\n");
            System.out.print("      OPÇÕES DE PAGAMENTO:\n");
            System.out.print(" __________________________________\n");
            System.out.print("|1) Á Vista Com 10% Desconto       |\n");
            System.out.print("|__________________________________|\n");
            System.out.print("|2) No cartão com 10% de acrescimo |\n");
            System.out.print("|__________________________________|\n");
            System.out.print("|3) Em duas vezes com 15% de taxa  |\n");
            System.out.print("|__________________________________|\n");
            System.out.print("|Opção: ");
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
	}
}
