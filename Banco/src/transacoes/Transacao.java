/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transacoes;

import java.util.Date;

import conta.Conta;
import exceptions.LimiteDiarioAtingidoException;


/**
 *
 * @author alunos
 * @
 */
public abstract class Transacao {
    private Date data;
    protected double limiteDiario = 1000;
    public void realizarTransacao(Conta origem, Conta destino, double valor)throws LimiteDiarioAtingidoException{}
    
    
}
