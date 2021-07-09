package multimidia;

public class ArquivoAudio extends ArquivoMultimidia {

    private boolean audioHD;

    public ArquivoAudio(String nomeArquivo, boolean audioHD){
        super(nomeArquivo);
        this.audioHD = audioHD;
    }

    public String toString() {
        return "Audio: " + super.getNomeArquivo() + " (HD = " + audioHD + ")";
    }


}
