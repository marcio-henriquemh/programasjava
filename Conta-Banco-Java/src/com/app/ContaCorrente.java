package com.app;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ContaCorrente extends Cliente {
    
    protected int agencia;
    protected int numConta;
    protected float saldo;
    protected String salvar;
    // Construtorpadrão
    public ContaCorrente() {
    }

    // Construtor
    public ContaCorrente(String nome, String cpf, int agencia, int numConta, float saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
        this.salvar=salvar;
    }
    
    // Get & Set
    public String getCliente() {
        return nome;
    }

    public void setCliente(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }
   
public String Salvar() throws IOException {
    	
    	
    	try {
        	
         	
    FileWriter arquivoFisicoGravacao = new FileWriter("Banco.txt");
    PrintWriter arquivoLogicoGravacao = new PrintWriter(arquivoFisicoGravacao);
    
    arquivoLogicoGravacao.println("nome"+this.nome);
    arquivoLogicoGravacao.println("Cpf"+this.cpf);
    arquivoLogicoGravacao.println("Agencia"+this.agencia);
    arquivoLogicoGravacao.println("Saldo"+this.saldo);
    arquivoLogicoGravacao.println("Numero da conta"+this.numConta);
    arquivoLogicoGravacao.flush();
    arquivoLogicoGravacao.close();
    arquivoFisicoGravacao.close();
    
    	}catch(IOException ex) {
    		Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE,null,ex);
    		
    	}
    	return null;
    }
   
    // Métodos 
    public void sacar(int saque) {
        // Verifica se o valor é menor ou igual a 0, caso seja não efeta saque.
        if(saque <= 0) {
            System.out.println("Não pode ser efetuados saques com valor igual ou inferior a 0(zero).\n");
            return;
        }
        
        if (saque <= saldo) {
            saldo = saldo - saque;
            System.out.println("Saque de R$" + saque + " efetuado com sucesso!" + "\nSaldo atual: R$" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente" + "\nTente novamente");
        }
    }

    public void depositar(float deposito) {
        // Verifica se o valor é menor ou igual a 0, caso seja não efeta deposito.
        if(deposito <= 0) {
            System.out.println("Não pode ser efetuados depósitos com valor igual ou inferior a 0(zero).\n");
            return;
        }
        
        saldo = saldo + deposito;
        System.out.println("Deposito de R$" + deposito + " efetuado com sucesso!" + "\nSaldo atual: R$" + getSaldo());
    }

    public void trasferencia(float valor, String favorecido) {
        // Verifica se o valor é menor ou igual a 0, caso seja não efeta tranferência.
        if(valor <= 0) {
            System.out.println("Não pode ser efetuadas tranferências com valor igual ou inferior a 0(zero).\n");
            return;
        }
        
        if (valor <= getSaldo()) {
            saldo = saldo - valor;
            System.out.println("Tranferência realizada com sucesso!" + "\nNome do favorecido: " + favorecido + "\nSaldo atual: R$" + getSaldo());
        } else {
            System.out.println("Saldo insuficiente." + "\nTente novamente");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo é de: R$" + this.saldo);
    }
}
