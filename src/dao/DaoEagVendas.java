/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Home
 */
import bean.EagVendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEagVendas extends DaoAbstract {

    @Override
    public void insert(Object object) {
        EagVendas ven = (EagVendas) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_ellen_godoi";
        String user = "ellen_godoi";
        String password = "ellen_godoi";
        
        String sql = "INSERT INTO eag_vendas VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, ven.getEag_id_venda());
            
            if (ven.getEag_data_venda() != null) {
                pst.setDate(2, new java.sql.Date(ven.getEag_data_venda().getTime()));
            } else {
                pst.setNull(2, java.sql.Types.DATE);
            }

            pst.setString(3, ven.getEag_cliente_nome());
            pst.setDouble(4, ven.getEag_valor_total());
            pst.setString(5, ven.getEag_forma_pagamento());
            pst.setString(6, ven.getEag_status_venda());
            pst.setString(7, ven.getEag_observacoes());

            pst.executeUpdate();
            
            pst.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoEagVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoEagVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}