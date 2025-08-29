import java.util.Random;

public class JuntandoPalavras {
    public static void main(String[] args){
        Random rand = new Random();
        System.out.println("JUNTANDO PALAVRAS ALEATORIAS");
        String[] PalavrasUM = {"Tempestade", "Azul", "Garfo", "Submarino", "Festa", "Brilho", "Silêncio", "Fantasma", "Rápido"};
        String[] PalavrasDOIS = {"Passarinho", "Escada", "Deserto", "Segredo", "Melodia", "Cachoeira", "Espelho", "Pedra", "Tesouro", "Fogueira"};
        String[] PalavrasTRES = {"Silhueta", "Raiz", "Brisa", "Oceano", "Caminho", "Universo", "Lâmpada", "Teia", "Sussurro", "Poeira", "Chave"};

        int tamanhoPalaUM = PalavrasUM.length;
        int tamanhoPalaDOIS = PalavrasDOIS.length;
        int tamanhoPalaTRES = PalavrasTRES.length;

        int rand1 = rand.nextInt(tamanhoPalaUM);
        int rand2 = rand.nextInt(tamanhoPalaDOIS);
        int rand3 = rand.nextInt(tamanhoPalaTRES);

        System.out.println(PalavrasUM[rand1] + " " + PalavrasDOIS[rand2] + " " + PalavrasTRES[rand3]);
    }
}
