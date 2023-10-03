
package picpaysimplificado;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author caio
 */
public class Transacao 
{
    private String descricao;
    private Usuario pagador;
    private Usuario recebedor;
    private LocalDate data;
    private LocalTime hora;
    private double valor;
    /**
     * Tranfere um valor de um usuario para outro
     * @param pagador
     * @param recebedor
     * @param valor
     * @return 
     */
    public boolean transferirValor(Usuario pagador, Usuario recebedor, double valor)
    {
        //Checa se o tipo de usuário é 'Comprador', se seu saldo é suficiente e se o recebedor não é nulo
        if("Comprador".equals(pagador.getTipo()) && pagador.getSaldo() >= valor && recebedor != null)
        {
            this.descricao = "Transferencia";
            recebedor.setSaldo(recebedor.getSaldo() + valor);
            System.out.println("Transação realizada com sucesso");
            return true;
        }
        else 
        {
            System.out.println("Transação não autorizada");
            return false;
        }    
    }
}
