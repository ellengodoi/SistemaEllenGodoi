/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Home
 */

import bean.EagCompras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEagCompras extends DaoAbstract {

    @Override
    public void insert(Object object) {
        EagCompras comp = (EagCompras) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_ellen_godoi";
        String user = "ellen_godoi";
        String password = "ellen_godoi";
        
        String sql = "INSERT INTO eag_compras VALUES (?, ?, ?, ?, ?, ?, ?)";

       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, comp.getEag_id_compra());
            pst.setDate(2, null);
            pst.setString(3, comp.getEag_fornecedor_nome());
            pst.setDouble(4, comp.getEag_valor_total());
            pst.setString(5, comp.getEag_forma_pagamento());
            pst.setString(6, comp.getEag_status_compra());
            pst.setString(7, comp.getEag_observacoes());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoEagCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoEagCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

