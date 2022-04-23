package com.chainofresponsibility.components;

import com.chainofresponsibility.container.Container;

/**
 * A classe base para componentes simples.
 */
public abstract class Component implements ComponentWithContextualHelp {

    /**
     * Mensagem da ajuda contextual
     */
    private String tooltipText;

    /**
     * O contêiner do componente age como o próximo elo na cadeia de
     * responsabilidades do Handlers.
     */
    protected Container container;
    
    public Container getContainer() {
        return container;
    }
    public void setContainer(Container container) {
        this.container = container;
    }        
        
    /**
     * Construtor do componente.
     *
     * @param tooltipText Mensagem de ajuda contextual.
     */
    public Component(String tooltipText) {
        this.tooltipText = tooltipText;
    }

    /**
     * O componente mostra um tooltip (mensagem contextual) se há algum texto de
     * ajuda assinalado a ele. Do contrário ele passa a chamada adiante ao
     * contêiner, se ele existir.
     */
    public void showHelp() {
        if (tooltipText != null) {
            // Mostrar dica de contexto.
            System.out.println("Ajuda:" + tooltipText);
        } else {
            container.showHelp();
        }
    }
}
