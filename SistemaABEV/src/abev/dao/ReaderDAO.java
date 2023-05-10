package abev.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import abev.model.Reader;
import abev.util.ConnectionFactory;
import abev.view.dados.DadosPessoais;

public class ReaderDAO {
	
	private Reader reader;
	private Connection conn;
	private PreparedStatement ps;
	public ReaderDAO() throws Exception {
		
		try {
			conn = ConnectionFactory.getConnection();
		}catch (Exception e) {
			throw new Exception("Erro ao salvar "+ e.getMessage());
		}
	}
	
	public void salvar(Reader reader) throws Exception {
		try {
			String sql="INSERT INTO alunos(textrgm,textnome,textmun,textend,textemail,formattedTextFieldnasc,formattedTextFieldcpf,formattedTextFieldcelular)"
					+ "values (?,?,?,?,?,?,?,?)";
					ps = conn.prepareStatement(sql);
					ps.setInt(1,reader.getCodLeitor());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
