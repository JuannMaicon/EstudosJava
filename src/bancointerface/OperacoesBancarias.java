package bancointerface;

public interface OperacoesBancarias  {

	public void sacar(double valor);
	public void depositar(double valor);
	public double consultarSaldo();
	public void transferir(double saldo,OperacoesBancarias destino );
	
    default void metodoDefalt() {
    	System.out.println();
    }
}
