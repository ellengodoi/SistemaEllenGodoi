/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Home
 */
import bean.EagUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEagUsuarios extends DaoAbstract {

    @Override
    public void insert(Object object) {
        EagUsuarios usu = (EagUsuarios) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_ellen_godoi";
        String user = "ellen_godoi";
        String password = "ellen_godoi";
        
        String sql = "INSERT INTO eag_usuarios VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, usu.getEag_idusuarios());
            pst.setString(2, usu.getEag_nome());
            pst.setString(3, usu.getEag_apelido());
            
            if (usu.getEag_data_nascimento() != null) {
                pst.setDate(4, new java.sql.Date(usu.getEag_data_nascimento().getTime()));
            } else {
                pst.setNull(4, java.sql.Types.DATE);
            }

            pst.setString(5, usu.getEag_cpf());
            pst.setString(6, usu.getEag_nivel());
            pst.setString(7, usu.getEag_senha());
            pst.setString(8, usu.getEag_ativo());

            pst.executeUpdate();
            
            pst.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoEagUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoEagUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
