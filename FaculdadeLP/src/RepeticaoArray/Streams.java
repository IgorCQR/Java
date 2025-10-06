package RepeticaoArray;

import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args){
        List<String> frutas = Arrays.asList("Banana", "Morango", "Jaca", "Laranja");
        frutas.stream()
                .filter(fruta ->fruta.startsWith("M"))
                .forEach(System.out::println);
    }
}
