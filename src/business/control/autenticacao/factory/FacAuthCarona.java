/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.autenticacao.factory;

import business.control.autenticacao.Autenticacao;
import business.control.autenticacao.AutenticacoesFactory;
import business.control.autenticacao.factory.APIs.API;
import business.control.autenticacao.factory.APIs.Email;
import business.control.autenticacao.factory.APIs.adapter.AdapterSigaa;
import business.control.autenticacao.tipos.AuthCarona;

/**
 *
 * @author Rene e Luana
 */
public class FacAuthCarona implements AutenticacoesFactory{
    AuthCarona carona;
    API api;
    Email email;
    
    @Override
    public Autenticacao autenticarEmail(String email, String senha) {
        carona = new AuthCarona();
        this.email = new Email();
        carona.setStatus(this.email.autenticar(email, senha));
        return carona;
    }

    @Override
    public Autenticacao autenticarSigaa(String login, String senha) {
        carona = new AuthCarona();
        api = new AdapterSigaa();
        
        
        carona.setStatus(api.autenticar(login, senha));
        return carona;
    }
}
