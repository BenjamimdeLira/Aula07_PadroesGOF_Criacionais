package exercicio2_3_Nomes_e_LOG;import java.util.Date;public class FerramentaLogConsole extends FerramentaLog {	public void registrarLog(String mensagem) {		System.out.println(dateFormat.format(new Date(System.currentTimeMillis())) + mensagem);	}}