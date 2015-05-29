/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais.entidade;

/**
 *
 * @author wlademir
 */
public class No {

    No superior;
    No esquerda;
    No direita;

    public No() {
    }

    
    public No(No superior, No esquerda, No direita) {
        this.superior = superior;
        this.esquerda = esquerda;
        this.direita = direita;
    }

    public No getSuperior() {
        return superior;
    }

    public void setSuperior(No superior) {
        this.superior = superior;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }

    public No getDireita() {
        return direita;
    }

    public void setDireita(No direita) {
        this.direita = direita;
    }

}
