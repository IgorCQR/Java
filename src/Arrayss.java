import java.util.Arrays;

public class Arrayss {
    public static void main(String[] args) {
        String[] Fruits = {"Banana", "Watermelon", "Apple", "Orange", "Coconut"};
        int[] NovoVetor = new int[10]; // Declarando APENAS o comprimento do Array (sem valores)

//        int NumbOFNumbers = Fruits.length; // tamanho do array

//        System.out.println(Fruits[0]); //exibe o numero do Array na posicao indicada

//        for(int i = 0; i < Fruits.length; i++){
//            System.out.println(Fruits[i]);
//        }

        Arrays.sort(Fruits); // alphabetical order

        Arrays.fill(Fruits,"Pineapple"); // transforms all variables into on
        for(String Fruit : Fruits){
            System.out.println(Fruit);
        }

    }
}
