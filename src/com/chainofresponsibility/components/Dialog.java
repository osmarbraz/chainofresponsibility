package com.chainofresponsibility.components;

import com.chainofresponsibility.container.Container;

/**
 * Mas componentes complexos podem sobrescrever a implementação padrão. Se o
 * texto de ajuda não pode ser fornecido de uma nova maneira, o componente pode
 * sempre chamar a implementação base (veja a classe Component).
 */
public class Dialog extends Container {

    private String wikiPageURL;

    public Dialog(String wikiPageURL) {
        super(null);
        this.wikiPageURL = wikiPageURL;
    }

    public void showHelp() {
        if (wikiPageURL != null) {
            // Mostra uma janela modal com texto de ajuda.            
            System.out.println("Ajuda:" + wikiPageURL);
        }
        super.showHelp();
    }
}
