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
import business.control.autenticacao.factory.APIs.adapter.Sigaa;
import business.control.autenticacao.tipos.AuthCarona;

/**
 *
 * @author Rene e Luana
 */
public class FacAuthCarona implements AutenticacoesFactory{
    AuthCarona carona;
    API api;
    @Override
    public Autenticacao autenticarEmail(String email, String senha) {
        carona = new AuthCarona();
        carona.setStatus(new Email().autenticar(email, senha));
        return carona;
    }

    @Override
    public Autenticacao autenticarSigaa(String login, String senha) {
        carona = new AuthCarona();
        api = new Sigaa();
        
        carona.setStatus(api.autenticar(login, senha));
        return carona;
    }
}
