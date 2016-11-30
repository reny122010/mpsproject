/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.memento;

import business.model.Veiculo;

/**
 *
 * @author Josue
 */
public class MementoVeiculo {
    protected Veiculo veiculo;
    
    public MementoVeiculo(Veiculo veiculo){
        this.veiculo = veiculo;
    }
    
    public Veiculo getMementoMotorista(){
        return this.veiculo;
    }
}
