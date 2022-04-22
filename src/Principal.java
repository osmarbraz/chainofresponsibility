
import com.chainofresponsibility.Button;
import com.chainofresponsibility.Dialog;
import com.chainofresponsibility.Panel;

public class Principal {

    public static void main(String[] args) {
        //Cria os botões   
        Button ok = new Button("Este botao Ok...");
        Button cancel = new Button("Este botao Cancelar...");

        // Cria o painel 1 e adiciona os botões
        Panel panel1 = new Panel("Este é o painel 1");
        panel1.add(ok);
        panel1.add(cancel);

        //Cria os botões   
        Button inserir = new Button("Este botao Inserir...");
        Button excluir = new Button("Este botao Excluir...");

        // Cria o painel 2 e adiciona os botões
        Panel panel2 = new Panel("Este é o painel 2");
        panel2.add(inserir);
        panel2.add(excluir);

        //Adiciona os painéis ao diálogo
        Dialog dialog = new Dialog("Dialogo documentacao em http://wikipage.com");
        dialog.add(panel1);
        dialog.add(panel2);

        // Utilizando a cadeia        
        // Imagine o que acontece aqui e pressiona F1 sobre o diálogo.        
        System.out.println("\nF1 Dialogo");
        dialog.showHelp();

        // Imagine o que acontece aqui e pressiona F1 sobre o botão Ok.        
        System.out.println("\nF1 botao Ok");
        ok.showHelp();
    }
}
