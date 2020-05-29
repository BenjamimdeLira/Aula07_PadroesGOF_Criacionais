package exercicio1_1_IMPRIMIR;


public class TestAbstractPrinterFactory {
	public static void main(String[] args) {

		AbstractPrinterFactory printerFactory = new PrinterFactory();
		TextPrinter printer = printerFactory.getPrinterInstance("ARQUIVO output.txt");
		printer.print();

		System.out.println("----------ou segunda opção-----------");

		printer = printerFactory.getPrinterInstance("IMPRIMIR NA TELA");
		printer.print();
	}
}