package ecommerGeneletronJava;

import java.io.IOException;

public class testeComandoLimpar {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		for (int i = 0; i< 10;i++)
		{
			System.out.println("sdkjflsadkjflkdsajfl");
			
		}
		
		clearConsole();
	}
	public final static void clearConsole()
	{
	    try
	    {
	        final String os = System.getProperty("os.name");

	        if (os.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	        //  Handle any exceptions.
	    }
	}

}
