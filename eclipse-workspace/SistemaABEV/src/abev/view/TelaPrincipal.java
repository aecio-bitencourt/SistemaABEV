package abev.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.BorderLayout;
import abev.view.dados.DadosPessoais;

public class TelaPrincipal extends JFrame{
	public TelaPrincipal() {
		ConfigurarJanela();
	}
	
	public void ConfigurarJanela() {
		setTitle("Sistema ABEV");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800,605);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		
		JTabbedPane PaneDados = new JTabbedPane(JTabbedPane.TOP);
		PaneDados.setToolTipText("");
		PaneDados.setBounds(10, 10, 766, 543);
		getContentPane().add(PaneDados);
		PaneDados.add(new DadosPessoais());
		PaneDados.setTitleAt(0, "Dados Pessoais");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}