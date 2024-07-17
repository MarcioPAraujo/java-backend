/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package transacoes;
import conta.Conta;
import exceptions.LimiteDiarioAtingidoException;
import exceptions.SaldoInsuficiente;


/**
 *
 * @author alunos
 */
public class TransacaoPix extends Transacao{  
    public TransacaoPix(){
        super.limiteDiario = 4000;
    }
    @Override
    public void realizarTransacao(Conta origem, Conta destino, double valor)throws LimiteDiarioAtingidoException{
        boolean limiteDiarioAtingido = limiteDiario < valor;
        if (limiteDiarioAtingido){
            throw new LimiteDiarioAtingidoException("você já atingiu o seu limite diario de transfrerência via pix");
        }
        try {
            origem.sacar(valor);
            destino.depositar(valor);
            limiteDiario -= valor;
        } catch (SaldoInsuficiente ex) {
            ex.printStackTrace();
            ex.getMessage();
        }
    }

    
}
