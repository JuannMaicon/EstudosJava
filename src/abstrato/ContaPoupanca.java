package abstrato;

public class ContaPoupanca extends ContaBancaria {

	public void sacar(double valor) {
		if (this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
		}
	}
}
