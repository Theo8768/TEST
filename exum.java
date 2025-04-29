import java.util.Scanner;

public class exum{
	
	public static void main(String[] args){
		
        int anos,meses,dias,idade;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite a idade em anos: ");
        anos = entrada.nextInt();

        System.out.println("Digite os meses: ");
        meses = entrada.nextInt();

        System.out.println("Digite os dias: ");
        dias = entrada.nextInt();

       
        idade = (anos * 365) + (meses * 30) + dias;

      
        System.out.println("A idade total em dias é: " + idade);
 
	}	
}
