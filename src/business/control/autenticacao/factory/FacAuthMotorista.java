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
import business.control.autenticacao.tipos.AuthMotorista;
/**
 *
 * @author Rene e Luana
 */
public class FacAuthMotorista implements AutenticacoesFactory{
    AuthMotorista motorista;
    @Override
    public Autenticacao autenticarEmail(String email, String senha) {
        motorista = new AuthMotorista();
        motorista.setStatus(new Email().autenticar(email, senha));
        return motorista;
    }

    @Override
    public Autenticacao autenticarSigaa(String login, String senha) {
        motorista = new AuthMotorista();
        motorista.setStatus(new Sigaa().autenticar(login, senha));
        return motorista;
    }
}
