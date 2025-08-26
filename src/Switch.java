import java.util.Scanner; //copie retirando o Scanner
public class Switch {
    public static void main(String[] args) {
        System.out.print("Digite um numero: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        switch (numero) {
            case 0:
                System.out.println("Dado = 0");
                break; //utilize o BREAK para interromper o SWITCH
            case 1:
                System.out.println("Dado = 1");
                break;
        }
        System.out.println("Decisão com IF/ELSE");
        if(numero == 0){
            System.out.println("Dado informado = 0");
        }else if(numero == 1){
            System.out.println("Dado informado = 1");
        }else{
            System.out.println("Dado informado" + numero);
        }
    }
}
