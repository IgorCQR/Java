public class Condicionais {
    public static void main(String[] args) {
        var bool = false;
        var abc = 50;
        var nome = "SAS";

        if(nome.equals("Adamastor")) {
            System.out.println("Verdadeiro");
        } else if (nome.isBlank()){ //TERCEIRA OPCA: ELSE IF
            System.out.println("Tá vazio");
        }
        else {
            System.out.println("Falso");
        }
    }
}

