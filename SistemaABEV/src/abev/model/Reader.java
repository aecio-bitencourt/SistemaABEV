package abev.model;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;

import abev.view.dados.DadosPessoais;

public class Reader {
	
	// Atributos
	private JTextField textrgm;
	private JTextField textnome;
	private JTextField textmun;
	private JTextField textend;
	private JTextField textemail;
	private JFormattedTextField formattedTextFieldnasc;
	private JFormattedTextField formattedTextFieldcpf;
	private JFormattedTextField formattedTextFieldcelular;
	
	// Construtores
	public Reader() {
		
	}

	public Reader(JTextField textrgm, JTextField textnome, JTextField textmun, JTextField textend, JTextField textemail,
			JFormattedTextField formattedTextFieldnasc, JFormattedTextField formattedTextFieldcpf,
			JFormattedTextField formattedTextFieldcelular) {
		super();
		this.textrgm = textrgm;
		this.textnome = textnome;
		this.textmun = textmun;
		this.textend = textend;
		this.textemail = textemail;
		this.formattedTextFieldnasc = formattedTextFieldnasc;
		this.formattedTextFieldcpf = formattedTextFieldcpf;
		this.formattedTextFieldcelular = formattedTextFieldcelular;
	}
	
	// Gerar Getters e Setters
	public JTextField getTextrgm() {
		return textrgm;
	}

	public void setTextrgm(JTextField textrgm) {
		this.textrgm = textrgm;
	}

	public JTextField getTextnome() {
		return textnome;
	}

	public void setTextnome(JTextField textnome) {
		this.textnome = textnome;
	}

	public JTextField getTextmun() {
		return textmun;
	}

	public void setTextmun(JTextField textmun) {
		this.textmun = textmun;
	}

	public JTextField getTextend() {
		return textend;
	}

	public void setTextend(JTextField textend) {
		this.textend = textend;
	}

	public JTextField getTextemail() {
		return textemail;
	}

	public void setTextemail(JTextField textemail) {
		this.textemail = textemail;
	}

	public JFormattedTextField getFormattedTextFieldnasc() {
		return formattedTextFieldnasc;
	}

	public void setFormattedTextFieldnasc(JFormattedTextField formattedTextFieldnasc) {
		this.formattedTextFieldnasc = formattedTextFieldnasc;
	}

	public JFormattedTextField getFormattedTextFieldcpf() {
		return formattedTextFieldcpf;
	}

	public void setFormattedTextFieldcpf(JFormattedTextField formattedTextFieldcpf) {
		this.formattedTextFieldcpf = formattedTextFieldcpf;
	}

	public JFormattedTextField getFormattedTextFieldcelular() {
		return formattedTextFieldcelular;
	}

	public void setFormattedTextFieldcelular(JFormattedTextField formattedTextFieldcelular) {
		this.formattedTextFieldcelular = formattedTextFieldcelular;
	}
	// GERADOR ALEATORIO
	public int getCodLeitor() {
		
		return 0;
	}
	
}
