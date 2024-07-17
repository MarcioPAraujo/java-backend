
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
