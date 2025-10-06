package RepeticaoArray;
import java.util.ArrayList;
import java.util.List;

public class ForEach2 {
    public static void main(String[] args){
        List<String> frutas = new ArrayList<>();
        frutas.add("Jabuticaba");
        frutas.add("Framboesa");
        frutas.add("Kiwi");

        //Usando o metodo ForEach com uma expressao lambda
        frutas.forEach(fruta -> System.out.println(fruta));

        //Usando uma referencia de metodo
        frutas.forEach(System.out::println);
    }
}
