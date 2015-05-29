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
public class Caracteristica extends No {

    private String nomeCaracterisitica;

    public Caracteristica(String nomeCaracterisitica) {
        this.nomeCaracterisitica = nomeCaracterisitica;
    }

    public String getNomeCaracterisitica() {
        return nomeCaracterisitica;
    }

    public void setNomeCaracterisitica(String nomeCaracterisitica) {
        this.nomeCaracterisitica = nomeCaracterisitica;
    }

}
