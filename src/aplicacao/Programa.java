package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Conta;

public class Programa 
{

	public static void main(String[] args) 
	{
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		Conta conta;
		
		System.out.println("Numero da conta: ");
		int numero = ler.nextInt();
		System.out.println("Nome do Cliente: ");
		ler.nextLine();
		String cliente = ler.nextLine();
		System.out.println("Gostaria de realizar um Deposito(s/n)?");
		char op = ler.next().charAt(0);					// conversão do caractere no indice 0 em uma String
		
		if(op == 's') 
		{
			// 1º valor a ser depositado
			System.out.println("Qual o valor de deposito?: ");
			double quantDep = ler.nextDouble();
			conta = new Conta (numero, cliente, quantDep);
			
			System.out.println();
			System.out.println("Dados da Conta:");
			System.out.println(conta);
			
			// 2º valor a ser depositado
			System.out.println();
			System.out.print("Valor de Deposito: ");
			double valorDep = ler.nextDouble();
			conta.deposito(valorDep);
			System.out.println("Conta Atualizada:");
			System.out.println(conta);
			
			// valor a ser retirado
			System.out.println();
			System.out.print("Valor de Retirada: ");
			double valorRet = ler.nextDouble();
			conta.saque(valorRet);
			System.out.println("Conta Atualizada:");
			System.out.println(conta);
			
		}
		else
		{
			conta = new Conta(numero, cliente);
				System.out.println("Transação Encerrada!");
				
		}	
		ler.close();
		
	}

}
