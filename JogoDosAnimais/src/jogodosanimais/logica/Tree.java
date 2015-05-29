/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais.logica;

import jogodosanimais.tela.Tela;

/**
 *
 * @author wlademir
 */
public class Tree extends No {

    private No sim;
    private No nao;

    private String nomeCaracterisitica;

    public Tree(No sim, No nao, String nomeCaracterisitica) {
        this.sim = sim;
        this.nao = nao;
        this.nomeCaracterisitica = nomeCaracterisitica;
    }

    public String getNomeCaracterisitica() {
        return nomeCaracterisitica;
    }

    public void setNomeCaracterisitica(String nomeCaracterisitica) {
        this.nomeCaracterisitica = nomeCaracterisitica;
    }

    public No getSim() {
        return sim;
    }

    public No getNao() {
        return nao;
    }

    @Override
    public No adicionaNaArvora() {
        if (Tela.dialogPerguntaCaracteristica(nomeCaracterisitica) == 0) {
            this.sim = sim.adicionaNaArvora();
        } else {
            this.nao = nao.adicionaNaArvora();
        }
        return this;
    }

}
