package com.chainofresponsibility.components;

import com.chainofresponsibility.container.Container;

/**
 * Mas componentes complexos podem sobrescrever a implementação padrão. Se o
 * texto de ajuda não pode ser fornecido de uma nova maneira, o componente pode
 * sempre chamar a implementação base (veja a classe Component).
 */
public class Panel extends Container {

    private String modalHelpText;

    public Panel(String modalHelpText) {
        super(null);
        this.modalHelpText = modalHelpText;
    }

    public void showHelp() {
        if (modalHelpText != null) {
            // Mostra uma janela modal com texto de ajuda.
            System.out.println("Ajuda:" + modalHelpText);
        }

        super.showHelp();
    }
}
