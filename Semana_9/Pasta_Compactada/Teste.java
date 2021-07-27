
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        for(int i = 0; i < n; i++){
            String tipo = leitor.next();
            System.out.println(tipo);
            // if(tipo == "Imagem" )
            //     System.out.println(tipo);
            // else if(tipo == "ImagemJPEG")
            //     System.out.println(tipo);
            // else if(tipo == "ImagemPNG")
            //     System.out.println(tipo);
            // else if(tipo == "Texto")
            //     System.out.println(tipo);
            // else if(tipo == "TextoTXT")
            //     System.out.println(tipo);
            // else if(tipo == "TextoDOCX")
            //     System.out.println(tipo);
        }

    }
}