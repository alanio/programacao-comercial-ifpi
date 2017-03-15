/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import javax.swing.JFrame;

/**
 *
 * @author arch
 */
public class Main {
 
    public static void main(String[] args) {
       new BancoDados();
 
       JFrame principal = new Principal();
       principal.setVisible(true);
    }
}
