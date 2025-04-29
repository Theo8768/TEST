import java.util.Scanner;

public class extres {
	
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		double a,b,c,delta;
		
		System.out.print("Digite o valor de A: ");
        double a = entrada.nextDouble();
        
        System.out.print("Digite o valor de B: ");
        double b = entrada.nextDouble();
        
        System.out.print("Digite o valor de C: ");
        double c = entrada.nextDouble();
	
		if (a == 0) {
            System.out.println("Não é uma equação do segundo grau.");
        } 
        
        	else {
          	    delta = b * b - 4 * a * c;
          		System.out.printf("\nValor de delta: " + delta);
          }

         
          if (a > 0) {
              System.out.println("A parabola é voltada para cima.");
            }
             
           	else {
            System.out.println("A parabola é voltada para baixo.");
            }
            
            
          if (delta > 0) {
                System.out.println("A equação possui 2 raizes reais diferentes.");
               }
               
             else if (delta == 0) {
             System.out.println("A equação possui 2 raizes reais iguais.");
               }
               
             else {
             System.out.println("A equação não possui raizes reais.");
            }
        }
	
	
	}
	
	
	
	
}
