import javax.swing.JOptionPane;

public class ConfirmaSimNao {
    public static void main(String[] args){
        System.out.println("Joption Pane");
        //exibir caixa de dialogo de confirmação
        int resposta = JOptionPane.showConfirmDialog(
                null,               //componente pai (null para centralizar)
                "Deseja Continuar?",        //mensagem a ser exibida
                "Confirmação",                //titulo da janela
                JOptionPane.YES_NO_OPTION,          //opção de botão sim e não
                JOptionPane.QUESTION_MESSAGE        //icone de pergunta
        );

        //Você pode verificar a resposta do usuário (é opcional)
        if (resposta == JOptionPane.YES_OPTION) {
            System.out.println("O usuário clicou em Sim!");
        } else if (resposta == JOptionPane.NO_OPTION) {
            System.out.println("O usuário clicou em Não!");
        } else {
            System.out.println("O usuário fechou a janela.");
        }
    }
}
