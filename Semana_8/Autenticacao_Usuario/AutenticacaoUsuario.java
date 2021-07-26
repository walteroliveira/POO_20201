import java.util.Scanner;
import acesso.Usuario;
import acesso.Impressao;
import acesso.UsuarioBloqueado;
import acesso.SenhaInvalida;

public class AutenticacaoUsuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();
        Usuario listaUsuarios[] = new Usuario[n];

        for(int i = 0; i < n; i++){
            String login = leitor.next();
            String senha = leitor.next();
            listaUsuarios[i] = new Usuario(login, senha);
        }

        int k = leitor.nextInt();

        for(int j = 0; j < k; j++){
            String login = leitor.next();
            String senha = leitor.next();
            for(int i = 0; i < n; i++){
                if(login.equals(listaUsuarios[i].getLogin())){
                    try{
                        listaUsuarios[i].autenticar(senha);
                        Impressao.imprimirUsuarioAutenticado(listaUsuarios[i].getLogin());
                    } catch(SenhaInvalida e){
                        Impressao.imprimirSenhaInvalida(e.getLogin());
                    } catch(UsuarioBloqueado e){
                        Impressao.imprimirUsuarioBloqueado(e.getLogin());
                    }

                }
            }
        }
        leitor.close();

    }
}