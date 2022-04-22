package com.chainofresponsibility;

/**
 * Base da classe Componente.
 *
 * A interface do handler declara um método para a construção da corrente de
 * handlers. Ela também declara um método para executar um pedido(showhelp).
 */
public interface ComponentWithContextualHelp {

    /**
     * As subclasses implementarão esse método com implementações concretas.
     */
    public abstract void showHelp();

}
