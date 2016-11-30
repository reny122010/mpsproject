/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.state;

/**
 *
 * @author Rene e Luana
 */
public class MotoristaIndisponivel implements MotoristaState{

    @Override
    public MotoristaState aceitar_carona() {
        return this;
    }

    @Override
    public MotoristaState recusar_carona() {
         return this;
    }

    @Override
    public MotoristaState adicionar_veiculo() {
        return this;
    }

    @Override
    public MotoristaState deletar_veiculo() {
        return this;
    }

    @Override
    public MotoristaState tracar_rota() {
        return new MotoristaDisponivel();
    }

    @Override
    public MotoristaState finalizar_viagem() {
        return this;
    }

    @Override
    public MotoristaState alterar_rota() {
        return this;
    }

    @Override
    public MotoristaState cancelar_rota() {
        return this;
    }
    
}
