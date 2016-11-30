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

/**
 *
 * @author Rene e Luana
 */
public class FacadeCRUD {
    private boolean authStatus;
    ETipoUser authTipo;
    
    Exceptions exp;
    
    private static FacadeCRUD instancia;
    
    private Caroneiro caroneiro;
    private Motorista motorista;
    private Administrador administrador;
    
    private AutenticacoesFactory FacAutenticacoes;
    private Autenticacao autenticacao;
    
   public static FacadeCRUD getFacade(){
        if(instancia == null){
            System.err.println("Instanciou");
            instancia = new FacadeCRUD();
        }
            return instancia;
    }
    public FacadeCRUD(){
        FacAutenticacoes = new FacAuthAdministrador();
        FacAutenticacoes = new FacAuthMotorista();
        FacAutenticacoes = new FacAuthCarona();
        exp = new Exceptions();
    }
    
    public void autenticarMotoristaSigaa(String login, String senha) throws InvalidAuthException{
        autenticacao = FacAutenticacoes.autenticarSigaa(login, senha);
        authStatus = autenticacao.verificarAutenticacao();
        exp.verificarAuth(authStatus);
        authTipo = ETipoUser.motorista;
        motorista = new Motorista();
    }
    
    public void autenticarCaronaSigaa(String login, String senha) throws InvalidAuthException{
        autenticacao = FacAutenticacoes.autenticarSigaa(login, senha);
        authStatus = autenticacao.verificarAutenticacao();
        exp.verificarAuth(authStatus);
        authTipo = ETipoUser.carona;
        caroneiro = new Caroneiro();
    }
    
    public void autenticarMotoristaEmail(String email, String senha) throws InvalidAuthException{
        autenticacao = FacAutenticacoes.autenticarEmail(email, senha);
        authStatus = autenticacao.verificarAutenticacao();
        exp.verificarAuth(authStatus);
        authTipo = ETipoUser.motorista;
        motorista = new Motorista();
    }
    
    public void autenticarCaronaEmail(String email, String senha) throws InvalidAuthException{
        autenticacao = FacAutenticacoes.autenticarEmail(email, senha);
        authStatus = autenticacao.verificarAutenticacao();
        exp.verificarAuth(authStatus);
        authTipo = ETipoUser.carona;
        caroneiro = new Caroneiro();
    }
    
    public void autenticarAdministradorEmail(String email, String senha) throws InvalidAuthException{
        autenticacao = FacAutenticacoes.autenticarEmail(email, senha);
        authStatus = autenticacao.verificarAutenticacao();
        authTipo = ETipoUser.administrador;
        exp.verificarAuth(authStatus);
        administrador = new Administrador();
    }
    //Métodos Carona
    public void pedirCarona() throws InvalidAuthException{
        exp.verificarAuthCarona(authStatus,authTipo);
        caroneiro.pedircarona();
    }
    
    public void negarCarona() throws InvalidAuthException{
        exp.verificarAuthCarona(authStatus,authTipo);
        caroneiro.negarCarona();
    }
    public void concluirCarona() throws InvalidAuthException{
        exp.verificarAuthCarona(authStatus,authTipo);
        caroneiro.concluirCarona();
    }
    public void avaliarCarona(int nota) throws InvalidAuthException{
        exp.verificarAuthCarona(authStatus,authTipo);
        caroneiro.avaliarCarona(nota);
    }
    
    //Métodos motorista
    void aceitar_carona() throws InvalidAuthException{
        exp.verificarAuthMotorista(authStatus,authTipo);
    }
    
    void recusar_carona() throws InvalidAuthException{
        exp.verificarAuthMotorista(authStatus,authTipo);
    }
    
    boolean adicionar_veiculo(String cor, String placa, String modelo) throws InvalidAuthException{
        exp.verificarAuthMotorista(authStatus,authTipo);
        return motorista.adicionar_veiculo(cor, placa, modelo);
    }

    boolean deletar_veiculo(String placa) throws InvalidAuthException{
        exp.verificarAuthMotorista(authStatus,authTipo);
        return deletar_veiculo(placa);
    }
    
    void tracar_rota() throws InvalidAuthException{
       exp.verificarAuthMotorista(authStatus,authTipo);
       motorista.tracar_rota();
    }
    
    void finalizar_viagem() throws InvalidAuthException{
        exp.verificarAuthMotorista(authStatus,authTipo);
        motorista.finalizar_viagem();
    }
    
    void alterar_rota() throws InvalidAuthException{
        exp.verificarAuthMotorista(authStatus,authTipo);
        motorista.alterar_rota();
    }
    
    void cancelar_rota() throws InvalidAuthException{
        exp.verificarAuthMotorista(authStatus,authTipo);
        motorista.cancelar_rota();
    }
    
    //Métodos Administrador
    public String gerarRelatorioUso() throws InvalidAuthException{
        exp.verificarAuthAdministrador(authStatus,authTipo);
        return administrador.gerarRelatorioUso();
    }
    
    public String gerarRelatorioRota() throws InvalidAuthException{
        exp.verificarAuthAdministrador(authStatus,authTipo);
        return administrador.gerarRelatorioRota();
    }
}
