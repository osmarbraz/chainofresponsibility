package com.chainofresponsibility.components;

/**
 * Componentes primitivos estão de bom tamanho com a implementação de ajuda
 * padrão.
 */
public class Button extends Component {

    /**
     * Construtor do componente.
     *
     * @param tooltipText Mensagem de ajuda contextual.
     */
    public Button(String tooltipText) {
        super(tooltipText);
    }
}
