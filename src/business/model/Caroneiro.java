/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.state.CaroneiroDisponivel;
import business.state.CaroneiroState;

/**
 *
 * @author Rene e Luana
 */
public final class Caroneiro extends Usuario{
    CaroneiroState stateCaroneiro;
    
    public Caroneiro(){
        stateCaroneiro = new CaroneiroDisponivel();
    }
    
    public CaroneiroState getState(){
        return stateCaroneiro;
    }
    
    public void pedircarona(){
        stateCaroneiro.pedircarona();
    }
    public void negarCarona(){
        stateCaroneiro.negarCarona();
    }
    public void concluirCarona(){
        stateCaroneiro.concluirCarona();
    }
    public void avaliarCarona(int nota){
        System.out.println(nota);
        stateCaroneiro.avaliarCarona();
    }
}
