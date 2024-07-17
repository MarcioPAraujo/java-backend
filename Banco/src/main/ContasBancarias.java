/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;
import exceptions.SaldoInsuficiente;

/**
 *
 * @author alunos
 */
public class ContasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Banco banco = new Banco();
        
        Cliente cliente  = new Cliente("john", "1945-08-29", "1234567901", "john@email.com", "11122233345");
        Cliente cliente2  = new Cliente("marylin", "1965-02-09", "00099966633", "marylin@email.com", "0909092312");
        Cliente cliente3  = new Cliente("jack", "1949-01-24", "09812345675", "jack@email.com", "111000045");
        
        banco.addCliente(cliente);
        banco.addCliente(cliente2);
        banco.addCliente(cliente3);
        
        Conta contaPoupanca = new ContaPoupanca(cliente);
        Conta contaCorrente = new ContaCorrente(cliente2);
        
        contaPoupanca.depositar(1000);
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
        
        contaPoupanca.fazerTransacaoPix(contaCorrente, 500);
        
        System.out.println(contaCorrente.getSaldo());
        System.out.println(contaPoupanca.getSaldo());
        
        
        
        try {
			contaPoupanca.sacar(110);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			String ms = e.getMessage();
			System.out.println(ms);
		}
        
        
    }
    
}
