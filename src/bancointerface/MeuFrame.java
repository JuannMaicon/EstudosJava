package bancointerface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MeuFrame extends JFrame implements ActionListener {
	JButton meuBotao;

	public MeuFrame() {
		// MeuBotao
		meuBotao = new JButton("Meu botão");
		meuBotao.setBounds(20, 20, 100, 30);
		meuBotao.addActionListener(this);
		MeuActionListener listener = new MeuActionListener();
		meuBotao.addActionListener(listener);
		
		meuBotao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Cliquei No Botão 3ª Vez");

			}
		}); 
		meuBotao.addActionListener(e ->{
			System.out.println("Clique No Botão 4ª Vez");
			
		});

		// Frame
		getContentPane().setLayout(null);
		getContentPane().add(meuBotao);
		setBounds(100, 100, 300, 300);
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

	// Classe interna
	class MeuActionListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Cliquei No Botão De Novo");
		}
	}

}
