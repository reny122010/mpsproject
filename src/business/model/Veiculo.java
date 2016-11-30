/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

/**
 *
 * @author Ruan
 */
public class Veiculo {
    private String cor;
    private String placa;
    private String modelo;
    
    public Veiculo(String cor, String placa, String modelo){
        this.cor = cor;
        this.placa = placa;
        this.modelo = modelo;
    }
    
    String getInfoVeiculo(){
        return "Cor: "+cor+" Placa: "+placa+" Modelo: "+modelo;
    }
    
    String getPlaca(){
        return placa;
    }
}
