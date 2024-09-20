package banco;

public class ContaCorrente {
	public double saldo = 0.00;
	public String titularConta;
	public double chequeEspecial = 1000;
	public String agencia;
	public String nmrconta;
	public String banco;
	public Cliente titular;
	public static int qtdContas;

	// metodos//
	public ContaCorrente() {
		qtdContas ++;
		this.saldo = 0;
		
	}
	public ContaCorrente(double chequeEspecial) {
		this();
		this.chequeEspecial = chequeEspecial;
	}
	
	public ContaCorrente(boolean chequeEspecial) {
		if (chequeEspecial) {
			this.chequeEspecial = 1000;
		}}
	
	public ContaCorrente(double saldo, double chequeEspecial, String agencia, String nmrConta, String banco) {
		this.saldo = saldo;
		this.chequeEspecial = chequeEspecial;
		this.agencia = agencia;
		this.nmrconta = nmrConta; 
		this.banco = banco;
	}
	public ContaCorrente(double saldo, double chequeEspecial, String agencia, String nrConta, String banco, Cliente cliente) {
		this(saldo, chequeEspecial, agencia,nrConta,banco);
		this.titular = cliente;
	}
	public void Depositar(double valor) {
		this.saldo += valor;

	}

	public String exibirSaldo() {
		String saldoFormat;
		saldoFormat = String.format("R$ %7.2f", this.saldo);
		return saldoFormat;

	}

	private boolean verificarSaldo(double valor) {
		return valor <= (this.saldo + this.chequeEspecial);

	}

	public boolean sacar(double valorSaque) {
		if(verificarSaldo(valorSaque)) {
			this.saldo -= valorSaque;
			return true;
		}
		return false;
		
	
    }
 
public boolean transferir(ContaCorrente destino,double valor) {
	if(verificarSaldo(valor)) {
		this.saldo -= valor;
		destino.saldo += valor;
		return true;
	}
	return false;
}
public void inicializarConta() {
	
}

}