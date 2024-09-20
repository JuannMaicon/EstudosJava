package banco;

public class TestaConstrutorContas {

	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente(0, 1000, "1234", "8888-8", "Itaú",
				new Cliente("Calos", "119593699982"));
		ContaCorrente conta2 = new ContaCorrente();
		ContaCorrente conta3 = new ContaCorrente();
		ContaCorrente conta4 = new ContaCorrente();
		
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
