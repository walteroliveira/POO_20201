package multimidia;

public class ArquivoAudio extends ArquivoMultimidia implements Cloneable{

    private boolean audioHD;

    public ArquivoAudio(String nomeArquivo, boolean audioHD){
        super(nomeArquivo);
        this.audioHD = audioHD;
    }

    @Override
    public String toString() {
        return "Audio: " + super.getNomeArquivo() + " (HD = " + audioHD + ")";
    }

    @Override
    protected ArquivoAudio clone() throws CloneNotSupportedException{
        ArquivoAudio novoArquivo= new ArquivoAudio(super.getNomeArquivo(), this.audioHD);
        return novoArquivo;
    }
}
