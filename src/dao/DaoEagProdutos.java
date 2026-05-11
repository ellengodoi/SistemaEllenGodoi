/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Home
 */
import bean.EagProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEagProdutos extends DaoAbstract {

    @Override
    public void insert(Object object) {
        EagProdutos prod = (EagProdutos) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_ellen_godoi";
        String user = "ellen_godoi";
        String password = "ellen_godoi";
        
        String sql = "INSERT INTO eag_produtos VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, prod.getEag_id_produto());
            pst.setString(2, prod.getEag_nome());
            pst.setString(3, prod.getEag_descricao());
            pst.setDouble(4, prod.getEag_preco());
            pst.setInt(5, prod.getEag_estoque());
            pst.setString(6, prod.getEag_categoria());
            pst.setString(7, prod.getEag_ativo());

            pst.executeUpdate();
            
            pst.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoEagProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoEagProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}