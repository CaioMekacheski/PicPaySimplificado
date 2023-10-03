
package picpaysimplificado;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author caio
 */
public class Menu 
{
    Scanner entrada = new Scanner(System.in);
    
    /**
     * Exibe a tela de login
     */
    public void exibeTelaLogin()
    {
        System.out.println("\n\t\tLogin\n\n");       
    }
    /**
     * Recebe o dado de um determinado campo
     * @param texto
     * @return 
     */
    public String recebeDado(String texto)
    {
        System.out.print(texto);
        String dado = entrada.nextLine();
        return dado;
    }
    /**
     * Procura por um usuario em uma lista de acordo com o login e a senha
     * @param lista
     * @param email
     * @param senha
     * @return 
     */
    public Usuario procuraUsuario(List<Usuario> lista, String email, String senha)
    {
        Usuario usuarioEncontrado = null;
        //Percorre a lista de usuários
        for(int i = 0; i < lista.size(); i++)
        {   
            String emailAtual = lista.get(i).getEmail();
            String senhaAtual = lista.get(i).getSenha();
            //Checa se a senha eo e-mail são compatíveis
            if(emailAtual.equals(email) && senhaAtual.equals(senha))
            {
                usuarioEncontrado = lista.get(i);
                break;
            }
            else
            {
                System.out.println("Login e/ou senha incorretos");
            }
        }
        return usuarioEncontrado;
    }
    /**
     * Exibe as infomaçẽos do usuário logado
     * @param usuario 
     */
    public void exibeTelaUsuario(Usuario usuario)
    {
        System.out.println("\nUsuário: " + usuario.getNome() + " " + usuario.getSobreNome());
        System.out.println("\nSaldo: R$ " + usuario.getSaldo());   
    }
}
