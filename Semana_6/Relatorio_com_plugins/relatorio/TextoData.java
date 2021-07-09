package relatorio;

public  class TextoData implements PluginTexto{
    private int dia, mes, ano;

    public TextoData(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public String aplicar(String texto){
        return texto + "(DATA: " + dia + "/" + mes + "/" + ano + ")"; 
    }
}