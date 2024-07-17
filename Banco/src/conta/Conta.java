/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta;

import java.util.List;

import main.Cliente;
import exceptions.ChavePixJaCadastrada;
import exceptions.LimiteDiarioAtingidoException;
import exceptions.SaldoInsuficiente;
import transacoes.Transacao;
import transacoes.TransacaoInternbancaria;
import transacoes.TransacaoPix;


/**
 *
 * @author alunos
 */
public abstract class Conta extends Transacao{
    protected static int NUMERO=0;
    protected static final int AGENCIA=1;
    
    private double saldo;
    private List<String> chavesPix;
    private Cliente cliente;
    private Transacao transacao;
    
    public Conta( Cliente cliente) {
        NUMERO++;
        this.cliente = cliente;
        saldo = 0;
    }
    
    public void fazerTransacaoPix(Conta destino, double valor){
        this.transacao = new TransacaoPix();
        try {
            transacao.realizarTransacao(this, destino, valor);
        } catch (LimiteDiarioAtingidoException ex) {
            ex.getMessage();
            ex.printStackTrace();
        }
    }
    public void fazerTransacaoInterbacaria(Conta destino, double valor){
        this.transacao = new TransacaoInternbancaria();
        try {
            transacao.realizarTransacao(this, destino, valor);
        } catch (LimiteDiarioAtingidoException ex) {
            ex.getMessage();
            ex.printStackTrace();
        }
        
    }
    
    
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor) throws SaldoInsuficiente{
        boolean saldoInsuficiente = this.getSaldo() < valor;
        if(saldoInsuficiente){
            throw new SaldoInsuficiente("seu saldo é insuficiente para realizar a operação");
        }else{
           this.saldo -= valor; 
        }
        
    }
    public String getChavePix(String chave) {
        boolean chaveExiste = this.chavesPix.contains(chave);
        return chaveExiste? chave : "";
    }

    public void addChavesPix(String chavesPix) throws ChavePixJaCadastrada{
        String chaveExistente = getChavePix(chavesPix);
        if(chaveExistente.isEmpty()){
            this.chavesPix.add(chavesPix);
        }else{
            throw new ChavePixJaCadastrada("esta chave já está cadastrada, por favor use outra");
        }       
    }
    
    public Cliente getCliente() {
        return cliente;
    }
    
    public int getNumero() {
        return NUMERO;
    }

    public int getAgencia() {
        return AGENCIA;
    }

    public double getSaldo() {
        return saldo;
    }

    
    
    
    
}
