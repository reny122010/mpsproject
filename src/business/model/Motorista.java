/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.state.MotoristaDisponivel;
import business.state.MotoristaState;
import java.util.ArrayList;

/**
 *
 * @author Ruan
 */
public class Motorista extends Usuario{
    MotoristaState stateMotorista;
    ArrayList<Veiculo> listVeiculos; 
    
    public Motorista(){
        stateMotorista = new MotoristaDisponivel();
        listVeiculos = new ArrayList();
    }
    
    MotoristaState getState(){
        return stateMotorista;
    }
    
    public void aceitar_carona(){
        stateMotorista.aceitar_carona();
    }
    
    public void recusar_carona(){
        stateMotorista.aceitar_carona();
    }
    public boolean adicionar_veiculo(String cor, String placa, String modelo){
        Veiculo carro = new Veiculo(cor, placa, modelo);
        listVeiculos.add(carro);
        stateMotorista.adicionar_veiculo();
        return true;
    }
    
    public boolean deletar_veiculo(String placa){
        for(int i = 0; i < listVeiculos.size(); i++)
        {
            Veiculo v = listVeiculos.get(i);
            if(v.getPlaca().equals(placa))
            {
                listVeiculos.remove(v);
                stateMotorista.deletar_veiculo();
                return true;
            }
        }
        return false;
    }
    
    public void tracar_rota(){
        stateMotorista.tracar_rota();
    }
    public void finalizar_viagem(){
        stateMotorista.finalizar_viagem();
    }
    public void alterar_rota(){
        stateMotorista.alterar_rota();
    }
    public void cancelar_rota(){
        stateMotorista.cancelar_rota();
    }
    
}
