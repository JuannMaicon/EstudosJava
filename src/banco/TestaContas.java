package banco;

public class TestaContas {

	public static void main(String[] args) {
		// criando conta//
		ContaCorrente c1 = new ContaCorrente();
		c1.banco = "Itaú";
		c1.agencia = "3325";
		c1.nmrconta = "123456789";
		c1.titularConta = "Juan";
		c1.Depositar(200);
		System.out.println(c1.exibirSaldo());
		if (c1.sacar(200)) {
			System.out.println("Saque Realizado com Sucesso!");
		} else {
			System.err.println("Não Foi Possivel Realizar Saque!");
		}
		System.out.println(c1.exibirSaldo());

		// Criando outra conta de transferencia//
		ContaCorrente c2 = new ContaCorrente();
		c2.banco = "neon";
		c2.agencia = "3525";
		c2.nmrconta = "523456789";
		c2.titularConta = "Nicolas";
		System.out.println(c1.exibirSaldo());
		System.out.println(c2.exibirSaldo());
		c1.transferir(c2, 100);
		System.out.println(c1.exibirSaldo());

		System.out.println(c2.exibirSaldo());
		
		ContaCorrente c3 =  new ContaCorrente();
		c3.banco = "Itaú";
		c3.agencia = "2558";
		c3.nmrconta = "523456789";
		c3.titularConta = "DaPraia";
	}
}