/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import java.util.ArrayList;

/**
 *
 * @author Josue
 */
public class MotoristaVeiculos {
    protected ArrayList<MementoVeiculo> estados;
    
    public MotoristaVeiculos(){
        this.estados = new ArrayList<MementoVeiculo>();
    }
    
    public void adicionar_memento(MementoVeiculo memento){
        this.estados.add(memento);
    }
    
    public MementoVeiculo getUltimoSalvo(){
        if(this.estados.isEmpty()){
            return null;
        }else{
            MementoVeiculo estado_salvo = this.estados.get(this.estados.size() - 1);
            this.estados.remove(this.estados.size() - 1);
            return estado_salvo;
        }
    }
}
