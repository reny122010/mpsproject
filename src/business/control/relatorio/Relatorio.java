/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.control.relatorio;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Ruan
 */
public abstract class Relatorio {
    DateFormat df;
    Date today;
    String reportDate;
    public final String gerarRelatorio() {
        
        df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        today = Calendar.getInstance().getTime();        
        reportDate = df.format(today);

        return gerarCabecalho()+
        gerarCorpo()+
        gerarRodape();
    }
    abstract String gerarCorpo();
    
    final String gerarCabecalho(){
        return "CI Rider: "+reportDate+"\n";
    }
    
    final String gerarRodape(){
        return "Joao Pessoa  - Brasil\n";
    }
}
