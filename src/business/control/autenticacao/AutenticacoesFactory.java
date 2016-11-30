/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.autenticacao;

/**
 *
 * @author Ruan
 */
public interface AutenticacoesFactory {
    Autenticacao autenticarEmail(String Email, String senha);
    Autenticacao autenticarSigaa(String login, String senha);
}
