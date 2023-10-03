
package picpaysimplificado;

/**
 *
 * @author caio
 */
public class Comprador extends Usuario
{
    private final String cpf;
    
    public Comprador(String nome, String sobrenome, String tipo, String email, String senha, double saldo, String cpf)
    {
        super(nome, sobrenome, tipo, email, senha, saldo);
        this.cpf = cpf;
    }
    
    public String getCpf()
    {
        return this.cpf;
    }
}
