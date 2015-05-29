/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais;

import javax.swing.JOptionPane;
import jogodosanimais.entidade.Regra;
import jogodosanimais.view.Tela;

/**
 *
 * @author wlademir
 */
public class JogoDosAnimais {
    public static void main(String[] args) {
        Regra regra = new Regra();
        while (Tela.dialogApresentacaoInicial()== JOptionPane.OK_OPTION) 
        regra.processo(regra.getRoot());
    }

}

