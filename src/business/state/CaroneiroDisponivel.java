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
public class CaroneiroDisponivel implements CaroneiroState{

    @Override
    public CaroneiroState pedircarona() {
        return new CaroneiroIndisponivel();
    }

    @Override
    public CaroneiroState negarCarona() {
        return this;
    }

    @Override
    public CaroneiroState concluirCarona() {
        return this;
    }

    @Override
    public CaroneiroState avaliarCarona() {
        return this;
    }
    
}
