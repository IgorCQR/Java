package RepeticaoArray;
import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args){
        List<String> fruta = new ArrayList<>();
        fruta.add("Banana");
        fruta.add("Morango");
        fruta.add("Uva");
        fruta.add("Maracujá");

        for(String frutas: fruta){
            System.out.println(frutas);
        }
    }
}
