/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Home
 */
import bean.EagVendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEagVendedor extends DaoAbstract {

    @Override
    public void insert(Object object) {
        EagVendedor vend = (EagVendedor) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_ellen_godoi";
        String user = "ellen_godoi";
        String password = "ellen_godoi";
        
        String sql = "INSERT INTO eag_vendedor VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, vend.getEag_idvendedor());
            pst.setString(2, vend.getEag_nome());
            
            if (vend.getEag_data_nascimento() != null) {
                pst.setDate(3, new java.sql.Date(vend.getEag_data_nascimento().getTime()));
            } else {
                pst.setNull(3, java.sql.Types.DATE);
            }

            pst.setString(4, vend.getEag_telefone());
            pst.setString(5, vend.getEag_email());
            pst.setString(6, vend.getEag_cpf());
            pst.setString(7, vend.getEag_cidade());
            pst.setString(8, vend.getEag_ativo());

            pst.executeUpdate();
            
            pst.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoEagVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoEagVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
