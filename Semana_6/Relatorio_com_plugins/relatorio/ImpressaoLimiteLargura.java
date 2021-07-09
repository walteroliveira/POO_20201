package relatorio;

public class ImpressaoLimiteLargura implements PluginImpressao{
    private int largura;

    private int contaPalavras(String texto){
        int numPalavras = 1;
        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == ' ')
                numPalavras++;
        }
        return numPalavras;
    }
    private void imprimeSetor(int inicio, int fim, String texto){
        String auxString = "";
        if(inicio < fim){
        for(int i = inicio; i < fim; i++)
            auxString += texto.charAt(i);
        System.out.println(auxString);   
        }
    }

    public ImpressaoLimiteLargura(int largura){
        this.largura = largura;
    }

    public void imprimir(Relatorio r){
        String texto = r.getTexto();
        int totalPalavras = contaPalavras(texto);
        int indexAnterior = 0;
        int indexUltima = 0;
        int i = 0;
        while(i < totalPalavras){
            for(int j = indexAnterior; j <= (this.largura + indexAnterior); j++){
                if(j < texto.length() - 1 && texto.charAt(j) == ' '){             
                    indexUltima = j;
                    i++;
                }
                if(j == texto.length() - 1 && i == totalPalavras - 1 && (j - indexAnterior ) < this.largura){
                    indexUltima = texto.length();
                    i++;
                    break;
                   }
            }

            if(indexUltima < indexAnterior) break;
            imprimeSetor(indexAnterior, indexUltima, texto);
            indexAnterior = indexUltima + 1;

        }
    }
}