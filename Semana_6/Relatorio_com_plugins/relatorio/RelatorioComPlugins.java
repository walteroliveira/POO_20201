package relatorio;

public class RelatorioComPlugins extends Relatorio {

    private PluginImpressao p;
    public RelatorioComPlugins(String autor){
        super(autor);
    }

    public void aplicarPluginTexto(PluginTexto plugin){
        super.setTexto(plugin.aplicar(super.getTexto()));
        
    }
    public void setPluginImpressao(PluginImpressao p){
        this.p = p;
    }

    public void imprimirRelatorio(){
        p.imprimir(this);
    }
}