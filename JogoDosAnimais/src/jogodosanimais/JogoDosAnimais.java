/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais;

import javax.swing.JOptionPane;
import jogodosanimais.logica.Animal;
import jogodosanimais.logica.Tree;
import jogodosanimais.tela.Tela;

/**
 *
 * @author wlademir
 */
public class JogoDosAnimais {

    public static void main(String[] args) {
        Tree root = new Tree(new Animal("Tubarão"), new Animal("Macaco"), "vive na agua");
        while (Tela.dialogApresentacaoInicial() == JOptionPane.OK_OPTION) {
            root.adicionaNaArvora();
        }
    }

}
