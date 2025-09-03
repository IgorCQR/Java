import java.util.*;

public class Arrays_Listas {
    public static void main(String[] args){
       List <String> frutas = new ArrayList<>();
       frutas.add("Maçã");
       frutas.add("Caju");
       frutas.add("Morango");
       frutas.add("Abacaxi");
       frutas.add("Banana");
       frutas.add("Melancia");
       frutas.add("Amora");
       frutas.add("Uva");

       System.out.println("EXIBICAO toSTRING: ");
       System.out.println(frutas);

       System.out.println("\nEXIBICAO COM FOR: ");
       for (int i = 0; i < frutas.size(); i++){
           System.out.println(frutas.get(i));
       }
    }
}
