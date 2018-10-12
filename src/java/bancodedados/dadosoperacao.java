/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import java.util.Date;



public class dadosoperacao {
      private int operacao;
   private Date datadaoperacao;
   private float valordaoperacao;
   private String cpfdoresponsaveldaoperacao;
   private int conta;


    public int getoperacao() {
        return operacao;
    }

   
    public void setoperacao(int operacao) {
        this.operacao = operacao;
    }

    public Date getdatadaoperacao() {
        return datadaoperacao;
    }

    
    public void setData_op(Date datadaoperacao) {
        this.datadaoperacao = datadaoperacao;
    }

 
    public float getValordaoperacao() {
        return valordaoperacao;
    }

    public void setValordaoperacao(float valordaoperacao) {
        this.valordaoperacao = valordaoperacao;
    }


    public String getCpfdoresponsaveldaoperacao() {
        return cpfdoresponsaveldaoperacao;
    }

   
    public void setCpfdoresponsaveldaoperacao(String cpfdoresponsaveldaoperacao) {
        this.cpfdoresponsaveldaoperacao = cpfdoresponsaveldaoperacao;
    }

    public int getconta() {
        return conta;
    }

 
     
    public void setId_conta(int conta) {
        this.conta = conta;
    }

   
   
}

    

