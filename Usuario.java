package picpaysimplificado;

/**
 *
 * @author caio
 */
public abstract class Usuario 
{
    private String nome;
    private String sobrenome;
    private String tipo;
    private String email;
    private String senha;
    private double saldo;
    
    public Usuario(String nome, String sobrenome, String tipo, String email, String senha, double saldo)
    {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.tipo = tipo;
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public String getSobreNome()
    {
        return this.sobrenome;
    }
    
    public String getTipo()
    {
        return this.tipo;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public String getSenha()
    {
        return this.senha;
    }
    
    public double getSaldo()
    {
        return this.saldo;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public void setSobreNome(String sobrenome)
    {
        this.sobrenome = sobrenome;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public void setSenha(String senha)
    {
        this.senha = senha;
    }
    
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
}
