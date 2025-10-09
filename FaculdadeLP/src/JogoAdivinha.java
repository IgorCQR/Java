import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class JogoAdivinha {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int sort = random.nextInt(20);
        int dig;

        do {
            dig= Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero de 1 a 20"));
            if(dig == sort){
                JOptionPane.showOptionDialog(null, "PARABÉNS, VOCÊ ACERTOU O NÚMERO", "Resultado",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, new Object[]{"OK!"}, "OK!");
                break;
            }else if(dig > sort){
                JOptionPane.showOptionDialog(null, "Você digitou um número maior. tente de novo", "Resultado",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, new Object[]{"OK!"}, "OK!");
            }else{
                JOptionPane.showOptionDialog(null, "Você digitou um número menor. tente de novo", "Resultado",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                        null, new Object[]{"OK!"}, "OK!");
            }
            System.out.println("Chute do usuario: " + dig);
        }while(true);
        System.out.println("Número sorteado: " + sort);
    }
}