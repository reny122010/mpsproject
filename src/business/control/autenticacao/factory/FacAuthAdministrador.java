/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.autenticacao.factory;

import business.control.autenticacao.Autenticacao;
import business.control.autenticacao.AutenticacoesFactory;
import business.control.autenticacao.factory.APIs.Email;
import business.control.autenticacao.factory.APIs.Sigaa;
import business.control.autenticacao.tipos.AuthAdministrador;

/**
 *
 * @author Rene e Luana
 */
public class FacAuthAdministrador implements AutenticacoesFactory{
    AuthAdministrador adm;
    @Override
    public Autenticacao autenticarEmail(String email, String senha) {
        adm = new AuthAdministrador();
        adm.setStatus(new Email().autenticar(email, senha));
        return adm;
    }

    @Override
    public Autenticacao autenticarSigaa(String login, String senha) {
        adm = new AuthAdministrador();
        adm.setStatus(new Sigaa().autenticar(login, senha));
        return adm;
    }
}