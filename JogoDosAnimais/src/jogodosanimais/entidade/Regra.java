/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais.entidade;

import javax.swing.JOptionPane;
import jogodosanimais.tela.Tela;

/**
 *
 * @author wlademir
 */
public class Regra {

    private final Caracteristica root;

    public Regra() {
        root = new Caracteristica("vive na agua");
        root.setDireita(new Animal("Macaco"));
        root.setEsquerda(new Animal("Tubarão"));
        root.getDireita().setSuperior(root);
        root.getEsquerda().setSuperior(root);
        root.setSuperior(root);
    }

    public No processo(No no) {
        if (eAninal(no)) {
            return no;
        }
        
        if (getTipoDecisao(no) == 0) {
            no = processo(no.esquerda);
            if (no != null) {
                if (getTipoDecisao(no) == 0) {
                    Tela.dialogEncontrou();
                } else {
                    adicionaNo(no, "e");
                }
            }
        } else {
            no = processo(no.direita);
            if (no != null) {
                if (getTipoDecisao(no) == 0) {
                    Tela.dialogEncontrou();
                } else {
                    adicionaNo(no, "d");
                }
            }
        }
        return null;
    }
       

    public int getTipoDecisao(No no) {
        if (eAninal(no)) {
            return Tela.dialogPerguntaSeAnimal(Animal.class.cast(no).getNomeAnimal());
        } else if (eCaracteristica(no)) {
            return Tela.dialogPerguntaCaracteristica(Caracteristica.class.cast(no).getNomeCaracterisitica());
        }
        return -1;
    }

    public void adicionaNo(No no, String direcao) {
        String animalVelho = Animal.class.cast(no).getNomeAnimal();
        String animalNovo = Tela.dialogInformaAnimalPensado();
        Animal animal = new Animal(animalNovo);
        String caracteristicaNova = Tela.dialogInformaCaractericaAnimal(animalNovo, animalVelho);
        Caracteristica caracteristica = new Caracteristica(caracteristicaNova);

        if (direcao.equals("e")) {
            
            no.getSuperior().setEsquerda(caracteristica);
        } else {
           
            no.getSuperior().setDireita(caracteristica);
        }
        animal.setSuperior(caracteristica);
        caracteristica.setSuperior(no);
        caracteristica.setEsquerda(animal);
        caracteristica.setDireita(no);
       
    }

    public Caracteristica getRoot() {
        return root;
    }

    public boolean eAninal(No no) {
        return no instanceof Animal;
    }

    public boolean eCaracteristica(No no) {
        return no instanceof Caracteristica;
    }

}
