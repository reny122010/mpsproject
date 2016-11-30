/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control;

import utils.StringUtils;

/**
 *
 * @author Ruan
 */
public class Exceptions {
    StringUtils strUltil;
    
    public Exceptions(){
        strUltil = new StringUtils();
    } 
    public void verificarAuth(boolean authStatus) throws InvalidAuthException{
        if(!authStatus){
            throw new InvalidAuthException(strUltil.ERRO_AUTH);
        }
    }
    
    public void verificarAuthCarona(boolean authStatus, ETipoUser authTipo) throws InvalidAuthException{
        if(authTipo != ETipoUser.carona  || authTipo == null){
            throw new InvalidAuthException(strUltil.ERRO_PRIVILEGIO_CARONA);
        }
    }
    
    public void verificarAuthMotorista(boolean authStatus, ETipoUser authTipo) throws InvalidAuthException{
        if(authTipo != ETipoUser.motorista  || authTipo == null){
            throw new InvalidAuthException(strUltil.ERRO_PRIVILEGIO_MOTORISTA);
        }
    }
    
    public void verificarAuthAdministrador(boolean authStatus, ETipoUser authTipo) throws InvalidAuthException{
        if(authTipo != ETipoUser.administrador  || authTipo == null){
            throw new InvalidAuthException(strUltil.ERRO_PRIVILEGIO_ADMINISTRADOR);
        }
    }
}
