import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class GravarArquivo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        FileWriter arq = null;
        System.out.print("informe um número para gerar a tabuada: "); int numero = input.nextInt();
        arq = new FileWriter("tabada.txt");
        PrintWriter gravarArq = new PrintWriter(arq);
        gravarArq.printf("Tabuada do ", numero);

        for(int i = 1; i <= 10; i++){
            gravarArq.println( i + " x " + numero + " = " + numero*i);
        }
        
    }
}



