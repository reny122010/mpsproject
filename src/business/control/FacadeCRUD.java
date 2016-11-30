/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import business.control.autenticacao.Autenticacao;
import business.control.autenticacao.AutenticacoesFactory;
import business.control.autenticacao.factory.FacAuthAdministrador;
import business.control.autenticacao.factory.FacAuthCarona;
import business.control.autenticacao.factory.FacAuthMotorista;
import business.model.Administrador;
import business.model.Caroneiro;
import business.model.Motorista;
import utils.StringUtils;

/**
 *
 * @author Rene e Luana
 */
public class FacadeCRUD {
    private boolean authStatus;
    ETipoUser authTipo;
    
    private Caroneiro caroneiro;
    private Motorista motorista;
    private Administrador administrador;
    
    private AutenticacoesFactory FacAutenticacoes;
    private Autenticacao autenticacao;
    
    public void autenticarMotoristaSigaa(String login, String senha) throws InvalidAuthException{
        FacAutenticacoes = new FacAuthMotorista();
        autenticacao = FacAutenticacoes.autenticarSigaa(login, senha);
        authStatus = autenticacao.verificarAutenticacao();
        verificarAuth();
        authTipo = ETipoUser.motorista;
        motorista = new Motorista();
    }
    
    public void autenticarCaronaSigaa(String login, String senha) throws InvalidAuthException{
        FacAutenticacoes = new FacAuthCarona();
        autenticacao = FacAutenticacoes.autenticarSigaa(login, senha);
        authStatus = autenticacao.verificarAutenticacao();
        verificarAuth();
        authTipo = ETipoUser.carona;
        caroneiro = new Caroneiro();
    }
    
    public void autenticarMotoristaEmail(String email, String senha) throws InvalidAuthException{
        FacAutenticacoes = new FacAuthMotorista();
        autenticacao = FacAutenticacoes.autenticarEmail(email, senha);
        authStatus = autenticacao.verificarAutenticacao();
        verificarAuth();
        authTipo = ETipoUser.motorista;
        motorista = new Motorista();
    }
    
    public void autenticarCaronaEmail(String email, String senha) throws InvalidAuthException{
        FacAutenticacoes = new FacAuthCarona();
        autenticacao = FacAutenticacoes.autenticarEmail(email, senha);
        authStatus = autenticacao.verificarAutenticacao();
        verificarAuth();
        authTipo = ETipoUser.carona;
        caroneiro = new Caroneiro();
    }
    
    public void autenticarAdministradorEmail(String email, String senha) throws InvalidAuthException{
        FacAutenticacoes = new FacAuthAdministrador();
        autenticacao = FacAutenticacoes.autenticarEmail(email, senha);
        authStatus = autenticacao.verificarAutenticacao();
        verificarAuth();
        administrador = new Administrador();
    }
    
    private void verificarAuth() throws InvalidAuthException{
        if(!authStatus){
            throw new InvalidAuthException(StringUtils.ERRO_AUTH);
        }
    }
    
    private void verificarAuthCarona() throws InvalidAuthException{
        if(authTipo != ETipoUser.carona  || authTipo == null){
            throw new InvalidAuthException(StringUtils.ERRO_PRIVILEGIO_CARONA);
        }
    }
    
    private void verificarAuthMotorista() throws InvalidAuthException{
        if(authTipo != ETipoUser.motorista  || authTipo == null){
            throw new InvalidAuthException(StringUtils.ERRO_PRIVILEGIO_MOTORISTA);
        }
    }
    
    private void verificarAuthAdministrador() throws InvalidAuthException{
        if(authTipo != ETipoUser.administrador  || authTipo == null){
            throw new InvalidAuthException(StringUtils.ERRO_PRIVILEGIO_ADMINISTRADOR);
        }
    }
    //Métodos Carona
    public void pedirCarona() throws InvalidAuthException{
        verificarAuthCarona();
        caroneiro.pedircarona();
    }
    
    public void negarCarona() throws InvalidAuthException{
        verificarAuthCarona();
        caroneiro.negarCarona();
    }
    public void concluirCarona() throws InvalidAuthException{
        verificarAuthCarona();
        caroneiro.concluirCarona();
    }
    public void avaliarCarona(int nota) throws InvalidAuthException{
        verificarAuthCarona();
        caroneiro.avaliarCarona(nota);
    }
    
    //Métodos motorista
    void aceitar_carona() throws InvalidAuthException{
        verificarAuthMotorista();
    }
    
    void recusar_carona() throws InvalidAuthException{
        verificarAuthMotorista();
    }
    
    boolean adicionar_veiculo(String cor, String placa, String modelo) throws InvalidAuthException{
        verificarAuthMotorista();
        return motorista.adicionar_veiculo(cor, placa, modelo);
    }

    boolean deletar_veiculo(String placa) throws InvalidAuthException{
        verificarAuthMotorista();
        return deletar_veiculo(placa);
    }
    
    void tracar_rota() throws InvalidAuthException{
       verificarAuthMotorista();
       motorista.tracar_rota();
    }
    
    void finalizar_viagem() throws InvalidAuthException{
        verificarAuthMotorista();
        motorista.finalizar_viagem();
    }
    
    void alterar_rota() throws InvalidAuthException{
        verificarAuthMotorista();
        motorista.alterar_rota();
    }
    
    void cancelar_rota() throws InvalidAuthException{
        verificarAuthMotorista();
        motorista.cancelar_rota();
    }
    
    //Métodos Administrador
    public String gerarRelatorioUso() throws InvalidAuthException{
        verificarAuthAdministrador();
        return administrador.gerarRelatorioUso();
    }
    
    public String gerarRelatorioRota() throws InvalidAuthException{
        verificarAuthAdministrador();
        return administrador.gerarRelatorioRota();
    }
}
