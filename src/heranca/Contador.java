package heranca;

import javax.swing.JOptionPane;

public class Contador extends Funcionario {

	private String numCrm;

	public Contador() {
		JOptionPane.showMessageDialog(null,"Funcionario passou por aqui!");
	}

	public String getNumCrm() {
		return numCrm;
	}

	public void setNumCrm(String numCrm) {
		this.numCrm = numCrm;
	}

}
