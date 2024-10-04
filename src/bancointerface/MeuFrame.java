package bancointerface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame implements ActionListener {
	JButton meuBotao;
	
	public MeuFrame() {
		//MeuBotao
		meuBotao = new JButton("Meu botão");
		meuBotao.setBounds(20,20,100,30);
		meuBotao.addActionListener(this);
		meuBotao.addActionListener(new MeuActionListener());

		//Frame
		getContentPane().setLayout(null);
		getContentPane().add(meuBotao);
		setBounds(100,100,300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Cliquei No Botão");
	}
	
	public static void main(String[] args) {
		new MeuFrame();
	}
	//Classe interna
	class MeuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Cliquei No Botão De Novo");
		}
	}
	

}
