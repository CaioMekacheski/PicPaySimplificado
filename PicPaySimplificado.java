
package picpaysimplificado;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author caio
 */
public class PicPaySimplificado 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Usuários
        Usuario comprador1 = new Comprador("Caio", "Mekacheski", "Comprador", "caio@.com", 
                                                                           "1234", 15000, "12345678900");
        
        Usuario comprador2 = new Comprador("Leticia", "Arias", "Comprador", "leticia@.com", 
                                                                           "4321", 15000, "98765432100");
        
        Usuario lojista1 = new Lojista("Multi Coisas", "Variedades", "Lojista", "multicoisas@.com", 
                                                                           "4321", 150000, "10000000000");
        //Lista de usuários
        List<Usuario> listaUsuarios = new ArrayList<>();       
        listaUsuarios.add(lojista1);
        listaUsuarios.add(comprador1);
        listaUsuarios.add(comprador2);
        
        Menu menu = new Menu();
        Usuario recebedor = comprador1;
        Usuario pagador;
        double valor;
        String login, senha;
        
        try
        {
            menu.exibeTelaLogin();
            login = menu.recebeDado("E-mail: ");
            senha = menu.recebeDado("Senha: ");
            
            pagador = menu.procuraUsuario(listaUsuarios, login, senha);                       
            menu.exibeTelaUsuario(pagador);
            
            valor = Double.parseDouble(menu.recebeDado("Valor da transferência: R$ "));
            
            Transacao transac = new Transacao();
            
            boolean transfOK = transac.transferirValor(pagador, recebedor, valor);
            
            if(transfOK)
            {
                menu.exibeTelaUsuario(pagador);
                transac.receberValor(pagador, recebedor, valor);
            }          
        }
        catch(NullPointerException ex)
        {
            System.out.println("Usuario nulo\n" + ex.getMessage());
        }
    }
    
}
