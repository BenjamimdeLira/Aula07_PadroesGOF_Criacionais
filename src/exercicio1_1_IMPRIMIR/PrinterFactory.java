package exercicio1_1_IMPRIMIR;

public class PrinterFactory implements AbstractPrinterFactory {

	@Override
	public TextPrinter getPrinterInstance(String printerType) {
		switch (printerType) {
		case "ARQUIVO output.txt": return new Arquivo_output();
		case "IMPRIMIR NA TELA": return new Imprimir_na_tela();
		}

		return null;
	}

}
