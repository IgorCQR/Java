package Iteracao;
import java.util.Random;

public class Atividade05 {
    public static void main(String[] args){
    Random aleatorio = new Random();
    int contador = 4;
    float totalGasolina = 0;
    float QuantiTotalGaso = 0;
    float totalEtanol = 0;
    float QuantiTotalEta = 0;

    do{
        contador--;
        int combustivel = aleatorio.nextInt(2);
        float quantiCombus = aleatorio.nextFloat(1,40);
        if(combustivel == 1){
            totalGasolina += quantiCombus * 5;
            QuantiTotalGaso += quantiCombus;
        }else{
            QuantiTotalEta += quantiCombus;
            totalEtanol += quantiCombus * 4;
        }
    }while(contador > 0);
    float TotalFaturamento = totalEtanol + totalGasolina;
        System.out.println("Litros gasolina: " + String.format("%.2f",QuantiTotalGaso) + "L - Total etanol: "
                + String.format("%.2f",QuantiTotalEta) + "L");
        System.out.println("Faturamento gasolina R$" + String.format("%.2f",totalGasolina) +
                " - Faturamento etanol R$" + String.format("%.2f",totalEtanol));
        System.out.println("Faturamento total R$" + String.format("%.2f",TotalFaturamento));
    }
}
