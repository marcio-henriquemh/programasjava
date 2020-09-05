package atividade13;
import java.util.Scanner;

public class medidatriangulo {

	public static void main(String[] args) {
		Scanner entrada = new  Scanner (System.in);
		float  lado1;
		float lado2;
		float lado3;
		String mensagem="Nao";
		System.out.println(" A medida do Lado 1:");
		lado1= entrada.nextInt();
		System.out.println("A media do lado 2:");
		lado2 = entrada.nextInt();
		System.out.println("A media do lado 3 :");
		lado3 = entrada.nextInt();
		
					if(((lado1+lado2)>lado3) &&
						((lado2+lado3)>lado2) &&
						((lado1+lado3)>lado2));
						mensagem =  "";
						
						if((lado1 == lado2) && (lado2==lado3));{
							
							mensagem= "Equi";
			
						}
						else if ((lado1==lado2) || (lado2 == lado3) || (lado3==lado1)){
							mensagem="Isós";
						}
						System.out.println();
						System.out.printf("A medida é valida:",mensagem);
	

	}

}
