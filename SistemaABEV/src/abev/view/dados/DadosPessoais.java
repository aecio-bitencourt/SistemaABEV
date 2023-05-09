package abev.view.dados;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import java.awt.Font;
import java.text.ParseException;

import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;

public class DadosPessoais extends JPanel {
	private JTextField textrgm;
	private JTextField textnome;
	private JTextField textmun;
	private JTextField textend;
	private JTextField textemail;
	private JFormattedTextField formattedTextFieldnasc;
	private JFormattedTextField formattedTextFieldcpf;
	private JFormattedTextField formattedTextFieldcelular;
	
	public DadosPessoais() {
		setLayout(null);
		
		JLabel lblrgm = new JLabel("RGM");
		lblrgm.setFont(new Font("Arial", Font.PLAIN, 16));
		lblrgm.setBounds(10, 41, 45, 13);
		add(lblrgm);
		
		textrgm = new JTextField();
		textrgm.setFont(new Font("Arial", Font.PLAIN, 16));
		textrgm.setBounds(65, 38, 96, 24);
		add(textrgm);
		textrgm.setColumns(10);
		
		JLabel lblnome = new JLabel("Nome");
		lblnome.setFont(new Font("Arial", Font.PLAIN, 16));
		lblnome.setBounds(171, 41, 45, 13);
		add(lblnome);
		
		textnome = new JTextField();
		textnome.setFont(new Font("Arial", Font.PLAIN, 16));
		textnome.setBounds(226, 36, 251, 24);
		add(textnome);
		textnome.setColumns(10);
		
		JLabel lbldatanasc = new JLabel("Data de Nascimento");
		lbldatanasc.setFont(new Font("Arial", Font.PLAIN, 16));
		lbldatanasc.setBounds(10, 79, 153, 13);
		add(lbldatanasc);
		
		JLabel lblcpf = new JLabel("CPF");
		lblcpf.setFont(new Font("Arial", Font.PLAIN, 16));
		lblcpf.setBounds(277, 79, 45, 13);
		add(lblcpf);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setFont(new Font("Arial", Font.PLAIN, 16));
		lblemail.setBounds(10, 123, 45, 13);
		add(lblemail);
		
		textemail = new JTextField();
		textemail.setFont(new Font("Arial", Font.PLAIN, 16));
		textemail.setColumns(10);
		textemail.setBounds(65, 117, 412, 29);
		add(textemail);
		
		JLabel lblend = new JLabel("End.");
		lblend.setFont(new Font("Arial", Font.PLAIN, 16));
		lblend.setBounds(10, 164, 45, 13);
		add(lblend);
		
		textend = new JTextField();
		textend.setFont(new Font("Arial", Font.PLAIN, 16));
		textend.setColumns(10);
		textend.setBounds(65, 156, 412, 29);
		add(textend);
		
		JLabel lblmun = new JLabel("Município");
		lblmun.setFont(new Font("Arial", Font.PLAIN, 16));
		lblmun.setBounds(10, 209, 76, 13);
		add(lblmun);
		
		textmun = new JTextField();
		textmun.setFont(new Font("Arial", Font.PLAIN, 16));
		textmun.setBounds(96, 206, 96, 24);
		add(textmun);
		textmun.setColumns(10);
		
		JLabel lbluf = new JLabel("UF");
		lbluf.setFont(new Font("Arial", Font.PLAIN, 16));
		lbluf.setBounds(200, 212, 45, 13);
		add(lbluf);
		
		JLabel lblcelular = new JLabel("Celular");
		lblcelular.setFont(new Font("Arial", Font.PLAIN, 16));
		lblcelular.setBounds(288, 209, 58, 13);
		add(lblcelular);
		
		JFormattedTextField formattedTextFieldnasc = null;
		try {
			formattedTextFieldnasc = new JFormattedTextField(new MaskFormatter("##/##/####"));
			formattedTextFieldnasc.setFont(new Font("Arial", Font.PLAIN, 16));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formattedTextFieldnasc.setBounds(171, 78, 96, 19);
		add(formattedTextFieldnasc);
		
		JFormattedTextField formattedTextFieldcelular = null;
		try {
			formattedTextFieldcelular = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
			formattedTextFieldcelular.setFont(new Font("Arial", Font.PLAIN, 16));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formattedTextFieldcelular.setBounds(345, 208, 132, 19);
		add(formattedTextFieldcelular);
		
		JComboBox comboBoxuf = new JComboBox();
		comboBoxuf.setFont(new Font("Arial", Font.PLAIN, 16));
		comboBoxuf.setBounds(226, 207, 52, 21);
		add(comboBoxuf);
		comboBoxuf.addItem("SP");
		
		JFormattedTextField formattedTextFieldcpf = null;
		try {
			formattedTextFieldcpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
			formattedTextFieldcpf.setFont(new Font("Arial", Font.PLAIN, 16));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		formattedTextFieldcpf.setBounds(315, 73, 158, 24);
		add(formattedTextFieldcpf);

	}
}
