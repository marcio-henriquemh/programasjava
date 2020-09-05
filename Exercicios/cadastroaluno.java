package cadastroalunos;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
public class cadastroaluno {
private static Object java;

public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
// VARIAVEIS USADAS NO PROGRAMA
FileWriter arquivoFisicoGravacao;
PrintWriter arquivoLogicoGravacao;
FileReader arquivoFisicoLeitura;
BufferedReader arquivoLogicoLeitura;
Scanner digite = new Scanner(System.in );
int opcao;
int indice;
int posicao;
String nome = null;
ArrayList<String> alunos = new ArrayList<String>();
ArrayList<Float> matricula = new ArrayList<Float>();
ArrayList<String> email = new ArrayList<String>();
ArrayList<Float> telefone = new ArrayList<Float>();
ArrayList<Float> serie = new ArrayList<Float>();
String linha;
boolean sair = false;
while (sair == false) {
System.out.println();
System.out.println();
alunos.clear();
matricula.clear();
email.clear();
telefone.clear();
serie.clear();

System.out.println("Registro  Alunos");
System.out.println();
System.out.println("Menu:");
System.out.println("1 - Incluir");
System.out.println("2 - Listar");
System.out.println("3 - Consultar");
System.out.println("4 - Alterar");
opcao = -1;
while ((opcao < 1) || (opcao > 6)) {
System.out.print("Opção: ");
opcao = Integer.parseInt(digite.nextLine());
}
switch (opcao) {
// CADASTRANDO  DADOS
case 1:
// ABRINDO O ARQUIVO PARA GRAVAR OS DADOS. 
arquivoFisicoGravacao = new FileWriter("alunos.txt",true);
arquivoLogicoGravacao = new PrintWriter(arquivoFisicoGravacao);
// LENDO OS DADOS DOS ALUNOS
System.out.println("Registro dos Aluno");
System.out.println();
System.out.print("Aluno: ");
nome = digite.nextLine();
System.out.print("matricula: ");
nome = digite.nextLine();
System.out.print("email: ");
nome = digite.nextLine();
System.out.print("telefone: ");
nome = digite.nextLine();
System.out.print("serie: ");
nome = digite.nextLine();
while (!nome.equalsIgnoreCase("fim")) {
alunos.add(nome);
// GRAVANDO OS DADOS NO ARQUIVO
linha = String.format("%-30s%4.1f%4.1f%4.1f\n",nome,alunos,matricula,email,telefone,serie).replace(",",".");
arquivoLogicoGravacao.append(linha);
System.out.println();
System.out.println("======================================================================");
System.out.print("Aluno: ");
// LENDO OS DADOS DO PRÓXIMO ALUNO
nome = digite.nextLine();
}
// FECHANDO O ARQUIVO
arquivoLogicoGravacao.close();
break;
// LISTANDO OS DADOS JÁ CADASTRADOS
case 2:
// ABRINDO O ARQUIVO PARA LEITURA
arquivoFisicoLeitura = new FileReader("alunos.txt");
arquivoLogicoLeitura = new BufferedReader(arquivoFisicoLeitura);
// LENDO OS DADOS EXISTENTES NO ARQUIVO
linha = arquivoLogicoLeitura.readLine();
while (linha != null) {
// SEPARANDO OS DADOS DA LINHA E COLOCANDO NOS RESPECTIVOS ARRAYLIST
alunos.add(linha.substring(0,30));
matricula.addAll(matricula);
email.add(linha.substring(0,30));
telefone.addAll(telefone);
serie.addAll(serie);

// LENDO A PRÓXIMA LINHA DE DADOS
linha = arquivoLogicoLeitura.readLine();
}
// FECHANDO O ARQUIVO DE DADOS
arquivoLogicoLeitura.close();
// LISTANDO OS DADOS NA TELA
System.out.println("Dados");
System.out.println();
System.out.println("=============================================");
System.out.println("Aluno:");
System.out.print(alunos);
System.out.println("Matricula:");
ArrayList<String> Matricula=null;
System.out.print(Matricula);
System.out.println("Email:");
System.out.print(email);
System.out.println("Telefone:");
System.out.print(telefone);
System.out.println("Serie:");
System.out.print(serie);
System.out.println("=============================================");
for (indice = 0;indice < alunos.size(); indice++) {
System.out.printf("%-30s %4s %4.1f %4.1f\n",alunos.get(indice),matricula.get(indice),email.get(indice),telefone.get(indice),
		serie.get(indice));
}
System.out.println("=-=-=-=-=-=-=-=-=-=-=-==-=");
//MOSTRANDO O TOTAL DE ALUNOS CADASTRADOS
System.out.println("Total de alunos: "+alunos.size());
break;
//CONSULTANDO DADOS DOS ALUNOS
case 3:
//ABRINDO O ARQUIVO PARA A LEITURA DOS DADOS
arquivoFisicoLeitura = new FileReader("alunos.txt");
arquivoLogicoLeitura = new BufferedReader(arquivoFisicoLeitura);
//LENDO A PRIMEIRA LINHA DE DADOS
linha = arquivoLogicoLeitura.readLine();
//QUEBRANDO A LINHA DE DADOS E ADICIONANDO OS DADOS NOS RESPECTIVOS ARRAYLIST
while (linha != null) {
	alunos.add(linha.substring(0,30));
	matricula.addAll(matricula);
	email.add(linha.substring(0,30));
	telefone.addAll(telefone);
	serie.addAll(serie);
linha = arquivoLogicoLeitura.readLine();
}
//FECHANDO O ARQUIVO DE DADOS
arquivoLogicoLeitura.close();
//OBTENDO O NOME A SER PESQUISADO NO ARRAYLIST
System.out.println("Busca de dados");
System.out.println();
System.out.print("Aluno (f-fim): ");
nome = digite.nextLine().trim(); // TIRANDO OS ESPAÇOS EXISTENTES ANTES E APÓS O NOME
System.out.println();
System.out.println("====================================");
indice = 0;
posicao = -1;
//PERCORRENDO O ARRAYLIST À PROCURA DO NOME DESEJADO
while (indice < alunos.size()) {
//SE ACHAR O NOME GUARDA A POSIÇÃO ONDE ELE ESTÁ E SAI NO LAÇO
if (nome.trim().equalsIgnoreCase(alunos.get(indice).trim())) {
posicao = indice;
break; // INTERROMPE O LAÇO, SAINDO DO MESMO
}
indice++;
}
//SE ACHOU O NOME E POSIÇÃO ESCREVE OS DADOS NA TELA
if (posicao != -1) {
System.out.println("Nome: "+alunos.get(posicao));
System.out.println("Matricula: "+matricula.get(posicao));
System.out.println("Email: "+email.get(posicao));
System.out.println("Telefone: "+telefone.get(posicao));
System.out.println("Serie: "+serie.get(posicao));
}
//SE NÃO ACHOU OS DADOS INFORMA AO USUÁRIO QUE NÃO LOCALIZOU O MESMO
else {
System.out.println("O aluno não foi localizado!!!");
}
System.out.println("====================================");
break;
//ALTERANDO OS DADOS DOS ALUNOS
case 4:
	
//ABRINDO O ARQUIVO PARA A LEITURA DOS DADOS
arquivoFisicoLeitura = new FileReader("alunos.txt");
arquivoLogicoLeitura = new BufferedReader(arquivoFisicoLeitura);
//LENDO A PRIMEIRA LINHA DE DADOS
linha = arquivoLogicoLeitura.readLine();
//QUEBRANDO A LINHA DE DADOS E ADICIONANDO OS DADOS NOS RESPECTIVOS ARRAYLIST
while (linha != null) {
alunos.add(linha.substring(0,30).trim());
matricula.add(Float.parseFloat(linha.substring(30,34)));
email.addAll(email);
telefone.addAll(telefone);
serie.addAll(serie);
linha = arquivoLogicoLeitura.readLine();
}
//FECHANDO O ARQUIVO DE DADOS
arquivoLogicoLeitura.close();
//OBTENDO O NOME A SER PESQUISADO NO ARRAYLIST
System.out.println("Busca de dados");
System.out.println();
System.out.print("Aluno (f-fim): ");
nome = digite.nextLine().trim(); // TIRANDO OS ESPAÇOS EXISTENTES ANTES E APÓS O NOME
System.out.println();
System.out.println("====================================");
indice = 0;
posicao = -1;
//PERCORRENDO O ARRAYLIST À PROCURA DO NOME DESEJADO
while (indice < alunos.size()) {
//SE ACHAR O NOME GUARDA A POSIÇÃO ONDE ELE ESTÁ E SAI NO LAÇO
if (nome.trim().equalsIgnoreCase(alunos.get(indice).trim())) {
posicao = indice;
break; // INTERROMPE O LAÇO, SAINDO DO MESMO
}
indice++;
}
//SE ACHOU O NOME E POSIÇÃO ESCREVE OS DADOS NA TELA
if (posicao != -1) {
System.out.print("Nome ("+alunos.get(posicao)+"): ");
alunos.set(posicao,digite.nextLine());
System.out.println("matricula ("+matricula.get(posicao)+"): ");
matricula.set(posicao,Float.parseFloat(digite.nextLine()));
System.out.println("telefone ("+telefone.get(posicao)+"): ");
telefone.set(posicao,Float.parseFloat(digite.nextLine()));
System.out.println("email ("+email.get(posicao)+"): ");
serie.set(posicao,Float.parseFloat(digite.nextLine()));
System.out.println("====================================");
//ABRINDO O ARQUIVO PARA GRAVAR OS DADOS. SE O ARQUIVO JÉ EXISTIR MANTÉM OS DADOS JÁ EXISTENTES
arquivoFisicoGravacao = new FileWriter("alunos.txt");
arquivoLogicoGravacao = new PrintWriter(arquivoFisicoGravacao);
for (indice = 0;indice < alunos.size();indice++) {
linha = String.format("%-30s%4.1f%4.1f%4.1f\n",alunos.get(indice),
alunos.get(indice),
telefone.get(indice),
email.get(indice),
serie.get(indice)).replace(",",".");
arquivoLogicoGravacao.append(linha);
}
arquivoLogicoGravacao.close();
}
//SE NÃO ACHOU OS DADOS INFORMA AO USUÁRIO QUE NÃO LOCALIZOU O MESMO
else {
System.out.println("O aluno não foi localizado!!!");
}
System.out.println();
break;
}
}
}}
