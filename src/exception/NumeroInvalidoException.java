package exception;

public class NumeroInvalidoException extends Exception {
private int codigoErro;
	public NumeroInvalidoException(String message, int codigo) {

		super(message);
		this.codigoErro = codigo;
			
		}
		public int getCodigoErro() {
			return codigoErro;
	}
}
