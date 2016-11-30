/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.autenticacao.tipos;

import business.control.autenticacao.Autenticacao;

/**
 *
 * @author Rene e Luana
 */
public class AuthMotorista implements Autenticacao{
    private boolean status;
    public final String tipo = "motorista";
    
    public AuthMotorista(){
        status = false;
    }
    @Override
    public boolean verificarAutenticacao() {
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
}
