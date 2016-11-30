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
public interface MotoristaState {
    MotoristaState aceitar_carona();
    MotoristaState recusar_carona();
    MotoristaState adicionar_veiculo();
    MotoristaState deletar_veiculo();
    MotoristaState tracar_rota();
    MotoristaState finalizar_viagem();
    MotoristaState alterar_rota();
    MotoristaState cancelar_rota();
}
