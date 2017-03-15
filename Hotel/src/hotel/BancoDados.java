/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.util.ArrayList;
import java.util.List;
import model.Aposento;

/**
 *
 * @author arch
 */
public class BancoDados {
 
    private static List<Aposento> aposentos = new ArrayList<Aposento>();
  
    /*
     * Aposentos
     */
 
    public static List<Aposento> getAposentos() {
        return aposentos;
    }
 
    public static void addAposento(Aposento aposento){
        aposentos.add(aposento);
    }
 
    public static void atualizaAposento(int linhaSelecionada, Aposento aposento){
        aposentos.set(linhaSelecionada, aposento);
    }
 
    public static void removeAposento(Aposento aposento){
        aposentos.remove(aposento);
    }
}