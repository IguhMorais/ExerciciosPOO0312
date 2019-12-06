package Exercicio07.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import connection.Conector;
import model.bean.Usuario;

public class UsuarioDAO {
	
	public String sql;
	
	public void insert(Usuario c) {
		
		Connection con = Conector.getConnection();
		PreparedStatement stn = null;
		try {
			sql = "insert into tbUsuario (nomeUsuario,emailUsuario) " + " values (?,?)";
			stn = con.prepareStatement(sql);
			stn.setString(1, c.getNome());
			stn.setString(2, c.getEmail());
			stn.execute();
			JOptionPane.showMessageDialog(null, "Salvo com Sucesso");
		} catch (SQLException | ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erro ao Salvar");
		}finally {
			Conector.closeConnection();
		}
		
	}

    public void update(Usuario c){
        Connection con = Conector.getConnection();
		PreparedStatement stn = null;
        try{
    
            
            sql("UPDATE tbUsuario SET nomeUsuario='?',emailUsuario='?' WHERE idUsuario='?'");
            stn = con.prepareStatement(sql);
			stn.setString(1, c.getNome());
			stn.setString(2, c.getEmail());
            stn.setString(3,c.getIdUsuario());
			stn.execute();
            JOptionPane.showMessageDialog(null, "Usuario atualizado");
        }catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao atualizar");
        }finally {
			Conector.closeConnection();
		}
    }

    public void delete(Usuario c){
        Connection con = Conector.getConnection();
		PreparedStatement stn = null;
        try{
            sql("DELETE FROM tbUsuario WHERE idUsuario='?'");
            stn = con.prepareStatement(sql);
			stn.setString(1, c.getIdUsuario());
			stn.execute();
            JOptionPane.showMessageDialog(null, "Usuario deletado");
        }catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Erro ao deletar");
        }finally {
			Conector.closeConnection();
		}
    }
}