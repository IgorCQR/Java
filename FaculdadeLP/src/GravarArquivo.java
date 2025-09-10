import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

public class GravarArquivo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String NomeArquivo = "log.txt"; //nome do arquivo e caminho
        try{ //executa o que pode dar erro
            FileWriter escritor = new FileWriter(NomeArquivo, true); //valores booleanos modificam a maneira
            //de salvar o arquivo (false [sobrescreve] true [adiciona ao arquivo])

            System.out.print("Digite a mensagem: ");
            escritor.write("\n" + input.nextLine());
            escritor.close();

            System.out.println("Mensagem " + NomeArquivo + " gravada com sucesso");
        } catch (IOException e) { //executa SE o erro ocorrer
            System.err.println("Não foi possivel escrever no arquivo " + e.getMessage()); //ERR (erro padrão); diferencia
            // mensagens normais de mensagens de erro

            e.printStackTrace();
        }

    }
}



