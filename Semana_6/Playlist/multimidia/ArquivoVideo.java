package multimidia;

public class ArquivoVideo extends ArquivoMultimidia implements Cloneable{

    private int largura;
    private int altura;

    public ArquivoVideo(String nomeArquivo, int largura, int altura){
        super(nomeArquivo);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Video: " + super.getNomeArquivo() + " (" + this.largura + " x " + this.altura + ")";
    }

    @Override
    protected ArquivoVideo clone() throws CloneNotSupportedException{
        ArquivoVideo novoArquivo = new ArquivoVideo(super.getNomeArquivo(), this.largura, this.altura);
        return novoArquivo;
    }
}
