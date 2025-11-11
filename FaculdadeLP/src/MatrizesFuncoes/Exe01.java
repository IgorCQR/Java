package MatrizesFuncoes;
import java.util.Random;

public class Exe01 {
    public static void main(String[] args){
        Random aleatorio = new Random();
        int[] valorUni = new int[10];
        int[] quanti = new int[10];
        String[] produtos = new String[10];
        int QuantiVendiTotal = 0;
        int faturamentoTotal = 0;
        int comissao = 0;
        int maior = 0;
        int faturamentoUnidade = 0;
        int IndiceMaior = 0;

        for(int i = 0; i < valorUni.length; i++){
            valorUni[i] = aleatorio.nextInt(10,201);
        }
        for(int i = 0; i < quanti.length; i++){
            quanti[i] = aleatorio.nextInt(1,13);
        }
        FimdoDia(quanti,valorUni);
    }
    public static int[] FimdoDia(int[] quanti,int[] valorUni){
        int QuantiVendiTotal = 0;
        int faturamentoTotal = 0;
        int comissao = 0;
        int maior = 0;
        int faturamentoUnidade = 0;
        int IndiceMaior = 0;
        for(int i = 0; i < 10; i++){
            QuantiVendiTotal += quanti[i];
            faturamentoTotal += quanti[i] * valorUni[i];
            faturamentoUnidade = quanti[i] * valorUni[i];
            if(quanti[i] > maior){
                maior = quanti[i];
                IndiceMaior = i;
            }
            System.out.println("Valor unitário: " + valorUni[i] + " - Quantidade: " + quanti[i] +
                    " - Faturamento: " + faturamentoUnidade);
        }
        comissao = faturamentoTotal / 2;
        System.out.println("Maior venda: " + maior + " - Indice: " + IndiceMaior);
        System.out.println("Comissão do vendedor: " + comissao + " - Salario total: " + (comissao + 500));
        System.out.println("Faturamento total: " + faturamentoTotal + " - Total vendido: " + QuantiVendiTotal);
        return quanti;
    }
}
