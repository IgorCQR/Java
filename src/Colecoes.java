public class Colecoes { // É possivel fazer vetor de qualquer tipo primitivo
    public static void main(String[] args) {
        int[] ValoresColecao = {1,2,3,4,5}; //Declarando uma coleção/vetor
        int[] NovoVetor = new int[10]; //Declarando APENAS o comprimento do vetor (sem valores)

        System.out.println(ValoresColecao.length); // tamanho do vetor
        System.out.println(ValoresColecao[0]); //exibe o numero do vetor na posicao indicada
    }
}
