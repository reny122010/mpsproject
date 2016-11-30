/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.autenticacao.factory.APIs;

/**
 *
 * @author Rene e Luana
 */
public class Sigaa {
    public boolean autenticar(String login, String senha){
        if(login.equals(senha)){
            return true;
        }
        return false;
    }
}
