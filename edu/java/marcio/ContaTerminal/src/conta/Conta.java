package conta;

import java.util.Scanner;

public class Conta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("digite o número de sua conta: ");
		int accountNumber = scan.nextInt();
		
		System.out.println("digite o número de sua agência: ");
		int agencyNumber = scan.nextInt();
		
		System.out.println("digite seu nome: ");
		String clientName = scan.next();
		
		System.out.println("digite seu saldo: ");
		double balance = scan.nextDouble();
		
		System.out.printf("Olá %s obrigado por criar uma conta em nosso banco, sua agência é %d, conta %d e seu saldo %.2f já está disponível para saque",clientName, agencyNumber, accountNumber, balance);
		
	}

}
