import java.util.Scanner;

public class case{
	
	public static void main(String[] args)
	{
		
		Scanner entrada = new Scanner(System.in);
		double preco,total;
		int nparcelas;
				
				
		System.out.println("Preco da compra R$: ");
		preco = entrada.nextDouble();
				
				
		System.out.println("Ira dividir em quantas parcelas(1-8): ");
		nparcelas = entrada.nextInt();
		
		
		switch(nparcelas)
		{
			case 0:
				total = 0;
				break;
				
			case 1:
				total = preco*0.8
				break;
				
			case 2:
				total = preco
				break;
				
			case 3:
			case 4
			case 5:
				total = preco*1.1
				break;
				
			case 6:
			case 7:
				total = preco*1.15
				break;
			default:
				total = preco*1.2
				break
				;
				
		}
			System.out.pritnf("Ira pagar: R$ %.2f",total);
				
		
		
		
		
	}
}