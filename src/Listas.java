import java.util.Scanner;
import java.util.*;//importção de TODOS os tipos de lista

public class Listas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> list = new ArrayList<>();//Trabalhando com lista que permite duplicatas
        list.add("Maça");
        list.add("Banana");
        list.add("Uva");
        list.add("Mamão");
        list.add("Melão");
        System.out.println("Elemento da lista: " + list.get(0));
        System.out.println("Lista Array completa: " + list);
        System.out.println("Set: " + list.contains("Morango"));//verifica a existencia de algo na lista(true/false)

        Set<String> settlistt = new HashSet<>();//Lista que não permite duplicatas
        settlistt.add("Pera");
        settlistt.add("Melancia");
        settlistt.add("Pera");
        settlistt.add("Maça");
        System.out.println("\nLista Hash completa: " + settlistt);

        Map<String, String> Listmap = new HashMap();//Lista CHAVE -> VALOR (os elementos podem ser de tipos diferentes)
        Listmap.put("Carlos", "Gerente");//CHAVE -> VALOR
        Listmap.put("Name", "Igor");
        System.out.println("\nLista HashMap: " + Listmap.get("Name"));//EXIBE o valor da chave; nunca o oposto
    }
}
