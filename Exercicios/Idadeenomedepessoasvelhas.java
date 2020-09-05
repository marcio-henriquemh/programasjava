package atividade6;
import java.util.Scanner;
public class Idadeenomedepessoasvelhas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in); 
		int id=0;
		String nova = null;
		System.out.println("Informe o nome da  1 Pessoa");
		String nome = entrada.next();
		System.out.println("Informe a idade da  1 Pessoa");
		int ida = entrada.nextInt();
		System.out.println("Informe o nome da  2 Pessoa");
		String nome2 = entrada.next();
		System.out.println("Informe a idade da  2 Pessoa");
		int ida2 = entrada.nextInt();
		System.out.println("Informe o nome da 3 Pessoa");
		String nome3 = entrada.next();
		System.out.println("Informe a idade da  3 Pessoa");
		int ida3 = entrada.nextInt();
		
		if(ida<id){
		id=ida;
		nova = nome;
		}
		if(ida2<id){
		id=ida2;
		nova = nome2;
		}
		if(ida3<id){
		id=ida3;
		nova = nome3;

		}
		System.out.println("O nome da pessoa mais nova é");
	System.out.print(nova);
		System.out.println("A idade foi:");
		System.out.print(id);
			
		
		
		
		
		
		
	}

}
