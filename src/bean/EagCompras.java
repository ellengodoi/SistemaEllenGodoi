/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author Home
 */
import java.util.Date;

public class EagCompras {

    private int Eag_id_compra;
    private Date Eag_data_compra;
    private String Eag_fornecedor_nome;
    private double Eag_valor_total;
    private String Eag_forma_pagamento;
    private String Eag_status_compra;
    private String Eag_observacoes;

    public int getEag_id_compra() {
        return Eag_id_compra;
    }

    public void setEag_id_compra(int Eag_id_compra) {
        this.Eag_id_compra = Eag_id_compra;
    }

    public Date getEag_data_compra() {
        return Eag_data_compra;
    }

    public void setEag_data_compra(Date Eag_data_compra) {
        this.Eag_data_compra = Eag_data_compra;
    }

    public String getEag_fornecedor_nome() {
        return Eag_fornecedor_nome;
    }

    public void setEag_fornecedor_nome(String Eag_fornecedor_nome) {
        this.Eag_fornecedor_nome = Eag_fornecedor_nome;
    }

    public double getEag_valor_total() {
        return Eag_valor_total;
    }

    public void setEag_valor_total(double Eag_valor_total) {
        this.Eag_valor_total = Eag_valor_total;
    }

    public String getEag_forma_pagamento() {
        return Eag_forma_pagamento;
    }

    public void setEag_forma_pagamento(String Eag_forma_pagamento) {
        this.Eag_forma_pagamento = Eag_forma_pagamento;
    }

    public String getEag_status_compra() {
        return Eag_status_compra;
    }

    public void setEag_status_compra(String Eag_status_compra) {
        this.Eag_status_compra = Eag_status_compra;
    }

    public String getEag_observacoes() {
        return Eag_observacoes;
    }

    public void setEag_observacoes(String Eag_observacoes) {
        this.Eag_observacoes = Eag_observacoes;
    }
}
