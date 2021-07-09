package relatorio;

public class ImpressaoSimples implements PluginImpressao {
    
    public ImpressaoSimples(){

    }   

    public void imprimir(Relatorio r){
        System.out.println(r.getTexto());
    }
}