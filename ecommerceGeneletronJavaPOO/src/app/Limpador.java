package app;

public class Limpador {
	public static void limpa() 
	{
		for (int i = 0; i < 20; i++)
		{
			System.out.println("\n\n\n");
		}
		
		/* TESTAR NA MAQUINA DO ARGEL
		try
		{
		 if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
		}catch(Exception e)
		{
			System.out.println("Erro ao limpar!");
		}
		*/
	}
}
