package abstrataAnimal;

import javax.swing.JOptionPane;

public class TestaAnimal {

	public static void main(String[] args) {
		Cachorro rex = new Cachorro();

		System.out.println(rex);
		JOptionPane.showInputDialog(null, "Escolha o tipo", null, 0, null, TipoAnimal.values(), null);
	}

}
