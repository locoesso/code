package rajapinnat;

import java.util.Scanner;

public class KertomaOhjelma implements Ohjelma
{
	private Scanner input;
	public KertomaOhjelma ()
	{
		input = new Scanner(System.in);
	}
	public void aja()
	{
		int luku = pyydaArvo();
		int kertoma = 1;
		
		for (int i=1; i<=luku; i++)
		{
			kertoma = kertoma*i;
		}
		
		System.out.println("Luvun " + luku + " kertoma on " + kertoma);
		

	}
	// pyytääkäyttäjältä numeron, jonka kertoma aiotaan laskea
	private int pyydaArvo()
	{
		int numero;
		System.out.print("Anna luku, jonka kertoman haluat tulostettavan: ");
		numero = input.nextInt();
		
		return numero;
	}

}