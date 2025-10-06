package RepeticaoArray;
import java.util.ArrayList;
import java.util.List;

public class ForTradicional {
    public static void main(String[] args){
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Amora");
        frutas.add("Laranja");
        for(int i = 0; i < frutas.size(); i++){
            System.out.println("Indice " + i + ": " + frutas.get(i));
        }
    }
}

