/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author Home
 */
import bean.EagFornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoEagFornecedores extends DaoAbstract {

    @Override
    public void insert(Object object) {
        EagFornecedores fornc = (EagFornecedores) object;

        String url = "jdbc:mysql://10.0.7.51:33062/db_ellen_godoi";
        String user = "ellen_godoi";
        String password = "ellen_godoi";
        
        String sql = "INSERT INTO eag_fornecedores VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, fornc.getEag_idfornecedores());
            pst.setString(2, fornc.getEag_razao_social());
            pst.setString(3, fornc.getEag_nome_fantasia());
            pst.setString(4, fornc.getEag_cnpj());
            pst.setString(5, fornc.getEag_inscricao_estadual());
            pst.setString(6, fornc.getEag_email());
            pst.setString(7, fornc.getEag_telefone());
            pst.setString(8, fornc.getEag_celular());
            pst.setString(9, fornc.getEag_cep());
            pst.setString(10, fornc.getEag_endereco());
            pst.setString(11, fornc.getEag_numero());
            pst.setString(12, fornc.getEag_bairro());
            pst.setString(13, fornc.getEag_cidade());
            pst.setString(14, fornc.getEag_estado());
            pst.setString(15, fornc.getEag_ativo());

            pst.executeUpdate();
            
            pst.close();
            cnt.close();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoEagFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoEagFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}