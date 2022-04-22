package com.chainofresponsibility;

import java.util.LinkedList;
import java.util.List;

/**
 * Contêineres podem conter tanto componentes simples como outros contêineres
 * como filhos. As relações da corrente são definidas aqui. A classe herda o
 * comportamento showHelp de sua mãe.
 */
public abstract class Container extends Component {

    //Lista dos filhos componentes ou containers
    private List<Component> children = new LinkedList();

    /**
     * Construtor do container.
     *
     * @param tooltipText Mensagem de ajuda contextual.
     */
    public Container(String tooltipText) {
        super(tooltipText);
    }

    /**
     * Adiciona um componente filho ao conteiner.
     *
     * Constrói cadeias de objetos de conteiner e componentes.
     *
     * @param child
     */
    public void add(Component child) {
        children.add(child);
        child.container = this;
    }

    /**
     * Executa a verificação do próximo objeto na cadeia ou termina a travessia
     * se estivermos em último objeto na cadeia.
     */
    @Override
    public void showHelp() {
        // Mostra as mensagens dos filhos
        if (children != null) {
            for (Component item : children) {
                item.showHelp();
            }
        }
    }
}
