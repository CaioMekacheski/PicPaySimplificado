
package picpaysimplificado;

/**
 *
 * @author caio
 */
public class Lojista extends Usuario
{
    private final String cnpj;
    
    public Lojista(String nome, String sobrenome, String tipo, String email, String senha, double saldo, String cpf)
    {
        super(nome, sobrenome, tipo, email, senha, saldo);
        this.cnpj = cpf;
    }
    
    public String getCpf()
    {
        return this.cnpj;
    }
}
