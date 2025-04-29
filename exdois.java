import java.util.Scanner;

public class exdois {
    public static void main(String[] args) {
    	
        Scanner entrada = new Scanner(System.in);
		double largura,altura,area,Latas;
       
        System.out.print("Digite a largura da parede (em metros): ");
        largura = scanner.nextDouble();
        System.out.print("Digite a altura da parede (em metros): ");
        altura = entrada.nextDouble();

        area = largura * altura;
        System.out.println("Área da parede: " + area + " m²");

       
        Latas = area / 2;

        System.out.println("latas de tinta necessários: " + Latas);

    }
}
