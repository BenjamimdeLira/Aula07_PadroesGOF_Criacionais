package exercicio2_3_Nomes_e_LOG;public class EscrevedorLogArquivo extends EscrevedorLog {	protected FerramentaLog criarFerramentaLog() {		return new FerramentaLogArquivo();	}}