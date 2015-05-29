/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodosanimais.tela;

import javax.swing.JOptionPane;

/**
 *
 * @author wlademir
 */
public class Tela {

    public static int dialogApresentacaoInicial() {
        return JOptionPane.showConfirmDialog(
                null,
                "Pense em um Animal",
                "Animais",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
    }

    private static int dialogPergunta(String tipoInformacao, String pergunta) {

        return JOptionPane.showOptionDialog(
                null,
                pergunta,
                tipoInformacao,
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                OpcoesBotoesSimNao.values(),
                OpcoesBotoesSimNao.NAO);
    }

    public static int dialogPerguntaCaracteristica(String caracteristica) {
        StringBuilder pergunta = new StringBuilder();
        pergunta.append("O animal que você pensou ");
        pergunta.append(caracteristica);
        pergunta.append(" ?");
        return dialogPergunta("Caracteristica!", pergunta.toString());
    }

    public static int dialogPerguntaSeAnimal(String animal) {
        StringBuilder pergunta = new StringBuilder();
        pergunta.append("O animal que você pensou é ");
        pergunta.append(animal);
        pergunta.append(" ?");
        return dialogPergunta("Animal", pergunta.toString());
    }

    private static String dialoInputPergunta(String pegunta) {
        return JOptionPane.showInputDialog(null, pegunta);
    }

    public static String dialogInformaAnimalPensado() {

        StringBuilder pergunta = new StringBuilder();
        pergunta.append("Qual animal você pensou ");
        pergunta.append(" ?");
        return dialoInputPergunta(pergunta.toString());
    }

    public static String dialogInformaCaractericaAnimal(String animalNovo, String animalVelho) {
        StringBuilder pergunta = new StringBuilder();
        pergunta.append("Um(a) ");
        pergunta.append(animalNovo);
        pergunta.append("____ mas um(a) ");
        pergunta.append(animalVelho);
        pergunta.append(" não.");
        return dialoInputPergunta(pergunta.toString());
    }

    public static void dialogEncontrou() {
        JOptionPane.showMessageDialog(null, "Acertei novamente!");
    }

    enum OpcoesBotoesSimNao {

        SIM("Sim"),
        NAO("Não");

        private final String descricao;

        private OpcoesBotoesSimNao(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        @Override
        public String toString() {
            return getDescricao(); //To change body of generated methods, choose Tools | Templates.
        }

    }

    enum OpcoesBotoesOkCancelar {

        OK("Ok"),
        CANCELAR("Cancelar");

        private final String descricao;

        private OpcoesBotoesOkCancelar(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        @Override
        public String toString() {
            return getDescricao(); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
