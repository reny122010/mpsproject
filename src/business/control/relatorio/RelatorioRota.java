/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.relatorio;

/**
 *
 * @author Ruan
 */
public class RelatorioRota extends Relatorio{

    @Override
    String gerarCorpo() {
        return "Esse é o seu relatório de Rota do aplicativo, pode ser chamada um método de dados concretos\n";
    }
    
}
