/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Home
 */
import bean.EagClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEagClientes extends DaoAbstract {

    @Override
    public void insert(Object object) {
        EagClientes cli = (EagClientes) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_ellen_godoi";
        String user = "ellen_godoi";
        String password = "ellen_godoi";
        
        String sql = "INSERT INTO eag_clientes VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, cli.getEag_idclientes());
            pst.setString(2, cli.getEag_nome());
            pst.setString(3, cli.getEag_cpf());
            pst.setString(4, cli.getEag_rg());
            pst.setDate(5, null);
            pst.setString(6, cli.getEag_email());
            pst.setString(7, cli.getEag_telefone());
            pst.setString(8, cli.getEag_cep());
            pst.setString(9, cli.getEag_numero());
            pst.setString(10, cli.getEag_endereco());
            pst.setString(11, cli.getEag_bairro());
            pst.setString(12, cli.getEag_cidade());
            pst.setString(13, cli.getEag_estado());
            pst.setString(14, cli.getEag_ativo());
            
            
            pst.executeUpdate();
            
            pst.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoEagClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoEagClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}