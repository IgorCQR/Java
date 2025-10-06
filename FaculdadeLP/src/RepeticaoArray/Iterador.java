package RepeticaoArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterador {
    public static void main(String[] args){
        List<String> frutas = new ArrayList<>();
        frutas.add("Mamão");
        frutas.add("Bergamota");
        frutas.add("Pera");

        Iterator<String> iterador = frutas.iterator();
        
        while(iterador.hasNext()){
            String fruta = iterador.next();
            System.out.println(fruta);
            if(fruta.equals("Pera")){
                iterador.remove();
            }
        }
        System.out.println("Lista pós remoção: " + frutas);
    }
}
