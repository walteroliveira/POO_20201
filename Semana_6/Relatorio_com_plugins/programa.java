import relatorio.*;

public class programa {
	public static void main(String[] args){

		RelatorioComPlugins relatorio = new RelatorioComPlugins("AutorRelatorio1");
		// relatorio.setTexto("Texto para, teste ABCD.");
		relatorio.setTexto("Neste exercicio, sao usados plugins.");
		PluginTexto pluginsTexto = new TextoData(1, 12, 3000);
		// PluginImpressao pluginsImpressao = new ImpressaoLimiteLargura(10);
		PluginImpressao pluginsImpressao = new ImpressaoLimiteLargura(15);
		//relatorio.aplicarPluginTexto(pluginsTexto);
		relatorio.setPluginImpressao(pluginsImpressao);
		relatorio.imprimirRelatorio();
	
	}
}