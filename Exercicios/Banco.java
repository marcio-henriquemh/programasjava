package atividade11;
import java.util.Scanner;
public class Banco {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
System.out.println("\\-=-=-=-=-=-=-=-=-Banco só Desconto=-=-=-=-=-=//");
	System.out.println("Informe o Saldo do Cliente");
	float saldo = entrada.nextFloat();
	float valor;
	
		if(saldo<=200);{
			
			System.out.print("Nenhum Desconto");
		}
		if(saldo>201 || saldo<=400);{
			System.out.println("20% no valor do saldo");
			valor= (float) (saldo*0.20);
			System.out.println("o Novo Saldo é:");
			System.out.print(valor);
		}
		if(saldo>401 || saldo<=600);{
			System.out.println("30% no valor do saldo");
			valor=(float)(saldo*0.30);
			System.out.println("o Novo Saldo é:");
			System.out.print(valor);
		}
		if(saldo>601);{
			System.out.println("40% no valor do saldo");
			valor=(float)(saldo*0.40);
			System.out.println("o Novo Saldo é:");
			System.out.print(valor);
		}
		
		
	}

}
