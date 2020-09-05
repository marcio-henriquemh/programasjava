package fatorial;
import java.util.Scanner;
public class atividade5lista2 {

	public static void main(String[] args) {
				Scanner entrada= new Scanner(System.in);
				
				int num1 = 0;
				int i;
				int j;
				int fato=0;
				for (i=1;i<num1;i--);{
				System.out.println("Digite o valor desejado");
				num1 = entrada.nextInt();
				fato=1;
			}
					for(j=1;j<num1;j++){
						fato=fato*j;
						System.out.print(fato);
					}
						
				}

			}

