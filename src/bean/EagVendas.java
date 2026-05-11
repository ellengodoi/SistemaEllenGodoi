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

public class EagVendas {

    private int Eag_id_venda;
    private Date Eag_data_venda;
    private String Eag_cliente_nome;
    private double Eag_valor_total;
    private String Eag_forma_pagamento;
    private String Eag_status_venda;
    private String Eag_observacoes;

    public int getEag_id_venda() {
        return Eag_id_venda;
    }

    public void setEag_id_venda(int Eag_id_venda) {
        this.Eag_id_venda = Eag_id_venda;
    }

    public Date getEag_data_venda() {
        return Eag_data_venda;
    }

    public void setEag_data_venda(Date Eag_data_venda) {
        this.Eag_data_venda = Eag_data_venda;
    }

    public String getEag_cliente_nome() {
        return Eag_cliente_nome;
    }

    public void setEag_cliente_nome(String Eag_cliente_nome) {
        this.Eag_cliente_nome = Eag_cliente_nome;
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

    public String getEag_status_venda() {
        return Eag_status_venda;
    }

    public void setEag_status_venda(String Eag_status_venda) {
        this.Eag_status_venda = Eag_status_venda;
    }

    public String getEag_observacoes() {
        return Eag_observacoes;
    }

    public void setEag_observacoes(String Eag_observacoes) {
        this.Eag_observacoes = Eag_observacoes;
    }
}
