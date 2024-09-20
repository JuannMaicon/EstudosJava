package heranca;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class testafuncionario {

	public static void main(String[] args) {
		Contador contador = new Contador();
		Engenheiro engenheiro = new Engenheiro();
		Funcionario f1 = new Engenheiro();
		Funcionario f3 = new Engenheiro();
		
		f1.setMatricula("1234");
		f3.setMatricula("1234");
		
		List<Funcionario> funcs = new ArrayList<Funcionario>();
		Contador c1 = new Contador();
		c1.setMatricula("5678");
		Contador c2 = new Contador();
		c2.setMatricula("");
		
		JOptionPane.showMessageDialog(null, f1.equals(f3));

	}

}
