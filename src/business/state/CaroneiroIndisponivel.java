/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.state;

/**
 *
 * @author Ruan
 */
public class CaroneiroIndisponivel implements CaroneiroState{

    @Override
    public CaroneiroState pedircarona() {
        return this;
    }

    @Override
    public CaroneiroState negarCarona() {
        return new CaroneiroDisponivel();
    }

    @Override
    public CaroneiroState concluirCarona() {
        return new CaroneiroDisponivel();
    }

    @Override
    public CaroneiroState avaliarCarona() {
        return new CaroneiroDisponivel();
    }
    
}
