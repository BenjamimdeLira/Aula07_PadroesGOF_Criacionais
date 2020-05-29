package exercicio3_1_Incremental_Singleton;

class Incremental {
	private static Incremental singletonInstance;
	private static int count = 0;
	private int numero;

	Incremental() {
		numero = ++count;
	}

	synchronized static Incremental getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Incremental();

		return singletonInstance;
	}

	public String toString() {
		return "Incrementando: " + numero;
	}
}
