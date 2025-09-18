import java.util.Random;
public class EstruturaWHILE {
    public static void main(String[] args){
        Random Randomico = new Random();

        int contador = 0;
        int codigo = 0;
        int quanti = 0;
        double valorUni = 0;
        double valorcompra = 0;
        double totalitem = 0;
        double valortotal = 0;

        while(contador < 4){
            contador++;
            codigo = Randomico.nextInt(5);
            quanti = Randomico.nextInt(12);
            switch (codigo){
                case 0:
                    valorUni = 20.45;
                    break;
                case 1:
                    valorUni = 14.90;
                    break;
                case 2:
                    valorUni = 18;
                    break;
                case 3:
                    valorUni = 34.10;
                    break;
                case 4:
                    valorUni = 6;
                }
                valorcompra = valorUni * quanti;
                totalitem += quanti;
                valortotal += valorcompra;

            System.out.println("Código do item: " + codigo + " Quantidade: " + quanti + " Valor por unidade: " +
                    valorUni + " Valor da compra: " + valorcompra);
        }
        System.out.println("Quantidade total de itens: " + totalitem);
        System.out.println("Valor total da compra: " + valortotal);
    }
}
