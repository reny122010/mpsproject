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
    protected ArrayList<MementoMotorista> estados;
    
    public MotoristaVeiculos(){
        this.estados = new ArrayList<MementoMotorista>();
    }
    
    public void adicionar_memento(MementoMotorista memento){
        this.estados.add(memento);
    }
    
    public MementoMotorista getUltimoSalvo(){
        if(this.estados.isEmpty()){
            return null;
        }else{
            MementoMotorista estado_salvo = this.estados.get(this.estados.size() - 1);
            this.estados.remove(this.estados.size() - 1);
            return estado_salvo;
        }
    }
}
