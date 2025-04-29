public class kdk{
	
	public static double PesoMasculino(double altura)
	{
		return 72.1*altura-58;
	}	
	
	public static double PesoFeminino(double altura)
	{
		return 62.1*altura-44;
	}
	
	
	public static void main(String[] args)
	{
		Scanner entrada = new Scanner(System.in);
		double altura,peso;
		char sexo;
		
		System.out.println("Seu sexo (M/F): ");
		sexo =  entrada.next().charAt(0);
		System.out.println("Sua altura em metros (ex: 1,59): ");
		altura = entrada.nextDouble();
		
		if (sexo == 'M' || sexo == 'm'){
			peso=PesoMasculino(altura);
		}
		else if (sexo == 'F' || sexo == 'f'){
			peso=PesoFeminino(altura);	
		}
		else{
			peso=-1;
		}
		if (peso >= 0){

		System.out.printf("Peso ideal: %.1f kilos\n",peso);
		}
		else{
			System.out.println("OU DIGITA O SEXO CERTO MN QUE PORRA EH ESSA ");
		}
		
	}
}