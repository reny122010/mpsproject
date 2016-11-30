/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.model;

import business.control.relatorio.RelatorioRota;
import business.control.relatorio.RelatorioUso;

/**
 *
 * @author Ruan
 */
public final class Administrador extends Usuario{
    RelatorioRota relatorioRota;
    RelatorioUso relatorioUso;
    
    public String gerarRelatorioUso(){
        relatorioUso = new RelatorioUso();
        return relatorioUso.gerarRelatorio();
    }
    
    public String gerarRelatorioRota(){
        relatorioRota = new RelatorioRota();
        return relatorioRota.gerarRelatorio();
    }
}
