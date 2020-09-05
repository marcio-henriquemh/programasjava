package atividade10;
import java.util.Scanner;
public class Custocarronovo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float cust= (float) 0.28;
		float impo = (float) 0.45;
		System.out.println("O valor de custo da fabrica foi:");
		int fab = entrada.nextInt();

        impo = (fab * impo) / 100;
 
        cust = (float) (((fab + impo) * cust) / 100.000);
 
        float cli = (cust + impo);
        System.out.println("O custo de fabrica de um carro");
		System.out.println(cust);
		System.out.println("O valor que consumidor pagou foi:");
		cli= ((int) (cust+impo));
		System.out.println(cli);
	}

}
