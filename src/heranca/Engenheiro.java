package heranca;

import javax.swing.JOptionPane;

public class Engenheiro extends Funcionario {
	private String numcrc;

	public Engenheiro() {
		JOptionPane.showMessageDialog(null, "O engenheiro passou por aqui!");
	}

	public String getNumcrc() {
		return numcrc;
	}

	public void setNumcrc(String numcrc) {
		this.numcrc = numcrc;
	}

}
