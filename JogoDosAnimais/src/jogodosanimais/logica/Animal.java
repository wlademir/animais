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
public class Animal extends No {

    private String nomeAnimal;

    public Animal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    @Override
    public No adicionaNaArvora() {
        if (Tela.dialogPerguntaSeAnimal(this.nomeAnimal) == 0) {
            Tela.dialogEncontrou();;
            return this;
        } else {
            String novoNome = Tela.dialogInformaAnimalPensado();
            String caracteristica = Tela.dialogInformaCaractericaAnimal(novoNome, nomeAnimal);
            Animal novoAnimal = new Animal(novoNome);
            return new Tree(novoAnimal, this, caracteristica);
        
        }
    }

}
