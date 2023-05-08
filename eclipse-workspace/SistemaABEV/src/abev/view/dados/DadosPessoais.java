package abev.view.dados;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JComboBox;

public class DadosPessoais extends JPanel {
	private JTextField textrgm;
	private JTextField textnome;
	private JTextField textdatanasc;
	private JTextField textcpf;
	private JTextField textmun;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public DadosPessoais() {
		setLayout(null);
		
		JLabel lblrgm = new JLabel("RGM");
		lblrgm.setFont(new Font("Arial", Font.PLAIN, 16));
		lblrgm.setBounds(10, 41, 45, 13);
		add(lblrgm);
		
		textrgm = new JTextField();
		textrgm.setBounds(65, 36, 96, 24);
		add(textrgm);
		textrgm.setColumns(10);
		
		JLabel lblnome = new JLabel("Nome");
		lblnome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblnome.setBounds(171, 41, 45, 13);
		add(lblnome);
		
		textnome = new JTextField();
		textnome.setBounds(226, 36, 234, 24);
		add(textnome);
		textnome.setColumns(10);
		
		JLabel lbldatanasc = new JLabel("Data de Nascimento");
		lbldatanasc.setFont(new Font("Arial", Font.PLAIN, 16));
		lbldatanasc.setBounds(10, 79, 153, 13);
		add(lbldatanasc);
		
		textdatanasc = new JTextField();
		textdatanasc.setBounds(171, 76, 96, 24);
		add(textdatanasc);
		textdatanasc.setColumns(10);
		
		JLabel lblcpf = new JLabel("CPF");
		lblcpf.setFont(new Font("Arial", Font.PLAIN, 16));
		lblcpf.setBounds(277, 79, 45, 13);
		add(lblcpf);
		
		textcpf = new JTextField();
		textcpf.setBounds(319, 76, 141, 24);
		add(textcpf);
		textcpf.setColumns(10);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblemail.setBounds(10, 123, 45, 13);
		add(lblemail);
		
		JLabel lblend = new JLabel("End.");
		lblend.setFont(new Font("Arial", Font.PLAIN, 16));
		lblend.setBounds(10, 164, 45, 13);
		add(lblend);
		
		JLabel lblmun = new JLabel("Município");
		lblmun.setFont(new Font("Arial", Font.PLAIN, 16));
		lblmun.setBounds(10, 209, 76, 13);
		add(lblmun);
		
		textmun = new JTextField();
		textmun.setBounds(96, 206, 96, 24);
		add(textmun);
		textmun.setColumns(10);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(65, 156, 395, 29);
		add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(65, 117, 395, 29);
		add(textField_1);
		
		JLabel lblNewLabel = new JLabel("UF");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel.setBounds(226, 211, 45, 13);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Celular");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(277, 211, 58, 13);
		add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(347, 206, 113, 24);
		add(textField_2);
		textField_2.setColumns(10);

	}
}
