package banco_de_dados;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Cliente;


public class CadastroClienteCRUD {
     public void cadastroCliente(Cliente cliente){
    Connection connetcion = new BancoAcesso().Conexao();

    String sql = "INSERT INTO cliente(id, nome, cpf, endereco, telefone) VALUES (?,?,?,?,?);";
    
    PreparedStatement stmt;
        try {
            stmt = connetcion.prepareStatement(sql);
            stmt.setInt(1, 1);
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getEndereco());
            stmt.setString(5, cliente.getTelefone());
            stmt.execute();
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClienteCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}


