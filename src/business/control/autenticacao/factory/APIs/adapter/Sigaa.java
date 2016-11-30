/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.autenticacao.factory.APIs.adapter;

import business.control.autenticacao.factory.APIs.API;

/**
 *
 * @author Ruan
 */
public class Sigaa {
    public boolean autenticarSigaa(String login, String senha){
        return login.equals(senha);
    }
}
