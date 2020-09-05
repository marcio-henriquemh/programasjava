package flagdesaidawhile;
import java.util.Scanner;
public class atividade3lista2while {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int contador=0;
		int soma=0;
		System.out.println("Digite um valor:");
		int valor1= entrada.nextInt();
		while(contador>=4) {
		contador++;
		if(valor1<0) {
			soma=valor1+valor1;
			System.out.println(" A soma dos valores foi");
			System.out.print(soma);
			
		}
	
	
	
	}
	}
}
